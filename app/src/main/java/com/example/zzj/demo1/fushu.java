package com.example.zzj.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class fushu extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fushu);

        Button btn1=(Button)findViewById(R.id.xq);
        //给btn1绑定监听事件
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给bnt1添加点击响应事件
                Intent intent =new Intent(fushu.this,sheBeiXiangQing.class);
                //启动
                startActivity(intent);
            }
        });

    }
}
