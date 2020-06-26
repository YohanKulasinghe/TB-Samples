package com.company;

public class Account {
    String accNo;
    Integer balance;
    String cusName;
    String eMail;
    Integer mobileNo;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo){
        this.accNo = accNo;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance){
        this.balance = balance;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String geteMail(){
        return eMail;
    }

    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo){
        this.mobileNo = mobileNo;
    }

    public void deposit(Integer amount){
        this.balance = this.balance + amount;
    }

    public boolean withdrawal(Integer amount){
        if(this.balance  > amount) {
            this.balance = this.balance - amount;
        } else {
            return false;
        }
        return true;
    }

}
