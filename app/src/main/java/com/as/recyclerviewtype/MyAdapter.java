package com.as.recyclerviewtype;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/10.
 * ---------------------------
 */
public class MyAdapter extends BaseMultiItemQuickAdapter<DataType,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MyAdapter(List<DataType> data) {
        super(data);
        addItemType(DataType.TYPE0,R.layout.item_type0);
        addItemType(DataType.TYPE1,R.layout.item_type1);
        addItemType(DataType.TYPE2,R.layout.item_type2);
    }

    @Override
    protected void convert(BaseViewHolder helper, DataType item) {
        switch (item.getItemType()){
                    case  DataType.TYPE0:
                        break;
                    case  DataType.TYPE1:
                        break;
                    case  DataType.TYPE2:
                        break;
                    default:
                        break;
                }
    }
}
