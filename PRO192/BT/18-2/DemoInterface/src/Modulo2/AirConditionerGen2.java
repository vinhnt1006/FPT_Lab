/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

/**
 *
 * @author NK
 */
public class AirConditionerGen2 implements MenuGener2{
    private String nameGen2;
    private boolean isFashion;
    
    @Override
    public void Fans() {
        System.out.println("OO");
    }

    @Override
    public void on() {
        System.out.println("QQ");
    }

    @Override
    public void off() {
        System.out.println("ZZ");
    }

    public AirConditionerGen2(String nameGen2, boolean isFashion) {
        this.nameGen2 = nameGen2;
        this.isFashion = isFashion;
    }

    public AirConditionerGen2() {
        nameGen2 = "ZZZ";
        isFashion = true;
    }

    public String getNameGen2() {
        return nameGen2;
    }

    public void setNameGen2(String nameGen2) {
        this.nameGen2 = nameGen2;
    }

    public boolean isIsFashion() {
        return isFashion;
    }

    public void setIsFashion(boolean isFashion) {
        this.isFashion = isFashion;
    }
    
}
