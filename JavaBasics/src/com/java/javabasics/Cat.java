package com.java.javabasics;

public class Cat extends Animal {
	void meow(){
		System.out.println(name+" is meowing");
	}
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
