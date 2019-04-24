package com.example.zzj.demo1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WeixinFragment extends Fragment {

    //下拉列表
    private ArrayList<Group> gData = null;
    private ArrayList<ArrayList<Item>> iData = null;
    private ArrayList<Item> lData = null;
    private Context mContext;
    private ExpandableListView exlist_lol;
    private MyBaseExpandableListAdapter myAdapter = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1, container, false);
        //下拉列表
        mContext = this.getContext();
        exlist_lol = (ExpandableListView)view.findViewById(R.id.exlist_lol);

        //数据准备
        gData = new ArrayList<Group>();
        iData = new ArrayList<ArrayList<Item>>();
        gData.add(new Group("分组1"));
        gData.add(new Group("分组2"));
        gData.add(new Group("分组3"));

        lData = new ArrayList<Item>();

        //分组1
        lData.add(new Item(R.mipmap.iv_lol_icon3,"设备001"));
        lData.add(new Item(R.mipmap.iv_lol_icon4,"设备002"));
        lData.add(new Item(R.mipmap.iv_lol_icon13,"设备003"));
        iData.add(lData);
        //分组2
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.iv_lol_icon1, "设备004"));
        lData.add(new Item(R.mipmap.iv_lol_icon7, "设备005"));
        lData.add(new Item(R.mipmap.iv_lol_icon8, "设备006"));
        iData.add(lData);
        //分组3
        lData = new ArrayList<Item>();
        lData.add(new Item(R.mipmap.iv_lol_icon2, "设备007"));
        lData.add(new Item(R.mipmap.iv_lol_icon5, "设备008"));
        lData.add(new Item(R.mipmap.iv_lol_icon6, "设备009"));
        iData.add(lData);

        myAdapter = new MyBaseExpandableListAdapter(gData,iData,mContext);
        exlist_lol.setAdapter(myAdapter);

        //为列表设置点击事件
        exlist_lol.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if (groupPosition==0 && childPosition==0) {
                    Intent intent = new Intent(getActivity(), sheBeiXiangQing.class);
                    startActivity(intent);
                }
                return true;
            }
        });


        return view;
    }

}
