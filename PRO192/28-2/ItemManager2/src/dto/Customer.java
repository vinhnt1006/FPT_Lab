/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;

/**
 *
 * @author Razer Blade
 */
public class Customer implements Comparable<Customer> {

    private String id;
    private String name;
    private ArrayList<Item> cart;

    public Customer() {
        id = "";
        name = "";
        cart = new ArrayList<>();
    }

    public Customer(String id, String name, ArrayList<Item> cart) {
        this.id = id;
        this.name = name;
        this.cart = cart;
    }

    public int getSize() {
        return cart.size();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Item> cart) {
        this.cart = cart;
    }

    public boolean addtoCart(Item it) {
        return cart.add(it);
    }

    public Item removeItem(int index) {
        return cart.remove(index);
    }

    public void displayCustomer() {
        System.out.println("Customer:");
        System.out.println("id: " + this.getId());
        System.out.println("name: " + this.getName());
        for (Item item : cart) {
            item.outItem();
        }
    }

    public boolean checkItem(int min, int max) {
        for (Item item : cart) {
            if (item.getValue() >= min && item.getValue() <= max) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Customer o) {
        if (o.getId().compareToIgnoreCase(id) > 0) {
            return 1;
        } else if (o.getId().compareToIgnoreCase(id) < 0) {
            return -1;
        }
        return 0;
    }

}
