package model;

import java.util.Date;

public class Account {
    private int accNo;
    private String accName, address, tel, pass;
    private double balance;
    private Date lastAccess;
    private static int accNum=1000;

    public Account() {
    }

    public Account(String accName, String address, String tel, double balance, String pass) {
        this.accNo = ++accNum;
        this.accName = accName;
        this.address = address;
        this.tel = tel;
        this.balance = balance;
        this.lastAccess = new Date();
        this.pass=pass;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Account{" + "accNo=" + accNo + ", accName=" + accName + ", address=" + address + ", balance=" + balance + ", lastAccess=" + lastAccess + '}';
    }
    public double deposit(double amount){
        return balance+=amount;
    }
    public double withdraw(double amount){
        if(balance-amount<0) throw new RuntimeException("Not enough money..");
        return balance-=amount;
    }
    public boolean changePass(String oldP, String newP){
        if(oldP.equals(pass)) pass=newP;
        else throw new RuntimeException("Incorrect password");
        return true;
    }
    
}
