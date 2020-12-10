package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import com.gyf.barlibrary.ImmersionBar;

public class BaseActivity extends AppCompatActivity {
    private ImmersionBar mImmersionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        //设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //状态栏
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.
//                        fitsSystemWindows(true).//防止导航蓝和布局重叠
        statusBarDarkFont(true)
                .keyboardEnable(true)  //解决软键盘与底部输入框冲突问题，默认为false，还有一个重载方法，可以指定软键盘mode
                .keyboardMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE).init(); //单独指定软键盘模式
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mImmersionBar != null)
            mImmersionBar.destroy();  //必须调用该方法，防止内存泄漏，不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态
    }
}
