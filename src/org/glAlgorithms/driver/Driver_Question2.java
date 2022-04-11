package org.glAlgorithms.driver;

import java.util.Scanner;

import org.glAlgorithms.services.MergeSort;

/**
 * @return This class is used to generate the minimum number of notes with the
 *         available denominations for a given amount
 *
 */
public class Driver_Question2 {

	public static void main(String[] args) {

		MergeSort ms = new MergeSort();

		System.out.println("Enter number of Denominations");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the denominations");
		int denominations[] = new int[n];

		for (int i = 0; i < n; i++) {
			denominations[i] = sc.nextInt();
		}
		ms.mergeSort(denominations, 0, denominations.length - 1);

		System.out.println("Enter the amount");

		int amount = sc.nextInt();

		int count[] = new int[denominations.length];

		for (int i = 0; i < denominations.length; i++) {
			if (amount >= denominations[i]) {
				int x = amount / denominations[i];
				amount = amount - (denominations[i] * x);
				count[i] = x;
			}
		}

		if (amount > 0) {
			System.out.println("Not possible to pay the amount");
		} else {
			System.out.println("Your payment is made with minimun number of notes as below");

		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(denominations[i] + ":" + count[i]);
		}
		
		sc.close();
		
	}

}
