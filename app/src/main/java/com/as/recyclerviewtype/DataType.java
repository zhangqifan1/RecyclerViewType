package com.as.recyclerviewtype;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/10.
 * ---------------------------
 */
public class DataType  implements MultiItemEntity {

    public static  final  int TYPE0=1213;
    public static  final  int TYPE1=14545;
    public static  final  int TYPE2=1513;
    private  int  mType;
    @Override
    public int getItemType() {
        return mType;
    }


    // 这个布局 有三种形式需要三个type  但是 1   2要的数据 都是一样的  写一种就行了
    /***********************Type=0**************************/
    //需要准备的数据
    private  DataBean dataBean;

    public DataBean getDataBean() {
        return dataBean;
    }

    public DataType(int mType, DataBean dataBean) {
        this.mType = mType;
        this.dataBean = dataBean;
    }

    /***********************Type=1**************************/

    /***********************Type=2**************************/
    private List<DataBean> list2Data;//这里边只会放2个Bean


    public List<DataBean> getList2Data() {
        return list2Data;
    }

    public DataType(int mType, List<DataBean> list2Data) {
        this.mType = mType;
        this.list2Data = list2Data;
    }
}
