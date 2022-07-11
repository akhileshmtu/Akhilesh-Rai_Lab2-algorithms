package com.gl.travel;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Currency Denominations");
		int numberOfDenominations = sc.nextInt();
		int[] denominations = new int[numberOfDenominations];
		System.out.println("Enter the Currency Denomination");
		for (int i = 0; i < numberOfDenominations; i++) {
			denominations[i] = sc.nextInt();

		}
			System.out.println("Enter the Amount which you want to pay");
			int amount=sc.nextInt();
			for(int i : denominations)
			{
				System.out.println(i + " ");
				
			}
			System.out.println();
			Currency currency = new Currency(denominations, numberOfDenominations);
			MergeSort.sort(currency.denominations, 0, numberOfDenominations - 1);
			for(int i=0; i<numberOfDenominations; i++)
			{
				System.out.println(currency.denominations[i]+ " ");
			}
			System.out.println();
	}

}
