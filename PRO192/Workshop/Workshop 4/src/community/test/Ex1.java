package community.test;

import community.model.Cylinder1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and allocate a new instance of cylinder
	      //   with default color, radius, and height
	      Cylinder1 c1 = new Cylinder1();
	      System.out.println("Cylinder:"
	            + " radius=" + c1.getRadius()
	            + " height=" + c1.getHeight()
	            + " base area=" + c1.getArea()
	            + " volume=" + c1.getVolume());
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying height, with default color and radius
	      Cylinder1 c2 = new Cylinder1(10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c2.getRadius()
	            + " height=" + c2.getHeight()
	            + " base area=" + c2.getArea()
	            + " volume=" + c2.getVolume());
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying radius and height, with default color
	      Cylinder1 c3 = new Cylinder1(2.0, 10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c3.getRadius()
	            + " height=" + c3.getHeight()
	            + " base area=" + c3.getArea()
	            + " volume=" + c3.getVolume());

	}

}
