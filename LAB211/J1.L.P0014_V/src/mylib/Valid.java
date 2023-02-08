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

    public static boolean checkDate(String dateOfBirth) {
        String dateFormat = "DD/MM/YYYY";
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
}
