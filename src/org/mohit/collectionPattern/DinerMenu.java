package org.mohit.collectionPattern;

import java.util.Iterator;

public class DinerMenu implements Menu {

	static final int MAX_ITEMS=6;
	int numberofItems=0;
	String[] menuItems;
	
	public DinerMenu()
	{
		menuItems = new String[MAX_ITEMS];
		addItem("Hotdog");
		addItem("Pasta");
	}
	
	public void addItem(String name)
	{
	if(numberofItems >=MAX_ITEMS)	
	{
		System.err.println("Sorry ,menu is full can't add item to menu");
	}
	else{
		menuItems[numberofItems] =name;
		numberofItems =numberofItems +1;
	}
	}
	
	public String[] getMenuItems()
	{
		return menuItems;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(menuItems);
	}
	
	public String toString()
	{
		return "Diner Menu";
	}

}
