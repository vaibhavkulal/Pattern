package com.exam;

import java.util.Scanner;

public class Partic2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n=s.nextInt();

		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++) {
		
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
