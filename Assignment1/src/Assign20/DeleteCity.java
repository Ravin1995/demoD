package Assign20;

import java.util.ArrayList;
import java.util.List;

public class DeleteCity {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Delhi");
		list.add("pune");
		list.add("Banglore");
		list.add("Agra");
		list.add("Aurangabad");
		
		for(int i=0;i<list.size();i++) {
			list.remove("Agra");	
		}
		System.out.println(list);
	}

}
