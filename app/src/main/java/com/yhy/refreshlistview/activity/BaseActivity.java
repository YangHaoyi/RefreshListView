package com.yhy.refreshlistview.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.yhy.refreshlistview.R;


/**
 *
 *
 * @author Johan.H
 *
 */
public abstract class BaseActivity extends FragmentActivity {

    private Toast toast;
    private SharedPreferences mySharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // 显示提示信息
    protected void showToast(String message) {
//        new JMessageNotice(this,message).show();
    }

    private View coverWhite;
    public void addCoverWhite(FrameLayout room) {
        coverWhite = this.getLayoutInflater()
                .inflate(R.layout.v2_comp_coverlayerwhite, null);
        coverWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        if (null!=room)
            room.addView(coverWhite);
    }

    public void removeCoverWhite(FrameLayout room) {
        if (null != coverWhite&&null!=room)
            room.removeView(coverWhite);
    }
    @Override
    protected void onResume() {
        super.onResume();

    }
}
