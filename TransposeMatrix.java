package com.vishal.advancedArray;

import java.util.Scanner;

public class TransposeMatrix {
	
	static int[][] transpose(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		
		int result[][]=new int[col][row];
		
		for(int i =0;i<col;i++) {
			for(int j =0;j<row;j++) {
				result[i][j]=arr[j][i];
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows :");
		int row=sc.nextInt();
		
		System.out.println("Enter Cols :");
		int col=sc.nextInt();
		
		int matrix[][]=new int[row][col];
		
		MatrixMultiplication.inputMatrix(matrix, "Matrix : ");
		MatrixMultiplication.printMatrix(matrix, "Original Matrix : ");
		
		int result[][]=transpose(matrix);
		MatrixMultiplication.printMatrix(result, "Transposed Matrix : ");
	}

}
