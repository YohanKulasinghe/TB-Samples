package com.yohan;

public class Table {
    private int legs;
    private TableSurface tableSurface;

    private Drawer drawer;

    public Table(int legs, TableSurface tableSurface, Drawer drawer){
        this.legs = legs;
        this.tableSurface = tableSurface;
        this.drawer = drawer;
    }

    public int getLegs(){
        return legs;
    }

    public TableSurface getSurface(){
        return tableSurface;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void setTableSurface(TableSurface tableSurface){
        this.tableSurface = tableSurface;
    }
}

