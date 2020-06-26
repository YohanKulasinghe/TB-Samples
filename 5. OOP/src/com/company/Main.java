package com.company;

public class Main {

    public static void main(String[] args) {
        Account sunilAcc = new Account();

        sunilAcc.setBalance(10000);
        System.out.println(sunilAcc.getBalance());

        Boolean pass = sunilAcc.withdrawal(1000);
        if(pass){
            System.out.println("Success" );
        }else {
            System.out.println("Not enough balance");
        }

        System.out.println(sunilAcc.getBalance());

    }
}
