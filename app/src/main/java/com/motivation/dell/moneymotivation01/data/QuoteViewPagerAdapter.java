package com.motivation.dell.moneymotivation01.data;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.List;

public class QuoteViewPagerAdapter extends FragmentPagerAdapter {

    private View.OnClickListener onClickListener;

    /*private Context mContext;

    public QuoteViewPagerAdapter(final Context context) {
        this(mContext, null);
    }*/

    private List<Fragment> fragments;

    public QuoteViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return this.fragments.get(i);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

}
