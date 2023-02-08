
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Tester3 {
    public static void main(String[] args) throws IOException {
//        FileReader f = null;
//        try{
//            f = new FileReader("qq.txt");
//            while(f.ready()){
//                
//            }
////            f.close();
//        }catch(Exception e){
//            System.out.println("Error");
////            f.close();
//        }
//        finally{
//            try {
//                if(f!=null) f.close();
//            } catch (Exception e) {
//                System.out.println("Error file");
//            }
//        }
        String s = "100";
        int num = 0;
        try {
            num = Integer.parseInt(s);
            System.out.println(num);
            s=s+"a";
            num = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Error");
            num--;
        }
        finally{
            num++;
            System.out.println(num);
        }
    }
}
