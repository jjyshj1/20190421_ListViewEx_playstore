package com.example.a20190421_listviewex_playstore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a20190421_listviewex_playstore.R;
import com.example.a20190421_listviewex_playstore.datas.App;

import java.util.List;

public class AppAdapter extends ArrayAdapter<App> {

    Context mContext;
    List<App> mList;
    LayoutInflater inf;

    public AppAdapter(Context context, List<App> list){

        super(context, R.layout.app_list_item,list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row==null){
            row = inf.inflate(R.layout.app_list_item,null);
        }


        App appData = mList.get(position);
        TextView rankAndTitleTxt = row.findViewById(R.id.rankAndTitleTxt);
        TextView companyTxt = row.findViewById(R.id.companyTxt);
        TextView pricOrInstalledTxt = row.findViewById(R.id.priceOrInstalledTxt);

        rankAndTitleTxt.setText(String.format("%d., %s", appData.rank, appData.title));
        companyTxt.setText(appData.companuName);

        if(appData.isMine){  //==true생략가능,,,설치된 항목이면 "설치한항목" 표시되므로 빈칸임

        }
        else{
            pricOrInstalledTxt.setText(String.format("%,d원",appData.price));//천단위 컴마 표시
        }
        return row;
    }
}
