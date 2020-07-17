package com.yohan;

public class Main {

    public static void main (String[] args){
        Door door1 = new Door(123,456,5);
        Table table1 = new Table(4, new TableSurface(50,100),new Drawer(5));

        Room room = new Room(door1,table1);

        room.getDoor().openDoor();
    }
}
