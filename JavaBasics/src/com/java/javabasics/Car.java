package com.java.javabasics;

public class Car extends Vehicle {
	public Car(){
	}
	public Car(String name){
		this.name=name;
	}
	
	void colour(){
		System.out.println(name+" color is red");
	}
	void horns(){
		System.out.println("Car horns");
	}
	void speeds(){
		System.out.println(name+" is speeding");
	}
}
