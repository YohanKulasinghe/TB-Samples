package com.yohan;

public class Room {
    private Door door;
    private Table table;

    public Room(Door door,Table table){
        this.door = door;
        this.table = table;
    }

    public Door getDoor(){
        return door;
    }

    public Table getTable(){
        return table;
    }

    public void setDoor(Door door){
        this.door = door;
    }

    public void setTable(Table table){
        this.table = table;
    }
}
