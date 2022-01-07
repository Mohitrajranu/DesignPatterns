package org.mohit.collectionPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

	ArrayList <String> menuItems;
	public PancakeHouseMenu() {
		menuItems = new ArrayList<String>();
		addItem("--------------");
		addItem("Regular Pancake Breakfast");
		addItem("--------------");
		// TODO Auto-generated constructor stub
	}

	private void addItem(String name) {
		// TODO Auto-generated method stub
		menuItems.add(name);
	}
	
	public ArrayList<String> getMenuItems()
	{
		return menuItems;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PancakeHouseMenuIterator(menuItems);
	}
	
	public String toString()
	{
		return "PancakeHouse Menu";
	}
}
