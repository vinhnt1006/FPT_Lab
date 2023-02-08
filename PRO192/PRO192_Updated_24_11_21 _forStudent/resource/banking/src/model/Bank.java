package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Bank {
    private ArrayList<Account> aList= new ArrayList<>();
    private ArrayList<TransLog> tList= new ArrayList<>();
//-----------------------------------------------------------    
    public Account getAccount(int accNo){
        for(Account a:aList) 
            if(a.getAccNo()==accNo) return a;
        throw new RuntimeException("Account doesnot exist!");
    }
//-----------------------------------------------------------    
    public Vector<Vector> getLogs(int accNo){
        Vector<Vector> accLogs= new Vector<>();
        for(TransLog t:tList) 
            if(t.getAccNo()==accNo) accLogs.add(t.toVector());
        return accLogs;
    }
//-----------------------------------------------------------    
    public void createAccount(Account a){
        aList.add(a);
        tList.add(new TransLog(a.getAccNo(),"REG","Create account",0,a.getBalance()));
    }
//-----------------------------------------------------------    
    public void doDeposit(int accNo,double amount,String desc){
        Account a= getAccount(accNo);
        a.deposit(amount);
        tList.add(new TransLog(accNo,"DEP",desc,amount,a.getBalance()));
    } 
//-----------------------------------------------------------    
    public void doWithdraw(int accNo,double amount,String desc){
        Account a= getAccount(accNo);
        a.withdraw(amount);
        tList.add(new TransLog(accNo,"WIT",desc,-amount,a.getBalance()));
    } 
//-----------------------------------------------------------     
    public void doTransfer(int accNo,int toAcc,double amount, String desc){
        Account a= getAccount(accNo);
        Account b= getAccount(toAcc);
        a.withdraw(amount); b.deposit(amount);
        tList.add(new TransLog(accNo,"TRT",desc,-amount,a.getBalance()));
        tList.add(new TransLog(toAcc,"TRR",desc,amount,getAccount(toAcc).getBalance()));
    }
//-----------------------------------------------------------    
    public Account doLogin(int accNo,String pass){
        Account a=getAccount(accNo);
        if(a.getPass().equals(pass)) {
            a.setLastAccess(new Date());
            return a;
        }
        else throw new RuntimeException("Invalid Login");
    }
//-----------------------------------------------------------    
    public void doChangePass(int accNo,String oldP, String newP){
        Account a= getAccount(accNo);
        a.changePass(oldP, newP);
        tList.add(new TransLog(accNo,"CHP","Change password",a.getBalance(),a.getBalance()));
    } 
}
