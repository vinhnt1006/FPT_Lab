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
public class Nepenthes extends Plants implements InterfaceFood{

    @Override
    public void eatBug() {
        System.out.println("Eat bug by axit");
    }

    public Nepenthes(int year, String name) {
        super(year, name);
    }

    public Nepenthes() {
        super();
    }
    
}
