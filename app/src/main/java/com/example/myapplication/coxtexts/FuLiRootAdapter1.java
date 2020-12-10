package com.example.myapplication.coxtexts;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;


public class FuLiRootAdapter1 extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private String[] title;

    public FuLiRootAdapter1(FragmentManager fm, List<Fragment> ll) {
        super(fm);
        this.fragmentList = ll;

            title = new String[]{"热门", "女神","男神","点唱","电台","陪玩"};

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
