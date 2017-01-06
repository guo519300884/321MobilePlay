package com.example.a321.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a321.base.BaseFragment;

/**
 * Created by 皇 上 on 2017/1/6.
 */

public class BdAudioFragment extends BaseFragment {

    private ImageView imageView;
    private TextView textView;
    @Override
    public View initView() {
        imageView = new ImageView(mContext);
        textView = new TextView(mContext);

//        imageView.setBackgroundResource(R.drawable.sgg0);

        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(30);
        textView.setTextColor(Color.RED);
//        return imageView;
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("朕的江山岂容尔等胡作非为");
    }
}
