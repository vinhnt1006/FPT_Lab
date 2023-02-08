/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import mylib.Valid;

/**
 *
 * @author Razer Blade
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
        isWatercolour = true;
        isFramed = true;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
//
//    public void inputPainting() {        
//        try {
//            inputItem();
//            height = Validation.inputInteger("Input height: ");
//            width = Validation.inputInteger("Input width: ");
//            isWatercolour = Validation.confirmYN("Input isWatercolour(T/F): ");
//            isFramed = Validation.confirmYN("Input isFrame(T/F): ");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//
//    public void outPainting() {
//        outItem();
//        System.out.println("height: " + height);
//        System.out.println("width: " + width);
//        System.out.println("isWatercolour: " + isWatercolour);
//        System.out.println("isFramed: " + isFramed);
//    }

    @Override
    public void outItem() {
        super.outItem(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("isWatercolour: " + isWatercolour);
        System.out.println("isFramed: " + isFramed);
    }

    @Override
    public void inputItem() {
        super.inputItem(); //To change body of generated methods, choose Tools | Templates.
        try {
            height = Valid.inputNum("Input height: ");
            width = Valid.inputNum("Input width: ");
            isWatercolour = Valid.inputBoolean("Input isWatercolour(T/F): ");
            isFramed = Valid.inputBoolean("Input isFrame(T/F): ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
