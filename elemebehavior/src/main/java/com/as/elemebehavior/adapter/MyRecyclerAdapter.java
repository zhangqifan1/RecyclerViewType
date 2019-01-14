package com.as.elemebehavior.adapter;

import android.support.annotation.Nullable;

import com.as.elemebehavior.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/12.
 * ---------------------------
 */
public class MyRecyclerAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MyRecyclerAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_item,item);
    }
}
