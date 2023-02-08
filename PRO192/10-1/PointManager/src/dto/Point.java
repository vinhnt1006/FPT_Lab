/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Scanner;
import mylib.Valid;

/**
 *
 * @author NK
 */
public class Point {

    //declare fields
    private double x;
    private double y;

    //declare methods
    
    //constructors
    public Point(){
        x = 0;
        y = 0;
    }
    
    public Point(Point P){
        x = P.getX();
        y = P.getY();
        /**
         * x = P.x;
         * y = P.y;
         */
    }
    
    //getters
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    
    //setters
    public void setX(double mX){
        x = mX;
    }
    
    public void setY(double mY){
        y = mY;
    }
    //other
    
    
    
    // input Point from keyboard
    public void inputPoint() {
        boolean err = false;
        do {
            try {
                x = Valid.inputNum("Input x:");
                y = Valid.inputNum("Input y:");
                err = false;
            } catch (Exception e) {
                System.out.println("Data is invalid");
                err = true;
            }
        } while (err);
    }

    // output Point
    public void outputPoint() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();
    }
    
    public double getDistance(double x2, double y2){
        double Distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
        return Distance;
    }
    
    public double getDistance2(Point P){
        double Distance = Math.sqrt((x - P.getX()) * (x - P.getX()) + (y - P.getY()) * (y - P.getY()));
        return Distance;
    }
}
