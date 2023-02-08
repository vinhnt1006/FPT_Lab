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
public abstract class Organization {

    int size;

    public Organization(int size) {
        this.size = size;
    }

    public Organization() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    abstract void communicateByTool();

    @Override
    public String toString() {
        return "The organization’s size is" + size;
    }

}
