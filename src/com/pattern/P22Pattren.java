package com.pattern;

import java.util.Scanner;

public class P22Pattren {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}

}
