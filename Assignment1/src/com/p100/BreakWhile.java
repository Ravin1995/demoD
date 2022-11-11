package com.p100;

import java.util.Scanner;

public class BreakWhile {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter input");
			n=sc.nextInt();
			
			if(n==0) {
				System.out.println("print the number "+n);
				break;
		}
			System.out.println("Ravin");
		}
	}
}

