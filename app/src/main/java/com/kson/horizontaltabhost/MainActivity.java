package com.kson.horizontaltabhost;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kson.horizontaltabhost.bean.CategoryBean;
import com.kson.horizontaltabhost.fragment.MyFragment;
import com.kson.horizontaltabhost.view.HorizontalScollTabhost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HorizontalScollTabhost mTabhost;

    private List<CategoryBean> beans;
    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabhost = (HorizontalScollTabhost) findViewById(R.id.tabhost);


        initData();

    }

    private void initData() {
        fragmentList = new ArrayList<>();
        beans = new ArrayList<>();
        CategoryBean bean = new CategoryBean();
        bean.id = "top";
        bean.name = "头条";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "娱乐";
        bean.id = "yule";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "社会";
        bean.id = "shehui";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "体育";
        bean.id = "tiyu";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "科技";
        bean.id = "keji";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "财经";
        bean.id = "caijing";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "时尚";
        bean.id = "shishang";
        beans.add(bean);
        bean = new CategoryBean();
        bean.name = "军事";
        bean.id = "junshi";
        beans.add(bean);
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        fragmentList.add(new MyFragment());
        mTabhost.diaplay(beans, fragmentList);
    }
}
