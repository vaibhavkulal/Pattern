package com.exam;

import java.util.Scanner;

public class Partic1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n=s.nextInt();

		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				for(int z=i+2;z<=i;z--) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}

			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
