package com.as.elemebehavior.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

import com.as.elemebehavior.MainActivity;
import com.as.elemebehavior.R;

import java.util.ArrayList;
import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/12
 * ---------------------------
 */
public class MyViewPagerAdapter extends PagerAdapter {

    private ArrayList<View> views;
    private int[] imgs={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    public MyViewPagerAdapter(final Context mContext) {
        views = new ArrayList<>();

        views.add(View.inflate(mContext, R.layout.item_img, null));
        views.get(0).findViewById(R.id.btn_buy).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(mContext, "buy", Toast.LENGTH_SHORT).show();
            }
        });
        views.add(View.inflate(mContext, R.layout.item_img, null));

        views.add(View.inflate(mContext, R.layout.item_img, null));
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        views.get(position).findViewById(R.id.imageView).setBackgroundResource(imgs[position]);
        container.addView(views.get(position));

        return views.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(views.get(position));
    }


}
