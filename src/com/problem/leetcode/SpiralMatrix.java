package com.problem.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		String[][] matrix5 = { { "1", "2", "3", "4", "5" }, 
				{ "6", "7", "8", "9", "10" },
				{ "11", "12", "13", "14", "15" }, 
				{ "16", "17", "18", "19", "20" }, 
				{ "21", "22", "23", "24", "25" } };

		List<String> result = spriralMatrix(matrix5);
		System.out.println(result);
		
	}
	
	private static List<String> spriralMatrix(String[][] matrix){	
		
		int top=0, left=0;
		int bottom= matrix.length -1;
		int right = matrix[0].length -1;
		List<String> spiralString = new ArrayList<>();
		
		while(top<=bottom && left<=right ) {
			for (int i = left; i <= right; i++) {
				spiralString.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				spiralString.add(matrix[i][right]);
			}
			right--;

			for (int i = right; i >= left; i--) {
				spiralString.add(matrix[bottom][i]);
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				spiralString.add(matrix[i][left]);
			}
			left++;
			
		}
		return spiralString;		
	}
}
