package org.mohit.collectionPattern;

public class Cafe {

	public static void main(String[] args) {
		
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		java.util.Iterator pancakeIterator =pancakeHouseMenu.createIterator();
		java.util.Iterator dinerIterator =dinerMenu.createIterator();
		
		System.out.println("\n Menu \n-----\n BREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\n LUNCH");
		printMenu(dinerIterator);
	}
private static void printMenu(java.util.Iterator iterator)
{
	while(iterator.hasNext())
	{
		String menuItem =(String)iterator.next();
		System.out.println(menuItem);
	}
}
}
