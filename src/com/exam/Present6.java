package com.exam;

import java.util.Scanner;

public class Present6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1){
				System.out.print("* ");
			}
			else if(j==n/2+1) {
				System.out.print("* ");
			}
			else if(i==n&&j<=n/2+1) {
				System.out.print("* ");
			}

			else if(j==1&&i>=n/2+2) {
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
