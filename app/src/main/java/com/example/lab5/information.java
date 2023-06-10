package com.example.lab5;

public class information {
    private int picture;
    private String infomation;
    private String category;
    public information(int picture, String infomation, String category){
        this.picture = picture;
        this.infomation = infomation;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getInfomation() {
        return infomation;
    }

    public int getPicture() {
        return picture;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
