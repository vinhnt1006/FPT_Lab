/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author NK
 */
public class Guitar {

    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    //constructors 
    public Guitar() {
        serialNumber = null;
        price = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
    }

    public Guitar(String mSerialNumber, int mPrice, String mBuilder, String mModel, String mBackWood, String mTopWood) {
        serialNumber = mSerialNumber;
        price = mPrice;
        builder = mBuilder;
        model = mModel;
        backWood = mBackWood;
        topWood = mTopWood;
    }

//getters 
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

//setters 
    public void setSerialNumber(String mSerialNumber) {
        if (mSerialNumber != null && !mSerialNumber.isEmpty()) {
            serialNumber = mSerialNumber;
        }
    }

    public void setPrice(int mPrice) {
        price = mPrice;
    }

    public void setBuilder(String mBuilder) {
        if (mBuilder != null && !mBuilder.isEmpty()) {
            builder = mBuilder;
        }
    }

    public void setModel(String mModel) {
        if (mModel != null && !mModel.isEmpty()) {
            model = mModel;
        }
    }

    public void setBackWood(String mBackWood) {
        if (mBackWood != null && !mBackWood.isEmpty()) {
            backWood = mBackWood;
        }
    }

    public void setTopWood(String mTopWood) {
        if (mTopWood != null && !mTopWood.isEmpty()) {
            topWood = mTopWood;
        }
    }

//other logic methods 
    public void createSound() {
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Model: " + getModel());
        System.out.println("BackWood: " + getBackWood());
        System.out.println("TopWood: " + getTopWood());
    }
}
