/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.TreeSet;

/**
 *
 * @author Razer Blade
 */
public class CustomerSet {

    private TreeSet<Customer> t;

    public CustomerSet() {
        t = new TreeSet<>();
    }

    public CustomerSet(TreeSet<Customer> t) {
        this.t = t;
    }

    public TreeSet<Customer> getT() {
        return t;
    }

    public void setT(TreeSet<Customer> t) {
        this.t = t;
    }

    public boolean addCustomer(Customer cus) {
        return t.add(cus);
    }

    public void displayAll() {
        for (Customer customer : t) {
            customer.displayCustomer();
        }
    }

    public Customer findCustomer(String id) {
        for (Customer customer : t) {
            if (customer.getId().equalsIgnoreCase(id)) {
                return customer;
            }
        }
        return null;
    }

    public Customer findVIPCustomer() {
        int count = 0;
        Customer x = new Customer();
        for (Customer customer : t) {
            if (customer.getSize() > count) {
                x = customer;
                count = customer.getSize();
            }
        }
        return x;
    }

    public void displayCustomers(int min, int max) {
        for (Customer customer : t) {
            if (customer.checkItem(min, max)) {
                customer.displayCustomer();
            }
        }
    }
}
