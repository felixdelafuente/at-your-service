package com.example.at_your_service;

public class Person {
    int Image;
    String Name;
    String Des;
    String timedate;


    public Person(int image, String name, String des, String timedate) {
        this.Image = image;
        this.Name = name;
        this. Des = des;
        this.timedate = timedate;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public String getTimedate() {
        return timedate;
    }

    public void setTimedate(String timedate) {
        this.timedate = timedate;
    }
}
