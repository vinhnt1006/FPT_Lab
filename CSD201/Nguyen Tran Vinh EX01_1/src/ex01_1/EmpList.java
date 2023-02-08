/* Class for a list of employees */
package ex01_1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class EmpList extends LinkedList<Employee> implements I_List {
    Iterator<Employee> iterator1 ;
    @Override
    public void addItem(Object obj) {
        this.addLast((Employee)obj);
    }

    @Override
    public Object searchItem(String id) {
        if(this.isEmpty()) return null;
        else{
            for (Employee thi : this) {
                if(thi.code.equals(id)) return thi;
            }
        }
        return null;
    }

    @Override
    public Object removeItem(String id) {
        if(this.isEmpty()) return null;
        else{
            for (Employee thi : this) {
                if(thi.code.equals(id)) {
                    this.remove(thi);
                }
            }
        }
        return null;
    }

    @Override
    public void printOrderedList() {
        Collections.sort(this, (o1, o2)->o1.compareTo(o2));
        iterator1 = this.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+ "\n");
        }
    }
}
