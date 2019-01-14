package com.as.elemebehavior;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.as.elemebehavior.adapter.MyRecyclerAdapter;
import com.as.elemebehavior.adapter.MyViewPagerAdapter;
import com.as.elemebehavior.manager.CtrlLinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RelativeLayout rv_bottom;
    private TextView tv_close;
    private ZoomHeaderViewPager viewpager;
    private ZoomHeaderView zoomHeader;
    private CoordinatorLayout activity_main;
    private int bottomY;
    private boolean isFirst=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            list.add("我是第" + i + "条");
        }
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(R.layout.recycler_item, list);
        CtrlLinearLayoutManager ctrlLinearLayoutManager = new CtrlLinearLayoutManager(this);
        ctrlLinearLayoutManager.setScrollEnabled(false);
        recyclerView.setLayoutManager(ctrlLinearLayoutManager);
        recyclerView.setAlpha(0);
        recyclerView.setAdapter(myRecyclerAdapter);

        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(this);
        viewpager.setAdapter(myViewPagerAdapter);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (isFirst) {
            for (int i = 0; i < viewpager.getChildCount(); i++) {
                View v = viewpager.getChildAt(i).findViewById(R.id.ll_bottom);
                v.setY(viewpager.getChildAt(i).findViewById(R.id.imageView).getHeight());
                v.setX(MarginConfig.MARGIN_LEFT_RIGHT);
                //触发一次dependency变化，让按钮归位
                zoomHeader.setY(zoomHeader.getY() - 1);
                isFirst = false;
            }
        }

        //隐藏底部栏]
        bottomY = (int) rv_bottom.getY();
        rv_bottom.setTranslationY(rv_bottom.getY() + rv_bottom.getHeight());
        zoomHeader.setBottomView(rv_bottom, bottomY);
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        rv_bottom = (RelativeLayout) findViewById(R.id.rv_bottom);
        tv_close = (TextView) findViewById(R.id.tv_close);
        viewpager = (ZoomHeaderViewP                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ager) findViewById(R.id.viewpager);
        zoomHeader = (ZoomHeaderView) findViewById(R.id.zoomHeader);
        activity_main = (CoordinatorLayout) findViewById(R.id.activity_main);
    }
}
