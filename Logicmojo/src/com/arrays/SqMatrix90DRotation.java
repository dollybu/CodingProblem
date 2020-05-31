package com.arrays;

//without extract Space
public class SqMatrix90DRotation {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}
		             };
		
		rotatedMatrix(arr,3,4);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++)
				System.out.print(arr[i][j]+" ");
		      System.out.println("  ");
		}
		
		
		
	}

	private static void rotatedMatrix(int[][] arr, int m, int n) {
		
		for(int x=0;x<m/2;x++)
		{
			for(int y=x;y<m;y++)
			{
				int temp =arr[y][m-x];
				arr[y][m-x]=arr[x][y];
				arr[x][y]=arr[m-y][x];
				arr[m-y][x]=arr[m-x][m-y];
				arr[m-x][m-y]=temp;
				
				
				
			}
			
			
		}
	}
}
