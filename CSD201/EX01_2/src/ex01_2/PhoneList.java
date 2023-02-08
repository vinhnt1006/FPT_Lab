/* Class for a phone list */
package ex01_2;

import java.util.LinkedList;
import java.util.Collections;

public class PhoneList extends LinkedList<Phone>
        implements I_List<Phone> {

    @Override
    //Add item to the emnd of the list. Code yourself
    public void addItem(Phone item) {
        this.add(item);
    }

    @Override
    //Search a phone, return the phone found. Code yourself
    public Phone searchItem(Phone item) {
        if (this.isEmpty()) {
            return null;
        } else {
            for (Phone thi : this) {
                if (thi.code.equals(item.code)) {
                    return thi;
                }
            }
        }
        return null;
    }

    @Override
    // Remove a phone based on it's code
    public boolean removeItem(Phone item) {
        boolean ok = false;
        for (Phone thi : this) {
                this.remove(thi);
                ok = true;
                break;
        }
        return ok;
    }

    @Override
    // Print the list in ascending order of phone codes
    public void printOrderedList() {
        Collections.sort(this);
        for (Phone thi : this) {
            System.out.println(thi);
        }
    }
}
