package azyloadfragment.ldl.com.lazyloadfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/9/21.
 */
public abstract class BaseFragment extends Fragment {
    private boolean isViewCreated;
    private boolean isLoadDataComplete;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser&&!isLoadDataComplete&&isViewCreated){
isLoadDataComplete=true;
            loadData();}
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(getLayoutId(),container,false);
        initView(view);
        
        isViewCreated=true;
        return view;
    }

    protected abstract void initView(View view);

    protected abstract int getLayoutId() ;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getUserVisibleHint()&&!isLoadDataComplete){
            isLoadDataComplete=true;
            loadData();
        }
    }

    protected abstract void loadData() ;
}
