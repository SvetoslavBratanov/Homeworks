package sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 3, 79, 347, 23, 21, 438, 256, 74, 5, 82 };
		// bubbleSort(arr);
		// selectionSort(arr);
		// countingSort(arr);
		// mergeSort(arr);
		int[] arr2 = {4,12,56,79,93,134,176,245,312,378,414,444};
		int x = 312;
		int index = binarySearch(arr2, x, 0, arr2.length - 1);
		System.out.println("Final: " + Arrays.toString(arr2));
		System.out.println("Index: " + index);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Final (2): " + Arrays.toString(arr));
	}

	static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean hasASwap = false;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					hasASwap = true;
				}
			}
			if (!hasASwap) {
				break;
			}
		}
	}

	static void selectionSort(int[] num) {
		int start = 0;
		int end = num.length - 1;
		for (int i = 0; i < num.length / 2; i++) {
			int maxIndex = start;
			int minIndex = start;
			for (int index = start; index <= end; index++) {
				if (num[index] > num[maxIndex]) {
					maxIndex = index;
				}
				if (num[index] < num[minIndex]) {
					minIndex = index;
				}
			}
			int temp = num[maxIndex];
			num[maxIndex] = num[end];
			num[end] = temp;

			if (minIndex == end) {
				minIndex = maxIndex;
			}

			temp = num[minIndex];
			num[minIndex] = num[start];
			num[start] = temp;

			end--;
			start++;
			System.out.println(Arrays.toString(num));
		}
	}

	static void countingSort(int[] array) {
		// find max in the array
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// create helper array
		int[] helper = new int[max + 1];
		// for each element in the array will counting how many times values occurs
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			helper[number]++;
		}
		System.out.println(Arrays.toString(helper));

		int originalIndex = 0;
		for (int i = 0; i < helper.length; i++) {
			int counter = helper[i];
			for (int p = 0; p < counter; p++) {
				array[originalIndex] = i;
				originalIndex++;
			}
		}
	}

	static int[] mergeSort(int[] array) {
		if (array.length > 1) {
			int elementsInA1 = array.length / 2;
			int elementsInA2 = array.length - elementsInA1;
			
			int[] arr1 = new int[elementsInA1];
			int[] arr2 = new int[elementsInA2];
			
			for (int i = 0; i < elementsInA1; i++) {
				arr1[i] = array[i];
			}
			for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++) {
				arr2[i - elementsInA1] = array[i];
			}
			
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);

			int indexArr = 0;
			int indexArr1 = 0;
			int indexArr2 = 0;
			
			while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
				if (arr1[indexArr1] < arr2[indexArr2]) {
					array[indexArr] = arr1[indexArr1];
					indexArr1++;
				} else {
					array[indexArr] = arr2[indexArr2];
					indexArr2++;
				}
				indexArr++;
			}
			while (indexArr1 < arr1.length) {
				array[indexArr] = arr1[indexArr1];
				indexArr++;
				indexArr1++;
			}
			while (indexArr2 < arr2.length) {
				array[indexArr] = arr2[indexArr2];
				indexArr++;
				indexArr2++;
			}
		}
		return array;
	}
	
	static int binarySearch(int[] arr, int x, int start, int end) {
		int mid = (start + end) / 2;
		if(start > end) {
			return -1;
		}
		if(x == arr[mid]) {
			return mid;
		}
		if(x < arr[mid]) {
			return binarySearch(arr, x, start, mid - 1);
		}
		if(x > arr[mid]) {
			return binarySearch(arr, x, mid + 1, end);
		}
		return -1;
	}
	
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	static int partition(int[] a, int left, int right) {
		
		int randomIndex = (int) (Math.random() * (right - left + 1)) + left;
		swap(a, right, randomIndex);
		
		int pivot = a[right];
		int k = left - 1 ;
		
		for(int index = left; index <= right; index++) {
			if(a[index] <= pivot) {
				k++;
				swap(a, k, index);
			}
		}
		return k;
	}
	static void quickSort(int[] a, int left, int right) {
		if(left >= right) {
			return;
		}
		int k = partition(a, left, right);
		quickSort(a, left, k - 1);
		quickSort(a, k + 1, right);
	}
}
