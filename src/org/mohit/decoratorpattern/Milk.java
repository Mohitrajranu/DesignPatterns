package org.mohit.decoratorpattern;

public class Milk extends CondimentDecorator{
	
	Beverage beverage;
	public Milk(Beverage beverage)
	{
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.description+ ",Milk";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+beverage.cost();
	}

}
