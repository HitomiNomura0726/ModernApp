package com.wacode.yuki.modernapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by yuki on 2016/09/28.
 */
public class ExampleFragmentPagerAdapter extends FragmentPagerAdapter {
    public ExampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.newInstance(android.R.color.holo_blue_light);
            case 1:
                return ExampleFragment.newInstance(android.R.color.holo_green_light);

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }
}