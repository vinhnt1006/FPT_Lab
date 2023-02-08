package community.test;

import community.model.Cat6;
import community.model.Dog6;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cat6 c1 = new Cat6("Tiger");
	        System.out.println(c1);
	        c1.greets();
	        Dog6 d1 = new Dog6("Camy");
	        Dog6 d2 = new Dog6("Lion");
	        System.out.println(d1);
	        System.out.println(d2);
	        d1.greets();
	        d1.greets(d2);
	}

}
