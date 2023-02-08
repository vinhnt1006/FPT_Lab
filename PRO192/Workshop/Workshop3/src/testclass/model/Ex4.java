package testclass.model;

import testclass.Time4;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time4 myTime = new Time4(23, 59, 59);
		System.out.println(myTime);
		myTime.nextHour();
		System.out.println(myTime);
		myTime.nextSecond();
		System.out.println(myTime);

	}
	

}
