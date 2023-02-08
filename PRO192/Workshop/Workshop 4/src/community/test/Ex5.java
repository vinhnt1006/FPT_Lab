package community.test;

import community.model.Circle5;
import community.model.Rectangle5;
import community.model.Square5;

public class Ex5 {

	public static void main(String[] args) {
		 Circle5 c1 = new Circle5();
	        System.out.println(c1);
	        Circle5 c2 = new Circle5(1);
	        System.out.println(c2);
	        

	        c1.setColor("yellow");
	        c1.setFilled(false);
	        c1.setRadius(3);
	        System.out.println(c1);
	        System.out.println("Area: " + c1.getArea());
	        System.out.println("Perimeter: " + c1.getPerimeter());

	        Rectangle5 r1 = new Rectangle5();
	        System.out.println(r1);
	        Rectangle5 r2 = new Rectangle5(1, 2);
	        System.out.println(r2);
	        Rectangle5 r3 = new Rectangle5(3, 4, "black", true);
	        System.out.println(r3);

	        r1.setColor("yellow");
	        r1.setFilled(false);
	        r1.setLength(5);
	        r1.setWidth(6);
	        System.out.println(r1);
	        System.out.println("Area: " + r1.getArea());
	        System.out.println("Perimeter: " + r1.getPerimeter());

	        Square5 s1 = new Square5();
	        System.out.println(s1);
	        Square5 s2 = new Square5(1);
	        System.out.println(s2);
	        Square5 s3 = new Square5(3, "black", true);
	        System.out.println(s3);

	        s1.setColor("yellow");
	        s1.setFilled(false);
	        s1.setLength(5);
	        System.out.println(s1);
	        System.out.println("Area: " + s1.getArea());
	        System.out.println("Perimeter: " + s1.getPerimeter());
	}

}
