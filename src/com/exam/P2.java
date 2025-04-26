package com.exam;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of n");
		int n=s.nextInt();
		int x=1;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				
				System.out.print("* ");
				x++;
				if(x>9)
					x=1;
			}
			System.out.println();
		}
	}
}