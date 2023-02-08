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
public class Book {

    //declare fields
    private String id;
    private String title;
    private String pcompany;

    //declare methods
    public Book() {
        id = null;
        title = null;
        pcompany = null;
    }

    public Book(String mId, String mtTitle, String mPCompany) {
        id = mId;
        title = mtTitle;
        pcompany = mPCompany;

    }

    public void setId(String mId) {
        if (mId != null && !mId.isEmpty()) {
            id = mId;
        }
    }

    public void setTitle(String mtTitle) {
        if (mtTitle != null && !mtTitle.isEmpty()) {
            title = mtTitle;
        }
    }

    public void setPCompany(String mPCompany) {
        if (mPCompany != null && !mPCompany.isEmpty()) {
            pcompany = mPCompany;
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        title = title.toUpperCase();
        return title;
    }

    public String getPCompany() {
        pcompany = pcompany.toUpperCase();
        return pcompany;
    }

    // input Point from keyboard
    public void inputBook() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input id: ");
//        id = sc.next();
//        System.out.println("input title: ");
//        title = sc.next();
//        System.out.println("input publishing company: ");
//        pcompany = sc.next();
        try {
            id = Valid.inputString("Input id");
            title = Valid.inputString("Input Title");
            pcompany = Valid.inputString("Input publishing company");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // output Point
    public void outputBook() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Publishing company: " + pcompany);
        System.out.println();
    }

}
