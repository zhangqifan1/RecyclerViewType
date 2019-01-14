package com.as.recyclerviewtype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String path = "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=967395617,3601302195&fm=27&gp=0.jpg";
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<DataType> list = new ArrayList<>();

        //前三个
        list.add(new DataType(DataType.TYPE0, new DataBean(path, "苹果", "pingguo")));
        list.add(new DataType(DataType.TYPE0, new DataBean(path, "苹果", "pingguo")));
        list.add(new DataType(DataType.TYPE0, new DataBean(path, "苹果", "pingguo")));

        //第四个
        list.add(new DataType(DataType.TYPE1, new DataBean(path, "橘子橘.子橘子", "juzijuzijuzi")));

        //第 五六七八 个

        List<DataBean> list2Beans = new ArrayList<>();
        list2Beans.add(new DataBean(path, "香蕉", "xiangjiao"));

        list.add(new DataType(DataType.TYPE2, list2Beans));
        list.add(new DataType(DataType.TYPE2, list2Beans));

        MyAdapter myAdapter = new MyAdapter(list);
        recycler.setAdapter(myAdapter);
        recycler.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));
    }

    private void initView() {
        recycler = (RecyclerView) findViewById(R.id.recycler);
    }
}
