package org.mohit.factorypattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimplePizzaFactory factory=new SimplePizzaFactory();
		PizzaStore store= new PizzaStore(factory);
		
		Pizza pizza=store.orderPizza("cheese");
		System.out.println("We ordered a"+pizza.getName()+"\n");
		System.out.println(pizza);
	}

}
