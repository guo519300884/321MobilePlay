package com.example.a321.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.a321.base.BaseFragment;

/**
 * Created by 皇 上 on 2017/1/6.
 */

public class NetVideoFragment extends BaseFragment {

    private TextView textView;
    @Override
    public View initView() {
        textView = new TextView(mContext);

        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(30);

        return this.textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("网络视频");
    }
}
