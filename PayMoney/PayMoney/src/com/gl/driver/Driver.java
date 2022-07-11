package com.gl.driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array i.e Number of days you want transcation");

		size = sc.nextInt();
		int transactions[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter daily transcations in crores of day: " + (i + 1));
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the target amount in Crores which you want to achive");
		int target = sc.nextInt();

		PayMoney pm = new PayMoney();
		int numberOfDays = pm.numberOfDays(transactions, target);
		if (numberOfDays == -1)
			System.out.println("The target " + target + " is not achived!!!");
		else {
			System.out.println("The target " + target + " Corors is achived in " + numberOfDays + " Transaction");
		}

		sc.close();

	}

}
