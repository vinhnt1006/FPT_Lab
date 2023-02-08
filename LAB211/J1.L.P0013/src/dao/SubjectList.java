package dao;

import dto.Subject;
import java.util.HashMap;
import java.util.Scanner;
import mylib.Valid;

public class SubjectList extends HashMap<String, Subject> {
    
    public boolean checkID(String id) {
        return this.containsKey(id) ? true : false;
    }

    public void addSubject() {
        Scanner sc = new Scanner(System.in);
        String id;
        String name; 
        String check;
        int credit;
        boolean matched;
        boolean duplicated;
        boolean ok = true;
        do {
            System.out.print("Enter subject id: ");
            do {
                id = sc.nextLine().toUpperCase();
                duplicated = checkID(id);
                if (duplicated) {
                    System.out.print("Subject ID is duplicated! Enter ID again: ");
                }
            } while (duplicated);

            System.out.print("Enter subject name: ");
            name = Valid.checkInputNull();

            System.out.print("Enter subject credit: ");
            credit = Valid.checkInputNum();
            
            Subject sub = new Subject(id, name, credit);
            this.put(id, sub);

            System.out.print("Continue? [Y/N]:");
            matched = true;
            do {
                check = Valid.checkInputNull();
                if ((check.equalsIgnoreCase("N"))) {
                    ok = false;
                    matched = false;
                } else if ((check.equalsIgnoreCase("Y"))) {
                    ok = true;
                    matched = false;
                } else {
                    System.out.print("Wrong format! Enter again! [Y/N]: ");
                }
            } while (matched);
        } while (ok);
    }

    public void updateSubject() {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        int credit;
        boolean matched;
        boolean ok = true;
        do {
            System.out.print("Enter subject id to update: ");
            id = sc.nextLine().toUpperCase();
            boolean check = checkID(id);
            if (!check) {
                System.out.println("Subject does not exist");
            } else {
                System.out.println("1. Update Subject.");
                System.out.println("2. Delete Subject.");
                int choice;
                choice = sc.nextInt();
                while (choice != 1 && choice != 2) {
                    System.out.print("Wrong input format! Enter again: ");
                    choice = sc.nextInt();
                }
                if (choice == 1) {
                    Subject sub1 = this.get(id);
                    String qq = sc.nextLine();
                    System.out.print("\nOld subject name: " + sub1.getName()+ "\nInput new subject name: ");
                    String nName = sc.nextLine();
                    if (!nName.equals("")) {
                        sub1.setName(nName);
                    }
                    
                    System.out.print("\nOld subject credit: " + sub1.getCredit()+ "\nInput new subject credit: ");
                    credit = Valid.checkInputNum();
                    sub1.setCredit(credit);
                    
                    System.out.println("\nUpdated!");
                } else if (choice == 2) {
                    this.remove(id);
                    System.out.println("Deleted!");;
                }
            }
            System.out.print("Continue? [Y/N]:");
            matched = true;
            String confirm;
            do {
                confirm = Valid.checkInputNull();
                if ((confirm.equalsIgnoreCase("N"))) {
                    ok = false;
                    matched = false;
                } else if ((confirm.equalsIgnoreCase("Y"))) {
                    ok = true;
                    matched = false;
                } else {
                    System.out.print("Wrong format! Enter again! [Y/N]: ");
                }
            } while (matched);
        } while (ok);
    }
}
