package com.exam;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
