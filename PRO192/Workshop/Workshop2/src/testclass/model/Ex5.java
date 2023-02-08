package testclass.model;

import testclass.Account5;
import testclass.Customer5;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer5 c1 = new Customer5 (1,"Vinh",'m');
		System.out.println(c1);
		
		Account5 a1 = new Account5(1, c1);
		a1.setBalance(25);
		
		System.out.println(a1);

	}

}
