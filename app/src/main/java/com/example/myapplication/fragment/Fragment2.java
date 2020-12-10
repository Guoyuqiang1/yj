package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.coxtexts.CustomViewPager;
import com.example.myapplication.coxtexts.FuLiRootAdapter1;
import com.example.myapplication.coxtexts.FuLiRootAdapter2;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {
    TextView texttitle;
    ImageView cacle;
    ImageView tag;
    TextView pwd;
    ImageView caclex;
    ImageView qqlogin;
    Button zxuser;
    View view;
    SlidingTabLayout stl_fuli;
    CustomViewPager vp_fuli;
    private FuLiRootAdapter2 mPagerAdapter;
    private List<Fragment> mFragmentList;



    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, null);

        stl_fuli=(SlidingTabLayout)view.findViewById(R.id.stl_fuli);
        vp_fuli=(CustomViewPager) view.findViewById(R.id.vp_fuli);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new FXTab1());
        mFragmentList.add(new FXTab2());
        mFragmentList.add(new FXTab3());
        setViewpager();
        return view;
    }
    private void setViewpager() {
        vp_fuli.setCanScroll(true);
        vp_fuli.setOffscreenPageLimit(6);
        mPagerAdapter = new FuLiRootAdapter2(getChildFragmentManager(), mFragmentList);
        vp_fuli.setAdapter(mPagerAdapter);
        stl_fuli.setViewPager(vp_fuli);
    }
}
