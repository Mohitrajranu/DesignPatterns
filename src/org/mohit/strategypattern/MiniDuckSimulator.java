package org.mohit.strategypattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck mallard=new MallardDuck();
		RubberDuck rubberDuck= new RubberDuck();
		
		mallard.performQuack();
        rubberDuck.performQuack();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
        rubberDuck.performFly();

	}

}
