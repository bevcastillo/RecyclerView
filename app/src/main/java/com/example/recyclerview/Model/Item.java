package com.example.recyclerview.Model;

public class Item {

    private String name;
    private boolean isChecked;

    public Item(){

    }

    //constructor
    public Item(String name, boolean isChecked) {
        this.name = name;
        this.isChecked = isChecked;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
