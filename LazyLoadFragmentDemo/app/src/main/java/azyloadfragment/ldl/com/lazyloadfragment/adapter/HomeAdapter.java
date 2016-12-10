package azyloadfragment.ldl.com.lazyloadfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/9/21.
 */
public class HomeAdapter extends FragmentStatePagerAdapter{
    private List<Fragment> mFragments;
    private String[] mTitles;
    public HomeAdapter(FragmentManager fm,List<Fragment> fragments,String[] title) {
        super(fm);
        this.mFragments=fragments;
        mTitles= title;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return  mFragments.size();
    }
}
