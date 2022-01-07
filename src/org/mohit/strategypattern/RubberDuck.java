package org.mohit.strategypattern;

public class RubberDuck extends Duck {

	
	public RubberDuck() {
	
		flyBehavior = new FlyNoway();
		quackBehavior = new Squeak();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a rubber duck");
		
	}

}
