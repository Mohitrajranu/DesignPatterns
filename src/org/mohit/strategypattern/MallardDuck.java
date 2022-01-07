package org.mohit.strategypattern;

public class MallardDuck extends Duck {

	public MallardDuck() {
		
		quackBehavior= new Quack();
		flyBehavior= new FlyWithWings();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
		
	}

	
}
