package com.example.joker.androidtest;

public class Movie {

    String name, detail;
    int image;

    //TODO 6 Create setters and getters

    public Movie(String name, String detail) {
        this.name = name;
        this.detail = detail;
        this.image = image;
    }


    public String getName() {
        return name;
    }


    public void setName(String Name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int setImage(int image) {
        this.image = image;

     return image;
    }



//    public int getimage() { return  image;}

//    public  void setImage(int image) { this.image =image;}
}



