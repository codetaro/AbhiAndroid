package com.example.dyuan.abhiandroid;

public class Item {

    String birdName;
    int birdImage;

    public Item(String birdName, int birdImage) {
        this.birdName = birdName;
        this.birdImage = birdImage;
    }

    public String getBirdName() {
        return birdName;
    }

    public int getBirdImage() {
        return birdImage;
    }
}
