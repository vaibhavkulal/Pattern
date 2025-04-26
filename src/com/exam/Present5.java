package com.exam;

import java.util.Scanner;

public class Present5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1){
				System.out.print("* ");
			}
			else if(j==n) {
				System.out.print("* ");
			}
			else if(i==n/2+1) {
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
			System.out.println();
		}

	}

}
