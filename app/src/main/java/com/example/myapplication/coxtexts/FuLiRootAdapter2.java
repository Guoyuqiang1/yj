package com.example.myapplication.coxtexts;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created on 2018-12-07  17:49
 * Description:
 *
 * @author ccc
 */
public class FuLiRootAdapter2 extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private String[] title;

    public FuLiRootAdapter2(FragmentManager fm, List<Fragment> ll) {
        super(fm);
        this.fragmentList = ll;

            title = new String[]{"发现", "最新","关注"};

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
