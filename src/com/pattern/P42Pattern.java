package com.pattern;

import java.util.Scanner;

public class P42Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
//			int x=1;
			for (int k = i; k <= n - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=  i; j++) {
				System.out.print(j+" ");
				if(i!=j)
					System.out.print("* ");
//				if (j % 2 == 0) {
//					System.out.print("* ");
//					x++;
//				}
//				else
//					System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
