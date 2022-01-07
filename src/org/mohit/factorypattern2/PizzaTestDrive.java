package org.mohit.factorypattern2;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore =new NyPizzaStore();
		PizzaStore chicagostore =new ChicagoPizzaStore();
		
		Pizza pizza=nyStore.orderPizza("cheese");
		System.out.println("Han ordered a" + pizza.getName() + "\n");
		pizza =chicagostore.orderPizza("veggie");
		System.out.println("Jod ordered a " + pizza.getName() + "\n");
	}
}
