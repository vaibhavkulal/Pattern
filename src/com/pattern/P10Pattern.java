package com.pattern;

import java.util.Scanner;

public class P10Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				System.out.print(x%2+" ");
				x++;
			}
//			for(int j=0;j<n;j++) { 
//				if((i+j)%2==0)
//					System.out.print(1+" ");
//				else
//					System.out.print(0+" ");
//				System.out.print((i+j)%2==0? "1 ":"0 ");
//				System.out.print((i+j)%2+" ");
//			}
			System.out.println();
		}
		
	}

}
