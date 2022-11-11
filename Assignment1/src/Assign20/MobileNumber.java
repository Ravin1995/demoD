package Assign20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MobileNumber {
	public static void main(String[] args) {
		List<String>list= new ArrayList<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter city name");
			Scanner sc =new Scanner(System.in);
			String city=sc.next();
		     list.add(city);
		}
		Iterator<String>iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
