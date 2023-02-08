package sort;

import java.util.Comparator;

public class Employee implements Comparable {

    String ID = "", name = "";
    int salary = 0;

    public Employee(String id, String n, int s) {
        ID = id;
        name = n;
        salary = s;
    }

    @Override
    public String toString() {
        return ID + "," + name + "," + salary;
    }

    @Override
    public int compareTo(Object emp) {
        return ID.compareTo(((Employee) emp).ID);
    }

    public static Comparator compareObj = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Employee emp1 = (Employee) o1;
            Employee emp2 = (Employee) o2;
            int d = emp1.salary - emp2.salary;
            if (d > 0) {
                return -1;
            }
            if (d == 0) {
                return emp1.ID.compareTo(emp2.ID);
            }
            return 1;
        }
    };
}
