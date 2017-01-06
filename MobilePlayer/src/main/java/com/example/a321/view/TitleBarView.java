package com.example.a321.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a321.R;

/**
 * Created by 皇 上 on 2017/1/6.
 */

public class TitleBarView extends LinearLayout implements View.OnClickListener{

    private final Context mContext;
    private TextView tv_sousuo;
    private RelativeLayout rl_game;
    private ImageView iv_jilu;

    public TitleBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
//        tv_sousuo = (TextView) findViewById(R.id.tv_sousuo);
//        rl_game= (RelativeLayout) findViewById(R.id.rl_game);
//        iv_jilu = (ImageView) findViewById(R.id.iv_jilu);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tv_sousuo = (TextView) getChildAt(1);
        rl_game = (RelativeLayout) getChildAt(2);
        iv_jilu = (ImageView) getChildAt(3);

        tv_sousuo.setOnClickListener(this);
        iv_jilu.setOnClickListener(this);
        rl_game.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_game:
                Toast.makeText(mContext,"游戏",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_sousuo:
                Toast.makeText(mContext,"搜索",Toast.LENGTH_SHORT).show();

                break;
            case R.id.iv_jilu:
                Toast.makeText(mContext,"记录",Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
