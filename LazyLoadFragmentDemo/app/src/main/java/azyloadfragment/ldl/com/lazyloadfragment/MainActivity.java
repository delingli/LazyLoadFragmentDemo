package azyloadfragment.ldl.com.lazyloadfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import azyloadfragment.ldl.com.lazyloadfragment.adapter.HomeAdapter;
import azyloadfragment.ldl.com.lazyloadfragment.fragment.FragmentOne;
import azyloadfragment.ldl.com.lazyloadfragment.fragment.FragmentThree;
import azyloadfragment.ldl.com.lazyloadfragment.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTablayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
private String[] titles=new String[]{"A","B","C"};
   private List<Fragment> mFragments;
    private void initView() {
        mFragments=new ArrayList<>();
        mFragments.add(new FragmentOne());
        mFragments.add(new FragmentTwo());
        mFragments.add(new FragmentThree());
        mTablayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        HomeAdapter adapter=new HomeAdapter(getSupportFragmentManager(),mFragments,titles);
        mViewPager.setAdapter(adapter);
        mTablayout.setupWithViewPager(mViewPager);
    }

    private void initData() {
    }
}
