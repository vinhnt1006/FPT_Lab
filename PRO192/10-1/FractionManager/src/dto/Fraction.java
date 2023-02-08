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
public class Fraction {

    //declare fields
    private int numerator;
    private int denominator;

    //declare methods
    public Fraction() {
        numerator = 0;
        denominator = 0;
    }

    private Fraction(int nNumerator, int nDenominator) {
        numerator = nNumerator;
        denominator = nDenominator;
    }

    //getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int mNumerator) {
        numerator = mNumerator;
    }

    public void setDenominator(int mDenominator) {
        if (mDenominator != 0) {
            denominator = mDenominator;
        }
    }

    // input Point from keyboard
    public void inputFraction() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input numerator: ");
//        numerator = sc.nextInt();
//        System.out.println("input denominator: ");
//        denominator = sc.nextInt();
        try {
            numerator = Valid.inputNum("Input numerator");
            denominator = Valid.inputNum("Input denominator");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // output Point
    public void outputFraction() {
        System.out.println("numerator = " + numerator);
        System.out.println("denominator = " + denominator);
        System.out.println("fraction:" + numerator + "/" + denominator);
        System.out.println();
    }

//    public void operatorAdd(Fraction F){
//        System.out.println((numerator * F.getDenominator() + F.getNumerator() * denominator) + "/" + (denominator * F.getDenominator()));
//    }
//    
//    public void operatorAdd(int mNumerator, int mDenominator){
//        System.out.println((numerator * mDenominator + mNumerator * denominator) + "/" + (denominator * mDenominator));
//    }
//    
//    public void operatorSub(Fraction F){
//        System.out.println((numerator * F.getDenominator() - F.getNumerator() * denominator) + "/" + (denominator * F.getDenominator()));
//    }
//    
//    public void operatorMul(Fraction F){
//        System.out.println((numerator * F.getNumerator()) + "/" + (denominator * F.getDenominator()));
//    }
//    
//    public void operatorDiv(Fraction F){
//        System.out.println((numerator * F.getDenominator()) + "/" + (denominator * F.getNumerator()));
//    }
    public Fraction operatorAdd(Fraction F) {
        int nNumerator = numerator * F.getDenominator() + F.getNumerator() * denominator;
        int nDenominator = denominator * F.getDenominator();
        Fraction F1 = new Fraction(nNumerator, nDenominator);
        return F1;
    }

    public Fraction operatorSub(Fraction F) {
        int nNumerator = numerator * F.getDenominator() - F.getNumerator() * denominator;
        int nDenominator = denominator * F.getDenominator();
        Fraction F1 = new Fraction(nNumerator, nDenominator);
        return F1;
    }

    public Fraction operatorMul(Fraction F) {
        int nNumerator = numerator * F.getNumerator();
        int nDenominator = denominator * F.getDenominator();
        Fraction F1 = new Fraction(nNumerator, nDenominator);
        return F1;
    }

    public Fraction operatorDiv(Fraction F) {
        int nNumerator = numerator * F.getDenominator();
        int nDenominator = denominator * F.getNumerator();
        Fraction F1 = new Fraction(nNumerator, nDenominator);
        return F1;
    }
}
