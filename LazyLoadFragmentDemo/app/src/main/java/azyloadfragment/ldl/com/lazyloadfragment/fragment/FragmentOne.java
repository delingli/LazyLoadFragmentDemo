package azyloadfragment.ldl.com.lazyloadfragment.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import azyloadfragment.ldl.com.lazyloadfragment.R;
import azyloadfragment.ldl.com.lazyloadfragment.activity.ToolBarActivity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class FragmentOne extends BaseFragment {

    @Override
    protected void initView(View view) {

    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_one;
    }

    @Override
    protected void loadData() {
        Log.i("LoadData","FragmentOne加载数据了");
    }
}
