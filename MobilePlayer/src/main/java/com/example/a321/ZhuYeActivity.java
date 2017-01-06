package com.example.a321;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.a321.base.BaseFragment;
import com.example.a321.fragment.BdAudioFragment;
import com.example.a321.fragment.BdVideoFragment;
import com.example.a321.fragment.NetAudioFragment;
import com.example.a321.fragment.NetVideoFragment;

import java.util.ArrayList;

public class ZhuYeActivity extends AppCompatActivity {

    private RadioGroup rg_main;
    private ArrayList<BaseFragment> fragments;
    //Fragment页面的下标
    private int position;
    //缓存的Fragment
    private Fragment tempFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_ye);
        rg_main = (RadioGroup) findViewById(R.id.rg_main);

        initFragment();

        initListener();
    }

    private void initListener() {
        //设置radiobutton选中状态变化的监听
        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_bd_video:
                        position = 0;
                        break;
                    case R.id.rb_bd_audio:
                        position = 1;
                        break;
                    case R.id.rb_net_video:
                        position = 2;
                        break;
                    case R.id.rb_net_audio:
                        position = 3;
                        break;
                }
                Fragment currrntFragment = fragments.get(position);
                switchFragment(currrntFragment);
            }
        });
        //默认选中本地视频
        rg_main.check(R.id.rb_bd_video);
    }

    private void switchFragment(Fragment currrntFragment) {

        if(tempFragment != currrntFragment) {
            //开启实务
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            //切换
            if(currrntFragment != null) {
                //是否添加过
                if(!currrntFragment.isAdded()) {
                    //原来的隐藏
                    if(tempFragment != null) {
                        ft.hide(tempFragment);
                    }
                    //若没有添加就添加
                    ft.add(R.id.fl_content,currrntFragment);
                }else{
                    //隐藏原来的
                    if(tempFragment != null) {
                        ft.hide(tempFragment);
                    }
                    //添加的直接显示出来
                    ft.show(currrntFragment);
                }
                    //提交
                ft.commit();
            }
            tempFragment = currrntFragment;
        }
    }


    //初始化顺序 要求按照布局先后顺序完成
    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new BdVideoFragment());
        fragments.add(new BdAudioFragment());
        fragments.add(new NetVideoFragment());
        fragments.add(new NetAudioFragment());
    }
}
