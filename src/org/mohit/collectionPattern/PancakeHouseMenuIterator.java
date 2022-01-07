package org.mohit.collectionPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList <String> items;
	int position=0;
	
	public PancakeHouseMenuIterator(ArrayList<String> items) {
		
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >=items.size()){
			return false;
		}
		else{
		return true;
	}
		}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String menuItem =(String)items.get(position);
		position=position + 1;
		return menuItem;
	}

}
