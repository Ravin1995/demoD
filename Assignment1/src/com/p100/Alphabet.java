package com.p100;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
	int a, b, c ,d;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Enter the second number");
	b=sc.nextInt();
	for( c =a;c<=b;c++) {
		for(d=1;d<=10;d++)
		System.out.println(c*d);
	}
     //System.out.println();
	
	
	}
}
