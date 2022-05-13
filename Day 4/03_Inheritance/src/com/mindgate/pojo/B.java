package com.mindgate.pojo;

public class B extends A {
	@Override
	public void display() {
		super.display();
		System.out.println("Hello");
	}
//	public void print() {
//		System.out.println("in class B print()");
//		A a = new A();
//		a.display();
//	}
}
