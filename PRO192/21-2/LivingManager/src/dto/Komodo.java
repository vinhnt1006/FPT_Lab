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
public class Komodo extends Animals implements InterfaceFood{

    @Override
    public void eatBug() {
        System.out.println("Eat by tongue");
    }

    public Komodo(String gender, String name) {
        super(gender, name);
    }

    public Komodo(String gender) {
        super(gender);
    }
    
}
