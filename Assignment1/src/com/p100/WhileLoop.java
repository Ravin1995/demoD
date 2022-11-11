package com.p100;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n!=0) {
		System.out.println("loop execute");
			System.out.println("Take your input");
			break;
		}
		System.out.println("out of loop");
		System.out.println(n);
		
	}

}
