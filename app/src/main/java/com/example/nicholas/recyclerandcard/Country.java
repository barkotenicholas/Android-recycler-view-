package com.example.nicholas.recyclerandcard;

/**
 * Created by nicholas on 3/13/18.
 */

public class Country {

    String name,desc;
    int image;

    public Country(){

    }
    public Country(String name, String desc,int image){

        this.name=name;
        this.desc=desc;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
