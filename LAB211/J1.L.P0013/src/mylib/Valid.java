package mylib;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Valid {

    public static String checkInputNull() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Field Should Not Empty.");
                System.out.print("\nEnter again: ");
            } else {
                return result;
            }
        }
    }

    public static String checkGender() {
        String gender = null;
        boolean ok = true;
        while (ok) {
            Scanner sc = new Scanner(System.in);
            gender = sc.nextLine();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                ok = false;

            } else {
                System.out.print("Wrong gender! \nEnter again: ");
            }
        }
        return gender.toUpperCase();
    }

    public static String checkPhoneNumber() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine().trim();
            boolean matched = result.matches("^\\d{10,12}$");
            if (result.isEmpty()) {
                System.out.print("\nPhone number is null! \nEnter again: ");
            } else if (!matched) {
                System.out.print("Wrong phone number! \nEnter again: ");
            } else {
                return result;
            }
        }
    }

    public static String checkEmail() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine().trim();
            boolean check = result.matches("^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$");
            if (result.isEmpty()) {
                System.out.print("\nEnter again: ");
            } else if (!check) {
                System.out.print("Wrong format email! \nEnter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkDate(String dateOfBirth) {
        String dateFormat = "dd/MM/yyyy";
        try {
            SimpleDateFormat dateF = new SimpleDateFormat(dateFormat);
            dateF.setLenient(false);
            dateF.parse(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Error");
            return true;
        }
        return false;
    }
    
    public static int checkInputNum() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int result = Integer.parseInt(sc.nextLine());
                if (result <= 0) {
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Wrong Format! Field must be a positive integer.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static double checkInputScore() {
        double result;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                result = Double.parseDouble(sc.nextLine());
                if (result <= 0 || result > 10) {
                    System.err.println("Field Should Not Exceed Below 0 and above 10");
                    System.out.print("\nEnter again: ");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Wrong Format! Field must be a positive integer.");
                System.out.print("Enter again: ");
            }
        }
    }
}
