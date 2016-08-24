package com.yhy.refreshlistview.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yhy.refreshlistview.R;
import com.yhy.refreshlistview.data.ChargingOrders;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 作者 : YangHaoyi on 2016/7/25.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class ChargingOrdersAdapter extends BaseAdapter{
    private List<ChargingOrders.PayloadBean.ListBean> data;
    private LayoutInflater mInflater = null;
    private Context mycontext;
    private SimpleDateFormat sf;
    private int type;

    public ChargingOrdersAdapter(Context context, int type,List<ChargingOrders.PayloadBean.ListBean> data) {
        // 根据context上下文加载布局
        this.mInflater = LayoutInflater.from(context);
        mycontext = context.getApplicationContext();
        this.type = type;
        this.data = data;
        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public int getCount() {
        // 在此适配器中所代表的数据集中的条目数
        if (data == null) {
            return 0;
        }
        System.out.println("dataSize_is"+data.size());
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // 获取数据集中与指定索引对应的数据项
        return position;
    }

    @Override
    public long getItemId(int position) {
        // 获取在列表中与指定索引对应的行id
        return position;
    }

    // 获取一个在数据集中指定索引的视图来显示数据
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        // 如果缓存convertView为空，则需要创建View
        if (convertView == null) {
            holder = new ViewHolder();
             if (type == 2) {
                // 根据自定义的充电Item布局加载布局
                convertView = mInflater.inflate(R.layout.order_item_charging_history, null);
                holder.time = (TextView) convertView.findViewById(R.id.textview_time);
                holder.main_name = (TextView) convertView.findViewById(R.id.textview_main_name);
                holder.price = (TextView) convertView.findViewById(R.id.textview_price);
                holder.sub_name = (TextView) convertView.findViewById(R.id.textview_sub_name);
                holder.status = (TextView) convertView.findViewById(R.id.textview_status);
            }
            // 将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

            if (!"".equals(data.get(position).getStatus()) && data.get(position).getStatus() != null) {
                if (data.get(position).getStatus().equals("1")) {
                    holder.status.setText("");
                    holder.status.setTextColor(mycontext.getResources().getColor(R.color.transparent));
                } else if (data.get(position).getStatus().equals("2")) {
                    holder.status.setText("");
                    holder.status.setTextColor(mycontext.getResources().getColor(R.color.transparent));
                } else if (data.get(position).getStatus().equals("4")) {
                    holder.status.setText("");
                    holder.status.setTextColor(mycontext.getResources().getColor(R.color.transparent));
                } else if (data.get(position).getStatus().equals("8")) {
                    holder.status.setText("");
                    holder.status.setTextColor(mycontext.getResources().getColor(R.color.transparent));
                } else if (data.get(position).getStatus().equals("16")) {
                    holder.status.setText("已完成");
                    holder.status.setBackground(mycontext.getResources().getDrawable(R.drawable.bg_order_status_green));
                } else if (data.get(position).getStatus().equals("32")) {
                    holder.status.setText("已取消");
                    holder.status.setBackground(mycontext.getResources().getDrawable(R.drawable.bg_order_status_gray));
                } else if (data.get(position).getStatus().equals("64")) {
                    holder.status.setText("已超时");
                    holder.status.setBackground(mycontext.getResources().getDrawable(R.drawable.bg_order_status_gray));
                }
            }

            holder.main_name.setText(cancelNull(data.get(position).getRentalShop().getName()));
            holder.sub_name.setText(cancelNull(data.get(position).getElePile().getAnchorName()));
//            if (data.get(position).getStatus().equals("16")) {
//                // 已完成订单
//                if (!"".equals(cancelNull(data.get(position).getDisbursements()))) {
//                    holder.price.setText("￥" + data.get(position).getDisbursements());
//                } else {
//                    holder.price.setText("");
//                }
//            } else {
//                holder.price.setText("￥0.00");
//            }
            holder.price.setText("￥0.0"+position);

            if (!TextUtils.isEmpty(data.get(position).getOrderStartTime())) {
                holder.time.setText(sf.format(new Date(Long.parseLong(data.get(position).getOrderStartTime()))));
            } else {
                holder.time.setText("");
            }

        return convertView;
    }

    public List<ChargingOrders.PayloadBean.ListBean> getData() {
        return data;
    }

    public void setData(List<ChargingOrders.PayloadBean.ListBean> data, int type) {
        this.type = type;
        this.data = data;
        this.notifyDataSetChanged();
    }

    /**
     * 去除Null显示
     *
     * @param string
     *            原字符串
     * @return 处理后结果
     */
    public String cancelNull(String string) {
        if (string == null || "null".equals(string)) {
            return "";
        } else {
            return string;
        }
    }

    // ViewHolder静态类
    private class ViewHolder {
        public TextView time;
        public TextView status;
        public TextView price;
        public TextView main_name;
        public TextView sub_name;

    }

}
