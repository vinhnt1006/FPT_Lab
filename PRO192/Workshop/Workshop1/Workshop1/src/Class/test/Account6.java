/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.test;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Account6 {
    private String id;
    private String name;
    private int balance = 0;
    
    // constructor
    public Account6 ( String id , String name ) { 
        this.id = id;
        this.name = name;
                 
    }
    
    public Account6 (String id, String name , int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    // getter setter
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    
    // method
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount < balance) 
                balance -= amount;
        else 
            System.out.println("Amount exceed balance");
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int transferTo(Account6 another , int amount) {
        if (amount <= balance) 
            another.setBalance(another.getBalance()+amount);
        else
            System.out.println("Amount exceed balance");
        return balance;
    }

    @Override
    public String toString() {
        return "Account = [id = " + id +
                ", name = " + name + 
                ", balance = " + balance + "]"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
