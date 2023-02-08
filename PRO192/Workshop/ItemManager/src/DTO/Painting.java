package DTO;

import java.util.Scanner;

public class Painting extends Item {
	private int height;
	private int width;
	private boolean isWatercolour;
	private boolean isFramed;
	
	
	public Painting() {
		super();
	}


	public Painting(int height, int width,int value, String creator, boolean isWatercolour, boolean isFramed) {
		super(value , creator);
		this.height = height;
		this.width = width;
		this.isWatercolour = isWatercolour;
		this.isFramed = isFramed;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public boolean isWatercolour() {
		return isWatercolour;
	}


	public void setWatercolour(boolean isWatercolour) {
		this.isWatercolour = isWatercolour;
	}


	public boolean isFramed() {
		return isFramed;
	}


	public void setFramed(boolean isFramed) {
		this.isFramed = isFramed;
	}
	
	public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter height: "); height = sc.nextInt();
        System.out.print("Enter width: "); width = sc.nextInt();
        System.out.print("Is water colour? "); isWatercolour = sc.nextBoolean();
        System.out.print("Is framed? "); isFramed = sc.nextBoolean();    
    }
	
	public void outputPainting() {
        output();
        System.out.print("Height: " + height); 
        System.out.print("Width: " + width); 
        System.out.print("Is water colour: " + isWatercolour); 
        System.out.print("Is framed: "+ isFramed); 
    }
	

}
