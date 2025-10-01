package com.problem.array;

public class MergeIntervals {
	
	public static void main(String[] args) {
		int arr[][] = {{1,4},{0,2},{3,5}};			
				
		int[][] sortedIntervals = merge(arr);
		for (int i[] : sortedIntervals) {
			System.out.println(i[0] + " " + i[1]);
		}
	}

	public static int[][] merge(int[][] intervals) {
	
		int[][] sortedIntervals	= mergeSort(intervals, 0, intervals.length-1);
		sortedIntervals = mergeOverlappingIntervals(sortedIntervals);
		return sortedIntervals;
	        
	}
	
	private static int[][] mergeSort(int[][] intervals, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(intervals, left, mid);
			mergeSort(intervals, mid + 1, right);
			merge(intervals, left, mid, right);
		}
		return intervals;
	}
	
	private static void merge(int[][] intervals, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		 int[][] L = new int[n1][2];
		 int[][] R = new int[n2][2];

		for (int i = 0; i < n1; i++) {
			L[i][0] = intervals[left + i][0];
			L[i][1] = intervals[left + i][1];
		}

		for (int i = 0; i < n2; i++) {
			R[i][0] = intervals[mid + 1 + i][0];
			R[i][1] = intervals[mid + 1 + i][1];
		}

		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i][0] <= R[j][0]) {
				intervals[k] = L[i];
				i++;
			} else {
				intervals[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			intervals[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			intervals[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static int[][] mergeOverlappingIntervals(int[][] intervals) {
	    if (intervals.length == 0) return new int[0][2];

	    // Use a list to store merged intervals
	    java.util.List<int[]> merged = new java.util.ArrayList<>();
	    int[] current = intervals[0];

	    for (int i = 1; i < intervals.length; i++) {
	        if (current[1] >= intervals[i][0]) { // Overlap
	            current[1] = Math.max(current[1], intervals[i][1]);
	        } else {
	            merged.add(current);
	            current = intervals[i];
	        }
	    }
	    merged.add(current);

	    return merged.toArray(new int[merged.size()][]);
	}
}
