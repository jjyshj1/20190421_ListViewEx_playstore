package com.example.a20190421_listviewex_playstore;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a20190421_listviewex_playstore.databinding.ActivityAppDetailBinding;
import com.example.a20190421_listviewex_playstore.datas.App;

public class AppDetailActivity extends AppCompatActivity {

    App mAppData;//이화면에서 다른 앱의 정보를 가진 멤버변수 선언

    ActivityAppDetailBinding act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_app_detail);

        //String appTitle = getIntent().getStringExtra("제목");
        //String appCompany = getIntent().getStringExtra("회사명");

        mAppData = (App) getIntent().getSerializableExtra("앱정보");

//        act.apptitleTxt.setText(appTitle);
//        act.appcompanyTxt.setText(appCompany);
        act.apptitleTxt.setText(mAppData.title);
        act.appcompanyTxt.setText(mAppData.companuName);

        act.userRatingTxt.setText(String.format("%d점", mAppData.userRating));

        //구매여부에 따라 필요한 버튼 보여주기
        if (mAppData.isMine) {
            act.removeBtn.setVisibility(View.VISIBLE);
            act.launchBtn.setVisibility(View.VISIBLE);
            act.purchaseBtn.setVisibility(View.GONE);
        } else {
            act.removeBtn.setVisibility(View.GONE);
            act.launchBtn.setVisibility(View.GONE);
            act.purchaseBtn.setVisibility(View.VISIBLE);
            //구매하기 문구에 가격 표시

            act.purchaseBtn.setText(String.format("구매하기(%,d원)",mAppData.price));

        }
    }

}
