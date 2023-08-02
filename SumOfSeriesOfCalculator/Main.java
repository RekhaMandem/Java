package com.kodnest.SumOfSeriesOfCalculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value to find sum of series");
		int N = scan.nextInt();
		double sum = 0.0;
		for (int i = 1; i <= N; i++) {
			sum = sum + 1.0 / i;
		}
		System.out.println(sum);

	}
}
