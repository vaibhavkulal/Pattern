package com.pattern;

import java.util.Scanner;

public class P30Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the n value");
		int n=s.nextInt();
	

		for(int i=1;i<=n;i++)
		{
			int x=i,diff=n-1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
//				x=x+(n-j);
				x=x+diff;
				diff--;
			}
			System.out.println();
		}
	}

}
