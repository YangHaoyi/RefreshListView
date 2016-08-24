package com.yhy.refreshlistview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.yhy.refreshlistview.R;
import com.yhy.refreshlistview.adapter.ChargingOrdersAdapter;
import com.yhy.refreshlistview.data.ChargingOrders;
import com.yhy.refreshlistview.data.ResponseDataBean;
import com.yhy.refreshlistview.network.KoraRestClient;
import com.yhy.refreshlistview.util.YhyLog;
import com.yhy.refreshlistview.xlistview.XListView;

import org.apache.http.Header;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 : YangHaoyi on 2016/8/23.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class RefreshListViewActivity extends BaseActivity {

    private static final String FROM_FIRST = "first";
    private static final String FROM_FRESH = "fresh";
    private static final String FROM_LOAD = "load";

    private XListView refreshView;
    private FrameLayout room;
    private int m_count_per_page = 12;
    private ChargingOrdersAdapter chargingOrdersAdapter;
    private int m_page2 =0 ;
    private List<ChargingOrders.PayloadBean.ListBean> refreshList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        YhyLog.init(true,"YhyLog");
        init();
        refreshData(FROM_FIRST);
        setListener();
    }

    private void init() {
        room = (FrameLayout) findViewById(R.id.room);
        refreshView = (XListView) findViewById(R.id.refreshList);
        initListView(refreshView);
    }
    private void initListView(XListView xListView){
        xListView.setPullLoadEnable(false);
        xListView.setXListViewListener(listener);
        xListView.setPullRefreshEnable(true);
    }
    XListView.IXListViewListener listener = new XListView.IXListViewListener() {
        @Override
        public void onRefresh() {
            refreshView.setPullLoadEnable(false);
            m_page2 = 0;
            refreshData(FROM_FRESH);
        }

        @Override
        public void onLoadMore() {
            m_page2++;
            refreshData(FROM_LOAD);
        }

        @Override
        public void toRequest(int page, int countPerPage) {

        }
    };
    private void refreshData(final String from){
        if(from.equals(FROM_FIRST)){
            addCoverWhite(room);
        }
        KoraRestClient client = KoraRestClient.getInstance(this.getApplicationContext());
        String url;
        String countPerPage = String.valueOf(m_count_per_page);
        String page = String.valueOf(m_page2);
        url = String.format("http://mg-test.evershare.cn:9902/api/v1/charging_orders?phoneNo=13998394320&status=112&pageSize=%s&currentPage=%s",countPerPage,page);
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
                String rawData = new String(arg2);
                YhyLog.json(rawData);
                Gson gson = new Gson();
                ChargingOrders data = gson.fromJson(rawData, ChargingOrders.class);
                refreshView.stopLoadMore();
                refreshView.stopRefresh();
                if (isCodeSuccess(data)) {
                    if (refreshList == null) {
                        refreshList = new ArrayList<ChargingOrders.PayloadBean.ListBean>();
                    }
                    hideLoading(from);
                    setAdapter(data, from);
                    setLoadMore(data, from);
                } else {
                }
            }
            @Override
            public void onFailure(int arg0, Header[] arg1, byte[] arg2, Throwable arg3) {
                refreshView.stopLoadMore();
                refreshView.stopRefresh();
                hideLoading(from);
                Toast.makeText(RefreshListViewActivity.this,"连接失败",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void hideLoading(String from){
        if(from.equals(FROM_FIRST)){
            removeCoverWhite(room);
        }
    }
    private boolean isCodeSuccess(ChargingOrders data){
        if(data!=null&& ResponseDataBean.CODE.SUCCESS==data.getCodeMsg()){
            return true;
        }
        return false;
    }
    private void setLoadMore(ChargingOrders data,String from){
        if (isCanLoadMore(data)) {
            refreshView.setPullLoadEnable(false);
        } else {
            refreshView.setPullLoadEnable(true);
        }
    }
    private void setAdapter(ChargingOrders data,String from){
        if (chargingOrdersAdapter == null) {
            chargingOrdersAdapter = new ChargingOrdersAdapter(RefreshListViewActivity.this, 2,refreshList);
            refreshView.setAdapter(chargingOrdersAdapter);
        }
        if(data.getPayload().getList() != null){
            if (from.equals(FROM_LOAD)) {
                refreshList.addAll(data.getPayload().getList());
            } else {
                refreshList.clear();
                refreshList.addAll(data.getPayload().getList());
            }
        }
        chargingOrdersAdapter.setData(refreshList, 2);
    }
    private void setListener(){
        refreshView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long time) {
                Intent intent = new Intent(RefreshListViewActivity.this,ItemClickActivity.class);
                startActivity(intent);
            }
        });
    }
    private boolean isCanLoadMore(ChargingOrders data){
        if(data.getPayload().getList() != null && data.getPayload().getList().size() < 1){
            return true;
        }
        return false;
    }
}
