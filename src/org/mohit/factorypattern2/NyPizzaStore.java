package org.mohit.factorypattern2;

public class NyPizzaStore extends PizzaStore {

	Pizza createPizza(String item)
	{
		if(item.equals("cheese"))
		{
			return new NyStyleCheesePizza();
		}
		else if(item.equals("veggie"))
		{
			return new NyStyleVeggiePizza();
		}
	else 
		return null;
}
	}

