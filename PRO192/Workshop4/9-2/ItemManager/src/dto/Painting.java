/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;

/**
 *
 * @author NK
 */
public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

//    public void inputPainting(){
//        inputItem();
//        try {
//            height = Valid.inputNum("Input Height");
//            width = Valid.inputNum("Input Width");
//            isWatercolour = Valid.inputBoolean("Input isWatercolour");
//            isFramed = Valid.inputBoolean("Input isFramed");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//    
//    public void outputPainting(){
//        outputItem();
//        System.out.println("Height:" + height);
//        System.out.println("Width:" + width);
//        System.out.println("isWatercolour:" + isWatercolour);
//        System.out.println("isFramed:" + isFramed);
//    }
    @Override
    public void inputItem() {
        try {
            super.inputItem(); //To change body of generated methods, choose Tools | Templates.
            height = Valid.inputNum("Input Height");
            width = Valid.inputNum("Input Width");
            isWatercolour = Valid.inputBoolean("Input isWatercolour");
            isFramed = Valid.inputBoolean("Input isFramed");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    @Override
    public void outputItem() {
        super.outputItem(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Height:" + height);
        System.out.println("Width:" + width);
        System.out.println("isWatercolour:" + isWatercolour);
        System.out.println("isFramed:" + isFramed);
    }

    @Override
    public String toString() {
        return super.toString() + "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
    }

}
