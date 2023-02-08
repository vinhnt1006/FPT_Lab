package model;

import java.util.Date;
import java.util.Vector;

public class TransLog {
    private int logID,accNo;
    private Date transTime;
    private String transType, description;
    private double amount, postBal;
    private static int logNum;
    
    public TransLog() {
    }

    public TransLog(int accNo, String transType, String description, double amount, double postBal) {
        this.accNo = accNo;
        this.transType = transType;
        this.description = description;
        this.amount = amount;
        this.postBal = postBal;
        logID= ++logNum;
        transTime= new Date();
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPostBal() {
        return postBal;
    }

    public void setPostBal(double postBal) {
        this.postBal = postBal;
    }

    public static int getLogNum() {
        return logNum;
    }

    public static void setLogNum(int logNum) {
        TransLog.logNum = logNum;
    }

    @Override
    public String toString() {
        return "TransLog{" + "logID=" + logID + ", accNo=" + accNo + ", transTime=" + transTime + ", transType=" + transType + ", description=" + description + ", amount=" + amount + ", postBal=" + postBal + '}';
    }
    
    public Vector toVector(){
        Vector v= new Vector();
        v.add(logID);
        v.add(transTime);
        v.add(transType);
        v.add(amount);
        v.add(description);
        v.add(postBal);
        return v;
    }
}
