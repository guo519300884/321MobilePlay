package com.example.a321.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.a321.base.BaseFragment;

/**
 * Created by 皇 上 on 2017/1/6.
 */

public class BdVideoFragment extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {

        textView = new TextView(mContext);
        //设置颜色
        textView.setTextColor(Color.BLUE);
        //设置大小
        textView.setTextSize(30);
        //设置重心
        textView.setGravity(Gravity.CENTER);
        return this.textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("本地视频");
    }
}
