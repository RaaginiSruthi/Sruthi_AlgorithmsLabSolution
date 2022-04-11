package com.glAlgorithms.PayMoney_Question1;

import java.util.Scanner;

/**
 * @return This class is used to determine if PayMoney achieves it's daily
 *         target and if yes, the transaction number at which the target is
 *         achieved.
 *
 */
public class PayMoney {

	public static void main(String[] args) {

		int[] tArr;
		int size = 0, tnum = 0, target = 0;
		boolean flag = false;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the size of transaction array");

			size = sc.nextInt();
			tArr = new int[size];

			System.out.println("Enter the values of array");

			for (int i = 0; i < size; i++)
				tArr[i] = sc.nextInt();

			// To take target number from user
			System.out.println("Enter the total no of targets that needs to be achieved");

			tnum = sc.nextInt();

			for (int j = 1; j <= tnum; j++) {

				System.out.println("Enter the value of target");
				target = sc.nextInt();

				int sum = 0;
				int k;
				for (k = 0; k < size; k++) {
					sum += tArr[k];

					if (sum >= target) {
						System.out.println("Target achieved after " + (k + 1) + " transactions");
						flag = true;
						break;
					} else if (sum < target) {
						flag = false;
					}
				}
				if (flag != true) {
					System.out.println("Given target is not achieved");
				}
			}

			sc.close();
		}

	}

}
