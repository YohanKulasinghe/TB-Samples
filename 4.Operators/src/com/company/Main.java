package com.company;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20d;
        double myDouble2 = 80d;
        double total = (myDouble + myDouble2) * 25;
        System.out.println("total is " + total);

        float riminder =  (float) total % 40;
        System.out.println("my Reminder " + riminder);

        if(riminder <= 20){
            System.out.println("Total was over the limits");
        }

    }
}
