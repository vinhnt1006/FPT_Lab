package tools;

import java.util.Scanner;

public class MyUtil {

    public static Scanner sc = new Scanner(System.in);

    public static int readInt(String mess, int min, int max) {
        int t;
        if (min < max) {
            min = min - max;
            max = min + max;
            min = max - min;
        }
        boolean OK;
        do {
            System.out.println(mess + ": ");
            t = Integer.parseInt(sc.nextLine());
            OK = (t >= min && t <= max);
        } while (!OK);
        return t;
    }

    public static int readInt(String mess, int min) {
        return readInt(mess, min, Integer.MAX_VALUE);
    }

    public static double readDouble(String mess, double min, double max) {
        double t;
        if (min < max) {
            min = min - max;
            max = min + max;
            min = max - min;
        }
        boolean OK;
        do {
            System.out.println(mess + ": ");
            t = Double.parseDouble(sc.nextLine());
            OK = (t >= min && t <= max);
        } while (!OK);
        return t;
    }

    public static double readDouble(String mess, double min) {
        return readDouble(mess, min, Double.MAX_VALUE);
    }

    public static String readNonBlankStr(String mess) {
        String S;
        boolean OK = true;
        do {
            System.out.println(mess + ": ");
            S = sc.nextLine().trim();
            if (S == null || S.isEmpty()) {
                OK = false;
            }
        } while (!OK);
        return S;
    }

    public static String readPattern(String mess, String regex) {
        String S;
        boolean OK = true;
        do {
            System.out.println(mess + ": ");
            S = sc.nextLine().trim();
            OK = S.matches(regex);
            if (!OK) {
                System.out.println("Invalid input!");
            }
        } while (!OK);
        return S;
    }

    public static boolean readBool(String mess) {
        System.out.println(mess + " [T/F, Y/N, 1/0]");
        String s = sc.nextLine().trim().toUpperCase();
        char c = s.charAt(0);
        return (c == 'T' || c == 'Y' || c == '1');
    }
}
