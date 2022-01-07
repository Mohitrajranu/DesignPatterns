package org.mohit.collectionPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

	String [] items;
	int position =0;
	
	public DinerMenuIterator(String[] menuItems) {
		// TODO Auto-generated constructor stub
		this.items =items;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=items.length || items[position]==null)
		{
			return false;
		}else
		{
		return true;
	}}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String menuItem = items[position];
		position =position + 1;
		return menuItem;
	}

}
