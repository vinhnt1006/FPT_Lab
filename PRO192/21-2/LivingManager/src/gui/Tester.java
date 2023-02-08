/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.InterfaceFood;
import dto.Komodo;
import dto.LivingGroup;
import dto.Orchirds;

/**
 *
 * @author NK
 */
public class Tester {
    public static void main(String[] args) {
        LivingGroup obj = null;
        obj = new Orchirds();
        obj.useWater();
        obj.growBy();
        
        LivingGroup obj2 = null;
        obj = new Komodo("Male");
        obj.useWater();
        obj.growBy();
        
        InterfaceFood obj3 = null;
        obj3 = new Komodo("Female");
        obj3.eatBug();
    }
}
