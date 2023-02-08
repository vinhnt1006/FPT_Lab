package community.test;

import community.model.Staff2;
import community.model.Student2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Student2 s1 = new Student2("Pham Khac Vinh ", "Quang Ninh", "PRO", 2021, 27);
        System.out.println(s1);
        s1.setAddress("Thai Binh");
        System.out.println(s1);
        s1.setFee(300);
        s1.setProgram("MAD101");
        s1.setYear(2022);
        System.out.println("Name is " + s1.getName());
        System.out.println("Adress is " + s1.getAddress());
        System.out.println("Fee is " + s1.getFee());
        System.out.println("Program is " + s1.getProgram());
        System.out.println("Year is " + s1.getYear());
        
        Staff2 sf1 = new Staff2("Hoang Linh", "Viet Nam", "Sai Gon", 250);
        System.out.println(sf1);

        sf1.setAddress("Japan");
        System.out.println(sf1);
        sf1.setPay(300);
        sf1.setSchool("Tokyo Universe");
        System.out.println("Name is " + sf1.getName());
        System.out.println("Adress is " + sf1.getAddress());
        System.out.println("Pay is " + sf1.getPay());
        System.out.println("School is " + sf1.getSchool());
	}

}
