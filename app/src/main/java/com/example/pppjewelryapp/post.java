package com.example.pppjewelryapp;

public class post {

    private String pictures;
    private String gemstones;
    private String material;

    public String getPictures() {
        return pictures;
    }
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getGemstones() {
        return gemstones;
    }
    public void setGemstones(String gemstones) {
        this.gemstones = gemstones;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return "Post{" +
                "pictures='" + pictures + '\'' +
                ", gemstones=" + gemstones +
                ", material=" + material +
                '}';
    }
}

