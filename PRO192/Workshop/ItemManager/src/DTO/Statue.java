package DTO;

import java.util.Scanner;

public class Statue extends Item {
	private int weight;
	private String colour;
	
	public Statue() {
		super();
	}

	public Statue(int weight, String colour,int value, String creator) {
		super(value,creator);
		this.weight = weight;
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void InputStatue() {
		input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a weight:");
		weight = sc.nextInt();
		System.out.println("Input a colour:");
		sc = new Scanner(System.in);
		colour = sc.nextLine();

	}
	public void outputStatue(){
	      output(); // call the inherited method to print two fields out: value, creator
	      System.out.println("Weight: " + weight);
	      System.out.println("Colour: "+ colour);
	   }

	

}
