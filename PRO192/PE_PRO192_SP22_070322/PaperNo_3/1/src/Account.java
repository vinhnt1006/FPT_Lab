/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Account {
    private String email;
    private String fullname;
    private boolean isActive;

    public Account(String email, String fullname, boolean isActive) {
        this.email = email;
        this.fullname = fullname;
        this.isActive = isActive;
    }

    public String getFullname() {
        return fullname.toUpperCase();
    }

    public void setIsActive(boolean isActive) {
       this.isActive = isActive;
    }

    public boolean getIsActive() {
        setIsActive(isActive);
        return this.isActive;
    }

}
