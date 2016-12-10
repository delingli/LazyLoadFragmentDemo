package azyloadfragment.ldl.com.lazyloadfragment.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import azyloadfragment.ldl.com.lazyloadfragment.R;

public class ToolBarActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        mToolBar = (Toolbar) findViewById(R.id.toolBar);
        initView();
    }

    private void initView() {
        //// App Logo
    mToolBar.setLogo(R.mipmap.ic_launcher);
        mToolBar.setTitle("主题");
        mToolBar.setSubtitle("Sub Title");
        setSupportActionBar(mToolBar);
        //放在setSupportActionBar后
        mToolBar.setNavigationIcon(R.mipmap.ic_launcher);
    }
}
