package Assign20;

import java.util.Scanner;

public class ReverseString {
	
	public String getReverse(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse = reverse+input.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	ReverseString reverse1= new ReverseString();
	//String rev=reverse1.getReverse("Ravin");
	System.out.println("Enter the name");
	String str=sc.next();
	System.out.println(reverse1.getReverse(str));
	
	}

}
