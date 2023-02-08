package textview;

import model.Account;
import model.Bank;
import java.util.ArrayList;
import java.util.Vector;

public class BankApp extends Menu {
    private Bank bank= new Bank();
    private Account curAcc;
    static String[] mc={"Login","Create Account","Logout","Quit"};
    static String[] tMenu={"Deposit","Withdraw","Transfer","View Log","Logout"};

    public BankApp() {
        super(mc, "Virtual Banking");
    }
//--------------------------------------------
    @Override
    public void execute(int n) {
        switch(n){
            case 1: doLogin();break;
            case 2: createAccount();break;
            case 3: break;
            case 4: System.exit(0);
        }
    }
//----------------------------------------    
 void createAccount(){
     String aName=Library.getText("Account Name");
     String addr=Library.getText("Address");
     String tel=Library.getText("Tel No");
     String pass=Library.getText("Password");
     double bal=Library.getDouble("Initial Balance");
     Account a= new Account(aName,addr,tel,bal,pass);
     bank.createAccount(a);
     System.out.println("Your account No: "+a.getAccNo());
 }
//----------------------------------------    
 void doLogin(){
    int accNo=Library.getInt("Account No");
    String pw=Library.getText("Password");
    if((curAcc=bank.doLogin(accNo, pw))!=null){ 
        System.out.println("Welcome "+curAcc);
        System.out.println("Your last access: "+curAcc.getLastAccess());
        new TransactionMenu().run();
    }
    else System.out.println("Invalid Login");
    
 }
//----------------------------------------    
 void doDeposit(){
     if(curAcc==null) throw new RuntimeException("Login please!!");
     double st=Library.getDouble("Enter amount");
     String desc=Library.getText("Enter description");
     bank.doDeposit(curAcc.getAccNo(), st,desc);
     System.out.println("Successful. Your new balance "+curAcc.getBalance());
 }
//----------------------------------------    
 void doWithdraw(){
     if(curAcc==null) throw new RuntimeException("Login please!!");
     double st=Library.getDouble("Enter amount");
     String desc=Library.getText("Enter description");
     bank.doWithdraw(curAcc.getAccNo(), st,desc);
     System.out.println("Successful. Your new balance "+curAcc.getBalance());
}
//----------------------------------------    
 void doTransfer(){
     if(curAcc==null) throw new RuntimeException("Login please!!");
     int toAcc=Library.getInt("To Account");
     double st=Library.getDouble("Enter amount");
     String desc=Library.getText("Enter description");
     bank.doTransfer(curAcc.getAccNo(), toAcc, st,desc);
     System.out.println("Successful. Your new balance "+curAcc.getBalance());
 }
//----------------------------------------    
 void doViewLog(){
     if(curAcc==null) throw new RuntimeException("Login please!!");
     System.out.println("Transaction Log - Account "+curAcc.getAccName());
     System.out.println("-----------------------------------------");
     for(Vector t:bank.getLogs(curAcc.getAccNo()))
         System.out.println(t);
 }
//--------------------------------------------
    public static void main(String[] arg){
        BankApp b= new BankApp();
        b.run();
    }
//--------------------------------------------
 class TransactionMenu extends Menu{
    public TransactionMenu(){
        super(tMenu,"Trasaction Menu");
    }
    public void execute(int n){
        switch(n){
            case 1: doDeposit();break;
            case 2: doWithdraw();break;
            case 3: doTransfer();break;
            case 4: doViewLog();break;
            case 5: curAcc=null;return;
        }
    }
 }    
}
