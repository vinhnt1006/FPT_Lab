package DTO;

import java.util.Scanner;

public class Item {
	private int value;
	private String creator;
	
	//constructor
	public Item() {
		super();
	}

	public Item(int value, String creator) {
		super();
		this.value = value;
		this.creator = creator;
	}
	//getter setter
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	// method
	public void input() {
		Scanner sc = new Scanner(System.in);
		this.creator = sc.nextLine();
		this.value = sc.nextInt();
	}
	public void output() {
		System.out.println(this.value);
		System.out.println(this.creator);
	}
	
	

}
