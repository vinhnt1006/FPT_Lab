package community.test;

import community.model.MovablePoint4;

public class Ex4 {
	public static void main(String[] args) {
		MovablePoint4 m1 = new MovablePoint4();
        System.out.println(m1);
        MovablePoint4 m2 = new MovablePoint4(1, 2);
        System.out.println(m2);
        MovablePoint4 m3 = new MovablePoint4(3, 4, 5, 6);
        System.out.println(m3);
        
        m1.setX(7);
        m1.setY(8);
        m1.setxSpeed(9);
        m1.setySpeed(10);
        System.out.println(m1);
        

	}

}
