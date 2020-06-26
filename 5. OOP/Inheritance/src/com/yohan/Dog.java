package com.yohan;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog Chew Called");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eat Called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog Walked Called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog Run Called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog Move Called ");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog Move Called");
        moveLegs(speed);
        super.move(speed);
    }
}
