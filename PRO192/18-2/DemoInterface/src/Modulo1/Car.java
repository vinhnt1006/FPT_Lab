/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo1;

import Modulo2.AirConditioner;
import Modulo2.AirConditionerGen2;
import Modulo2.Menu;

/**
 *
 * @author NK
 */
public class Car {
    private String name;
    private Menu Controler;

    public Car() {
        name = "Ferrari";
        Controler = new AirConditioner();
    }

    public Car(String name, Menu Controler) {
        this.name = name;
        this.Controler = Controler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getControler() {
        return Controler;
    }

    public void setControler(Menu Controler) {
        this.Controler = Controler;
    }
    
    public void Start(){
        System.out.println("🚗🚗");
        System.out.println("Open ");
        Controler.on();
        System.out.println("RUN\n");
    }
    
    public void Stop(){
        System.out.println("STOP!!!!");
        System.out.println("Off\n");
        Controler.off();
    }
    
    public static void main(String[] args) {
        
        Car c= new Car();
        c.Start();
        c.Stop();
        
        Menu Controler2 = new AirConditioner("LG");
        c.setControler(Controler2);
        c.Start();
        c.Stop();
        
        Menu Controler3 = new AirConditionerGen2("MMM", true);
        c.setControler(Controler3);
        c.Start();
        c.Stop();
    }
}
