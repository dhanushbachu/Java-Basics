package com.java.javabasics;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		dog.name="Tommy";
		dog.age=3;
		dog.bark();
		dog.sleep();
		cat.name="Hash";
		cat.meow();
		tiger.name="Bengal tiger";
		tiger.roars();
		
		Rectangle r = new Rectangle();
		r.setHeight(2);
		r.setWidth(2);
		System.out.println(r.height+" "+r.width);
		Rectangle b = new Rectangle(5,10);
		System.out.println(b.height+" "+b.width);

		
		Vehicle v = new Vehicle();
		
		v.horns();
		v.speeds();
		
		Vehicle c = new Car("Benz");
		c.horns();
		c.speeds();
		//c.colour();
		
		
		
		
		
		
		
	}

}
