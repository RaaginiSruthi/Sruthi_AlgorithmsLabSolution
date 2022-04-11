package org.glAlgorithms.services;


public class MergeSort {
	
	/**
	 * @return This method is used to divide the array into two sub arrays, sort them and merge them
	 * @param array
	 * @param leftIndex
	 * @param rightIndex
	 */
	public void mergeSort(int array[], int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {

			// mid is the point where the array is divided into two sub arrays
			int mid = (leftIndex + rightIndex) / 2;

			// recursive call to each sub arrays
			mergeSort(array, leftIndex, mid);
			mergeSort(array, mid + 1, rightIndex);

			// Merge the sorted sub arrays
			merge(array, leftIndex, mid, rightIndex);
		}
	}

	
	
	/**
	 * @return - This method is used to merge the arrays based on indices
	 * @param array
	 * @param left
	 * @param mid
	 * @param right
	 */
	public void merge(int array[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		//create temporary space
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		// fill the left and right array
		for (int i = 0; i < n1; i++)
			leftArr[i] = array[left + i];
		for (int j = 0; j < n2; j++)
			rightArr[j] = array[mid + 1 + j];

		// Maintain current index of sub-arrays and main array
		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		// Until we reach either end of either left array (leftArr) or rightArray(rightArr), pick larger among
		// elements and place them in the correct position 
		while (i < n1 && j < n2) {
			if (leftArr[i] >= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			} else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}

		// When we run out of elements in either leftArr or rightArr,
		// pick up the remaining elements and put in the array
		while (i < n1) {
			array[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
	}

}
