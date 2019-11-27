package com.example.topic5;

public class Contacts {
    private String name,address;
    private  int imageID;

    public Contacts(String name,String address,int imageID) {
        this.name = name;
        this.address = address;
        this.imageID=imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
