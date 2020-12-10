package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.fragment.Fragment1;
import com.example.myapplication.fragment.Fragment2;
import com.example.myapplication.fragment.Fragment3;
import com.example.myapplication.fragment.Fragment4;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    LinearLayout shop;
    LinearLayout say;
    LinearLayout code;
    LinearLayout user;
    Fragment1 fragment1 = null;
    Fragment2 fragment2 = null;
    Fragment3 fragment3 = null;
    Fragment4 fragment4 = null;
    FragmentManager fragmentManager;
    TextView sytext;
    TextView gztext;
    TextView xxtext;
    TextView wdtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //第一次进入初始化选择第一个页面
        selectFragment(0);
        one.setImageDrawable(getResources().getDrawable(R.mipmap.dqh));
    }

    private void initView() {
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        shop=(LinearLayout)findViewById(R.id.shop);
        say=(LinearLayout)findViewById(R.id.say);
        code=(LinearLayout)findViewById(R.id.code);
        user=(LinearLayout)findViewById(R.id.user);

        sytext=(TextView)findViewById(R.id.sytext);
        gztext=(TextView)findViewById(R.id.gztext);
        wdtext=(TextView)findViewById(R.id.wdtext);
        xxtext=(TextView)findViewById(R.id.xxtext);

        shop.setOnClickListener(this);
        say.setOnClickListener(this);
        code.setOnClickListener(this);
        user.setOnClickListener(this);
    }

    private void selectFragment(int i) {
        //创建fragment
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        switch (i) {
            case 0:
                //如果tabFragment1为空，说明还没创建Tab1
                if (fragment1 == null) {
                    //创建全部Fragment页面
                    fragment1 = new Fragment1();
                    fragment2 = new Fragment2();
                    fragment3 = new Fragment3();
                    fragment4 = new Fragment4();

                }
                //如果isAdded == true 表示 tab1 已加入布局中
                if (!fragment1.isAdded()) {
                    //全部添加并隐藏剩余页面，显示显示页面
                    transaction.add(R.id.frameLayout, fragment1);
                    transaction.add(R.id.frameLayout, fragment2);
                    transaction.add(R.id.frameLayout, fragment3);
                    transaction.add(R.id.frameLayout, fragment4);
                    transaction.hide(fragment2).hide(fragment3).hide(fragment4);
                    transaction.show(fragment1);
                } else {
                    //再次切换此页面执行下面代码
                    if (fragment2 != null&&fragment3 != null&&fragment4!=null) {
                        transaction.hide(fragment2).hide(fragment3).hide(fragment4);
                    }
                    //Log.v("rush_yu", "hh");
                    //显示tab1
                    transaction.show(fragment1);
                }

                break;
            case 1:
                //如果tabFragment2为空，说明还没创建Tab2
                if (fragment2 == null) {
                    fragment1 = new Fragment1();
                    fragment2 = new Fragment2();
                    fragment3 = new Fragment3();
                    fragment4 = new Fragment4();
                }
                //如果isAdded == true 表示 tab2 已加入布局中
                if (!fragment2.isAdded()) {
                    transaction.add(R.id.frameLayout, fragment1);
                    transaction.add(R.id.frameLayout, fragment2);
                    transaction.add(R.id.frameLayout, fragment3);
                    transaction.add(R.id.frameLayout, fragment4);
                    transaction.hide(fragment1).hide(fragment3).hide(fragment4);
                    transaction.show(fragment2);
                } else {
                    //如果tab1不为空，把tab1隐藏就是、
                    if (fragment1 != null && fragment3 != null&&fragment4!=null) {
                        transaction.hide(fragment1).hide(fragment3).hide(fragment4);
                    }
                    //Log.v("rush_yu", "hh");
                    //显示tab2
                    transaction.show(fragment2);
                }
                break;
            case 2:
                //如果tabFragment3为空，说明还没创建Tab3
                if (fragment3 == null) {
                    fragment1 = new Fragment1();
                    fragment2 = new Fragment2();
                    fragment3 = new Fragment3();
                    fragment4 = new Fragment4();
                }
                //如果isAdded == true 表示 tab3 已加入布局中
                if (!fragment3.isAdded()) {
                    transaction.add(R.id.frameLayout, fragment1);
                    transaction.add(R.id.frameLayout, fragment2);
                    transaction.add(R.id.frameLayout, fragment3);
                    transaction.add(R.id.frameLayout, fragment4);
                    transaction.hide(fragment1).hide(fragment2).hide(fragment4);
                    transaction.show(fragment3);
                } else {
                    //如果tab1不为空，把tab1隐藏就是、
                    if (fragment1 != null && fragment2 != null&&fragment4!=null) {
                        transaction.hide(fragment1).hide(fragment2).hide(fragment4);
                    }

                    //Log.v("rush_yu", "hh");
                    //显示tab2
                    transaction.show(fragment3);
                }
                break;
            case 3:
                //如果tabFragment3为空，说明还没创建Tab3
                if (fragment4 == null) {
                    fragment1 = new Fragment1();
                    fragment2 = new Fragment2();
                    fragment3 = new Fragment3();
                    fragment4 = new Fragment4();
                }
                //如果isAdded == true 表示 tab3 已加入布局中
                if (!fragment4.isAdded()) {
                    transaction.add(R.id.frameLayout, fragment1);
                    transaction.add(R.id.frameLayout, fragment2);
                    transaction.add(R.id.frameLayout, fragment3);
                    transaction.add(R.id.frameLayout, fragment4);
                    transaction.hide(fragment1).hide(fragment2).hide(fragment3);
                    transaction.show(fragment4);
                } else {
                    //如果tab1不为空，把tab1隐藏就是、
                    if (fragment1 != null && fragment2 != null&&fragment3!=null) {
                        transaction.hide(fragment1).hide(fragment2).hide(fragment3);
                    }

                    //Log.v("rush_yu", "hh");
                    //显示tab2
                    transaction.show(fragment4);
                }
                break;
        }
        transaction.commit();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.shop:
                one.setImageDrawable(getResources().getDrawable(R.mipmap.dqh));
                two.setImageDrawable(getResources().getDrawable(R.mipmap.dw));
                three.setImageDrawable(getResources().getDrawable(R.mipmap.xx));
                four.setImageDrawable(getResources().getDrawable(R.mipmap.wd));
                selectFragment(0);

//                sytext.setTextColor(Color.parseColor("#FF108EE9"));
//                gztext.setTextColor(Color.parseColor("#33000000"));
//                xxtext.setTextColor(Color.parseColor("#33000000"));
//                wdtext.setTextColor(Color.parseColor("#33000000"));
                break;
            case R.id.say:

                one.setImageDrawable(getResources().getDrawable(R.mipmap.dq));
                two.setImageDrawable(getResources().getDrawable(R.mipmap.dwh));
                three.setImageDrawable(getResources().getDrawable(R.mipmap.xx));
                four.setImageDrawable(getResources().getDrawable(R.mipmap.wd));
                selectFragment(1);

//                sytext.setTextColor(Color.parseColor("#33000000"));
//                gztext.setTextColor(Color.parseColor("#FF108EE9"));
//                xxtext.setTextColor(Color.parseColor("#33000000"));
//                wdtext.setTextColor(Color.parseColor("#33000000"));

                break;
            case R.id.code:

                one.setImageDrawable(getResources().getDrawable(R.mipmap.dq));
                two.setImageDrawable(getResources().getDrawable(R.mipmap.dw));
                three.setImageDrawable(getResources().getDrawable(R.mipmap.xxh));
                four.setImageDrawable(getResources().getDrawable(R.mipmap.wd));
                selectFragment(2);
//                sytext.setTextColor(Color.parseColor("#33000000"));
//                gztext.setTextColor(Color.parseColor("#33000000"));
//                xxtext.setTextColor(Color.parseColor("#FF108EE9"));
//                wdtext.setTextColor(Color.parseColor("#33000000"));

                break;
            case R.id.user:
                one.setImageDrawable(getResources().getDrawable(R.mipmap.dq));
                two.setImageDrawable(getResources().getDrawable(R.mipmap.dw));
                three.setImageDrawable(getResources().getDrawable(R.mipmap.xx));
                four.setImageDrawable(getResources().getDrawable(R.mipmap.wdh));
                selectFragment(3);
//                sytext.setTextColor(Color.parseColor("#33000000"));
//                gztext.setTextColor(Color.parseColor("#33000000"));
//                xxtext.setTextColor(Color.parseColor("#33000000"));
//                wdtext.setTextColor(Color.parseColor("#FF108EE9"));
                break;
        }
    }
}
