package org.mohit.factorypattern;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName()
	{
		return name;
	}
	
	public void prepare()
	{
		System.out.println("preparing" +name);
	}
	
	public void bake ()
	{
		System.out.println("Baking" +name);
	}
	
	public void cut (){
		System.out.println("Cutting" +name);
	}
	
	public String toString()
	{
		StringBuffer display=new StringBuffer();
		display.append("----"+name+"----\n");
		display.append(dough+"\n");
		display.append(sauce+"\n");
		for (int i=0;i<toppings.size();i++)
		{
			display.append((String)toppings.get(i) +"\n");
		}
		return display.toString();
		
	}
}
