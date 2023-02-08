package dao;

import dto.Student;
import java.util.HashMap;
import java.util.Scanner;
import mylib.Valid;

public class StudentList extends HashMap<String, Student> {

    public boolean findStudent(String id) {
        return this.containsKey(id) ? true : false;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        String id;
        String firstName;
        String lastName;
        String gender;
        String email;
        String phoneNumber;
        String dateOfBirth;
        String check;
        boolean matched;
        boolean duplicated;
        boolean ok = true;
        do {
            System.out.print("Enter student id [format SExxxxxx]: ");
            do {
                id = sc.nextLine().toUpperCase();
                matched = id.matches("^SE\\d{6}$");
                duplicated = findStudent(id);
                if (!matched) {
                    System.out.println("Wrong format!");
                }
                if (duplicated) {
                    System.out.println("Student ID is duplicated! Enter ID student again: ");
                }
            } while ((!matched) || (duplicated));

            System.out.print("Enter student first name: ");
            firstName = Valid.checkInputNull();

            System.out.print("Enter student last name: ");
            lastName = Valid.checkInputNull();

            System.out.print("Enter student gender [Male/Female]: ");
            gender = Valid.checkGender();

            System.out.print("Enter date of birth [DD/MM/YYYY]: ");
            do {
                dateOfBirth = sc.nextLine();
            } while (Valid.checkDate(dateOfBirth));

            System.out.print("Enter student email: ");
            email = Valid.checkEmail();

            System.out.print("Enter student phone number: ");
            phoneNumber = Valid.checkPhoneNumber();

            Student std = new Student(id, firstName, lastName, gender, dateOfBirth, email, phoneNumber);
            this.put(id, std);

            System.out.print("Continue? [Y/N]: ");
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

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        String id;
        String check;
        boolean matched;
        boolean ok = true;
        do {
            System.out.print("Enter student id to update [format SExxxxxx]: ");
            do {
                id = sc.nextLine().toUpperCase();
                matched = id.matches("^SE\\d{6}$");
                if (!matched) {
                    System.out.println("Wrong format!");
                }
            } while ((!matched));

            boolean confirm = findStudent(id);
            if (!confirm) {
                System.out.println("Student does not exist!");
            } else {
                System.out.println("1. Update Student.");
                System.out.println("2. Delete Student.");
                int choice;
                choice = sc.nextInt();
                while (choice != 1 && choice != 2) {
                    System.out.print("Wrong input format! Enter again: ");
                    choice = sc.nextInt();
                }
                if (choice == 1) {
                    Student std1 = this.get(id);
                    String qq = sc.nextLine();
                    System.out.print("\nOld first name: " + std1.getFirstName() + "\nInput new first name: ");
                    String nFName = sc.nextLine();
                    if (!nFName.equals("")) {
                        std1.setFirstName(nFName);
                    }

                    System.out.print("\nOld last name: " + std1.getLastName() + "\nInput new last name: ");
                    String nLName = sc.nextLine();
                    if (!nLName.equals("")) {
                        std1.setLastName(nLName);
                    }

                    System.out.print("\nOld gender: " + std1.getGender() + "\nInput new gender: ");
                    String nGender = Valid.checkGender();
                    if (!nGender.equals("")) {
                        std1.setGender(nGender);
                    }

                    System.out.print("\nOld email: " + std1.getEmail() + "\nInput new email: ");
                    String nEmail = Valid.checkEmail();
                    if (!nEmail.equals("")) {
                        std1.setEmail(nEmail);
                    }

                    System.out.print("\nOld phone number: " + std1.getPhoneNumber() + "\nInput new phone number: ");
                    String nPNumber = Valid.checkPhoneNumber();
                    if (!nPNumber.equals("")) {
                        std1.setPhoneNumber(nPNumber);
                    }

                    System.out.print("\nOld date of birth: " + std1.getdateOfBirth() + "\nInput new date of birth: ");
                    String nDOBirth = null;
                    do {
                        nDOBirth = sc.nextLine();
                    } while (!nDOBirth.equals("") && Valid.checkDate(nDOBirth));
                    if (!nDOBirth.equals("")) {
                        std1.setdateOfBirth(nDOBirth);
                    }
                    System.out.println("\nUpdated!");
                } else if (choice == 2) {
                    this.remove(id);
                    System.out.println("Deleted!");;
                }
            }
            System.out.print("Contine? [Y/N]: ");
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
}
