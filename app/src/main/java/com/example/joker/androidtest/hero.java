package com.example.joker.androidtest;

public class hero {

    private String heroName,heroImage;
//    private  int image;

    public hero(String heroName, String movie, String year) {
        this.heroName= heroName;
    this.heroImage =heroImage;
    }


    public String getHeroName() {
        return heroName;
    }


    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroImage(String heroImage){
        return heroImage;
    }

    public void setHeroImage(String heroImage){
        this.heroImage = heroImage;
    }




}


