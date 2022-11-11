package com.assignment21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public List<String> getSortElement(){
		List<String> list = new ArrayList<String>();
		list.add("Manik");
		list.add("Shivam");
		list.add("Ravin");
		list.add("Ganesh");
		return list;
		
	}

	public static void main(String[] args) {
		SortList list1 = new SortList();
		
		List<String> assending=list1.getSortElement();
		Collections.sort(assending);
		System.out.println(assending);
		for(int i= assending.size()-1;i>=0;i--) {
			System.out.println(assending.get(i));
			
		}
		
	

	}

}
