package com.company;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 125;
	    short myShort = 3299;
	    int myInt = 1245;

	    long myLong = 5000L + 10L * (myByte + myInt + myShort);
        System.out.println(myLong);
    }
}
