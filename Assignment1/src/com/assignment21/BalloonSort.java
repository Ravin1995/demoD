package com.assignment21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BalloonSort {

	public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("Red");
	list.add("Green");
	list.add("Red");
	list.add("Green");
	list.add("Green");
	list.add("Blue");
	list.add("Blue");
	list.add("Red");
	list.add("Red");
	LinkedList<String>list1=new LinkedList<>();
	System.out.println(list);
	for(String str:list) {
		if(str.equals("Red")) {
			list1.addFirst("Red");
		}
		else if(str.equals("Blue")){
			list1.add("Blue");
		
		}
	}
	for(String str:list) {
		if(str.equals("Green")) {
			list1.add("Green");
		}
	}
	

System.out.println(list);
System.out.println(list1);
	}

}
