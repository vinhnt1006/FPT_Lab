
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> list) {
        int count = 0;
        for (Cala cala : list) {
            String ok = cala.getOwner();
            if(ok.charAt(1) == '1' ||ok.charAt(1) == '2' ||ok.charAt(1) == '3' ||ok.charAt(1) == '4' ||ok.charAt(1) == '5' ||
                    ok.charAt(1) == '6' ||ok.charAt(1) == '7' ||ok.charAt(1) == '8' ||ok.charAt(1) == '9' )
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Cala> list) {
        int max = Integer.MIN_VALUE;
        for (Cala cala : list) {
            if(max < cala.getPrice()) max = cala.getPrice();
        }
        int count = 0;
        for(Cala cala: list){
            if(cala.getPrice()== max){
                count++;
                if(count == 2) list.remove(cala);
            }
        }
    }

    @Override
    public void f3(List<Cala> list) {
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
    }
    
}
