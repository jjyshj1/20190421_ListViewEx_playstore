package com.example.a20190421_listviewex_playstore;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a20190421_listviewex_playstore.databinding.ActivityMainBinding;
import com.example.a20190421_listviewex_playstore.datas.App;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<App> appList = new ArrayList<>();

    ActivityMainBinding act;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        fillApp();
    }

    void fillApp(){
        appList.add(new App(1,"아스팔트8","ms",3,6000, true));
        appList.add(new App(2,"마인","il",4,3000, true));
        appList.add(new App(3,"하트","한국",5,5000, false));
        appList.add(new App(4,"비주얼","리리",1,8000, false));
        appList.add(new App(5,"강아지","하하핳",2,7000, false));
        appList.add(new App(6,"슬래시","나내알",3,1087, false));
        appList.add(new App(7,"팡팡","제조사",4,6000, false));
        appList.add(new App(8,"갤럭시","제조사",5,5000, false));
        appList.add(new App(9,"지뢰찾기","제조사",3,10000, false));
        appList.add(new App(10,"아우","제조사",3,5000, false));
        appList.add(new App(11,"땅굴맨","제조사",3,3000, false));
        appList.add(new App(12,"범버","제조사",5,6000, false));
        appList.add(new App(3,"하트","한국",5,5000, false));
        appList.add(new App(4,"비주얼","리리",1,8000, false));
        appList.add(new App(5,"강아지","하하핳",2,7000, false));
        appList.add(new App(6,"슬래시","나내알",3,1087, false));
        appList.add(new App(7,"팡팡","제조사",4,6000, false));
        appList.add(new App(8,"갤럭시","제조사",5,5000, false));
        appList.add(new App(9,"지뢰찾기","제조사",3,10000, false));
        appList.add(new App(10,"아우","제조사",3,5000, false));
        appList.add(new App(11,"땅굴맨","제조사",3,3000, false));
        appList.add(new App(12,"범버","제조사",5,6000, false));


    }

}