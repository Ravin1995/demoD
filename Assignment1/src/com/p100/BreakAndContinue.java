package com.p100;

import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the input");
			n=sc.nextInt();
			if(n!=0) {
				System.out.println("if execute");
				break;
			}
			else {
				System.out.println("else execute");
				break;
			}
			
		}
		
	}

}

