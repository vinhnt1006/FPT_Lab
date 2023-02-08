package community.test;

import java.util.Arrays;

import community.model.Point3d3;

public class Ex3 {

	public static void main(String[] args) {
		 Point3d3 p1 = new Point3d3(1, 2, 3);
	        System.out.println(p1);

	        p1.setX(4);
	        p1.setY(5);
	        p1.setZ(6);
	        System.out.println(p1);
	        System.out.println("point X : " + p1.getX());
	        System.out.println("point Y : " + p1.getY());
	        System.out.println("point Z : " + p1.getZ());

	        p1.setXY(7, 8);
	        System.out.println(p1);
	        p1.setXYZ(9, 10, 11);
	        System.out.println("new point: " + Arrays.toString(p1.getXYZ()));
	        
	}

}
