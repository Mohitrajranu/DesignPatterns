package org.mohit.strategypattern;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
System.out.println("I can't make noise");
	}

}
