package textview;

import java.util.Scanner;

public interface Library {
    public static String getText(String msg){
        Scanner sc= new Scanner(System.in);
        System.out.print(msg+" : ");
        return sc.nextLine();
    }
//-----------------------------------------------
    public static int getInt(String msg){
        return Integer.parseInt(getText(msg));
    }
//-----------------------------------------------    
    public static double getDouble(String msg){
        return Double.parseDouble(getText(msg));
    }

//-----------------------------------------------    
}
 