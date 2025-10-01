package com.problem.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 6, 3, 8, 2, 1, 9, 7 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static void bubbleSort(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
}
