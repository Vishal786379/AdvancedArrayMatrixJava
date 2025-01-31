package com.vishal.advancedArray;

import java.util.Scanner;

public class LowerTriangleMatrix {
	
	static void changeToLowerMatrix(int arr[][]) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(i<j) {
					arr[i][j]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		
		int matrix[][] = new int[size][size];
		
		MatrixMultiplication.inputMatrix(matrix, "Matrix : ");
		
		MatrixMultiplication.printMatrix(matrix, "Original Matrix : ");
		changeToLowerMatrix(matrix);
		MatrixMultiplication.printMatrix(matrix, "Lower Triangle Matrix : ");
		
	}

}
