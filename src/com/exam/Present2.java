package com.exam;

import java.util.Scanner;

public class Present2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print(j+" ");
			}
			st++;
			System.out.println();
		}

	}

}
