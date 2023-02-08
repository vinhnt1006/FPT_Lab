
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
         for (Car car : t) {
            sum = sum + car.getRate();
        }
         return sum/(t.size());
    }

    @Override
    public void f2(List<Car> t) {
        int vtmax=0;
        int vtmin=0;
        Car max=t.get(0);
        Car min=t.get(0);
        int i=0;
        for (Car car : t) {
            if(car.getRate()>max.getRate()){
                max = car;
                vtmax = i;
            }
             if(car.getRate()<min.getRate()){
                min = car;
                vtmin = i;
            }
            i++;
        }
        Collections.swap(t, vtmax, vtmin);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>(){
            @Override
            public int compare(Car t, Car t1) {
                if(t.getMaker().compareTo(t1.getMaker()) != 0){
                    return t.getMaker().compareTo(t1.getMaker());
                } else return -(t.getRate() - t1.getRate());
            }
            
        });
    }
    
}

  
    
    

