package com.example;

import java.util.ArrayList;
import java.util.Date;

public class Plane {

    private ArrayList<String> names;
    private int limit;
    private Date takeOffTime;
    private Date landTime;

    public Plane(int limit) {
        this.limit = limit;
        names = new ArrayList<>();
    }

    public void add(String name) {
        if (names.size() < limit) {
            names.add(name);
        }
    }

    public Date takeOff() {
        takeOffTime = new Date();
        return takeOffTime;
    }

    public void land() {
        landTime = new Date();
        names.clear();
    }

    public Date getLandTime() {
        return landTime;
    }

    public ArrayList<String> getNames() {
        return names;
    }
}

