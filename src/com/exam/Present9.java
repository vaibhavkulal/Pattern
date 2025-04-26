package com.exam;

import java.util.Scanner;

public class Present9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter odd number of rows (like 7): ");
        int ch = 65; // ASCII of 'A'
        int maxChar = 77; // ASCII of 'M'
        int n = 7; // Fixed to 7 lines for this pattern
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            int row = i <= mid ? i : n - i + 1;

            // Check if enough characters are left
            if (ch + row * 2 - 1 > maxChar) {
                continue; // skip printing this row if characters exceed 'M'
            }

            // Print leading spaces
            for (int sp = 1; sp <= mid - row; sp++) {
                System.out.print(" ");
            }

            // First block
            for (int j = 1; j <= row && ch <= maxChar; j++) {
                System.out.print((char)(ch++));
            }

            System.out.print(" ");

            // Second block
            for (int j = 1; j <= row && ch <= maxChar; j++) {
                System.out.print((char)(ch++));
            }

            System.out.println();
        }

        s.close();
    }
}
