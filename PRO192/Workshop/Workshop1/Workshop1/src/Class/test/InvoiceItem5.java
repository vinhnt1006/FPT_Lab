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
public class InvoiceItem5 {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    // Constructor
    public InvoiceItem5(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.desc = desc;
                
    }
    // getter setter
    public String getID() { 
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    // to string
    @Override
    public String toString() {
        return "InvoiceItem[id = "+ id + 
                ", desc = " +desc + 
                ", qty = " + qty +
                ", unitPrice = " +unitPrice + "]"; 
    }
    
}
