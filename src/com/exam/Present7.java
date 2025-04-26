package com.exam;

import java.util.Scanner;

public class Present7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int st=1;
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print((char)(64+x)+" ");
				x++;
			}
			st++;
			System.out.println();
		}

	}

}
