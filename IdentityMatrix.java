package com.vishal.advancedArray;

import java.util.Scanner;

public class IdentityMatrix {
	
	static boolean checkIdentityMatrix(int arr[][]) {
		int row=arr.length;
		int col = arr[0].length;
		if(row!=col) {
			return false;
		}else {
			
			boolean flag = true;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i==j) {
						//diagonal element
						if(arr[i][j]==1) {
//							continue;
						}else {
							flag = false;
							break;
						}
					}else {
						//on diff element
						if(arr[i][j]==0) {
							
						}else {
							flag = false;
							break;
						}
					}
				}
				if(!flag) {
					break;
				}
			}
			return flag;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");
		int row=sc.nextInt();
		
		System.out.println("Enter Cols");
		int col=sc.nextInt();
		
		int matrix[][]=new int[row][col];
		
		MatrixMultiplication.inputMatrix(matrix, "Matrix : ");
		
		MatrixMultiplication.printMatrix(matrix, "Original Matrix : ");
		
		boolean result = checkIdentityMatrix(matrix);
		if(result) {
			System.out.println("Matrix is an Identity");
		}else {
			System.out.println("Matrix is not an Identity");
		}
	}

}
