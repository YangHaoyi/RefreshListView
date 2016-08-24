package com.yhy.refreshlistview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yhy.refreshlistview.R;

/**
 * 作者 : YangHaoyi on 2016/8/24.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class ItemClickActivity extends BaseActivity implements View.OnClickListener {
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        init();
    }

    private void init() {
        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                onBackPressed();
                break;
        }
    }
}
