package com.example.zzj.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class sheBeiXiangQing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xq1);
        Button btn1=(Button)findViewById(R.id.chakanxiaoxi);
             //给btn1绑定监听事件
        btn1.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            // 给bnt1添加点击响应事件
            Intent intent =new Intent(sheBeiXiangQing.this,chakanxiaoxi.class);
            //启动
            startActivity(intent);
        }
        });

        Button btn2=(Button)findViewById(R.id.xiugai);
        //给btn1绑定监听事件
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(sheBeiXiangQing.this,xiuGaiZiLiao.class);
                //启动
                startActivity(intent);
            }
        });

        Button btn3=(Button)findViewById(R.id.guanli);
        //给btn1绑定监听事件
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(sheBeiXiangQing.this,guanli.class);
                //启动
                startActivity(intent);
            }
        });

        Button btn4=(Button)findViewById(R.id.fushu);
        //给btn1绑定监听事件
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(sheBeiXiangQing.this,fushu.class);
                //启动
                startActivity(intent);
            }
        });
    }

}
