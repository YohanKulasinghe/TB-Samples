package com.yohan;

public class Door {
    private int width;
    private int height;

    private int key;

    public Door(int width,int height, int key){
        this.width = width;
        this.height = height;
        this.key = key;
    }

    public void openDoor(){
        System.out.println("Door Opened");
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getKey(){
        return key;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setKey(int key){
        this.key = key;
    }
}
