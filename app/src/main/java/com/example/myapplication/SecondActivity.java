package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.coxtexts.SharedPreferencesHelper;

import java.util.Timer;
import java.util.TimerTask;

public class SecondActivity extends BaseActivity {
    //测试环境
    String url="http://39.106.163.154:3131/";
    SharedPreferencesHelper sharedPreferencesHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //使用sp存储环境域名
        sharedPreferencesHelper = new SharedPreferencesHelper(
                SecondActivity.this, "anhua");
        sharedPreferencesHelper.put("url",url);



//      //倒计时跳转主页面
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //设置跳转
                Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent2);
                finish();
            }
        };
        //等待时间
        timer.schedule(task, 1000 * 2);
    }


}
