/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String[] arr = string.split(" ");
        int count = 0;
        for (String string1 : arr) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == '1' || string1.charAt(i) == '3' || string1.charAt(i) == '5' || string1.charAt(i) == '7' || string1.charAt(i) == '9') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        boolean ok = false;
        String ans = "";
        String[] arr = string.split(" ");
        for (String string1 : arr) {
            String x = "";
            for (int i = string1.length() - 1; i >= 0; i--) {
                x = x + string1.charAt(i);
            }
            if (x.equals(string1)) {
                if (ok == false) {
                    ans = ans + " XX";
                    ok = true;
                } else {
                    ans = ans + " " + string1;
                }
            } else {
                ans = ans + " " + string1;
            }
        }
        ans = ans.trim();
        return ans;
    }

}
