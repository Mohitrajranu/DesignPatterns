package org.mohit.decoratorpattern;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage beverage=new HouseBlend();
		System.out.println(beverage.getDescription() +"$"+beverage.cost());
		
	}

}
/*
Beverage beverage2=new Espresso();
beverage2=new Soy(beverage2);
*beverage2=new Mocha(beverage2);
*System.out.println(beverage2.getDescription() +"$"+beverage2
*.cost());
*/