package com.example.a20190421_listviewex_playstore.datas;

public class App {

    public int rank; //순위
    public String title; //앱제목
    public String companuName; //제조사
    public int userRating; //별 평점
    public int price; //가격
    public boolean isMine; //구매여부 확인값(true면 "설치된항목"표시, false면 가격으로 표시)

    public App(int rank, String title, String companuName, int userRating, int price, boolean isMine) {
        this.rank = rank;
        this.title = title;
        this.companuName = companuName;
        this.userRating = userRating;
        this.price = price;
        this.isMine = isMine;
    }
}
