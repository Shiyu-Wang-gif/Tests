package com.wang;

import java.util.Scanner;

public class Vehicle {
	// field
	double speed;
	double size;
	
	// constructor
	{
		System.out.println("constructor code block");
	}
	
	public Vehicle(double speed, double size) {
		this.speed = speed;
		this.size = size;
	}
	
	// method
	void printField() {
		System.out.println("Speed: " + this.speed + "\nSize: " + this.size);
	}
	
	void setSpeed(double speed) {
		this.speed = speed;
	}
	
	void speedUp() {
		this.speed = this.speed + 1;
	}
	
	void speedDown() {
		this.speed = this.speed - 1;
	}
	
	// main
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(10, 5);
		vehicle1.printField();
		
		vehicle1.setSpeed(29);
		vehicle1.printField();
		
		vehicle1.speedUp();
		vehicle1.printField();
		
		vehicle1.speedDown();
		vehicle1.printField();
	}
	
	// static code block
	static {
		System.out.println("static code block");
	}
}