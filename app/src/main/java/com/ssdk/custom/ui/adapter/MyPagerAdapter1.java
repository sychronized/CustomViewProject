package com.ssdk.custom.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by zlc on 2018/7/16.
 */

public class MyPagerAdapter1 extends FragmentStatePagerAdapter{

    private List<Fragment> mFragments;
    private String[] mTitles;
    public MyPagerAdapter1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments != null ? mFragments.size() : 0;
    }


    public void setFragments(List<Fragment> fragments) {
        mFragments = fragments;
    }

    public void setTitles(String[] titles){
        this.mTitles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles != null ? mTitles[position] : "";
    }
}
