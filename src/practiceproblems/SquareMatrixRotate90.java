package practiceproblems;

import java.util.Scanner;

public class SquareMatrixRotate90 {
	
	public static void main(String args[]) {
		SquareMatrixRotate90 rotate = new SquareMatrixRotate90();
		//rotate.rotateSquareMatrix(new int[][] {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}});
		System.out.println("Enter the size of the matrix");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int[][] a = new int[size][size];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				a[i][j]=sc.nextInt();
			}
		}			
		rotate.rotateSquareMatrix(a);
	}
	
	public void rotateSquareMatrix(int[][] a) {
		int length=a.length;
		int[][] temp=new int[length][length];
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				temp[i][j]=a[i][j];
			}
		}
		
		System.out.println("length: " + length);
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}

		int row,col;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				row=j;
				col=(length-1)-i;
				a[row][col]=temp[i][j];				
			}			
		}
		System.out.println("After rotating 90 degrees ...");
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
