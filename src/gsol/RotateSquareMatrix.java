package gsol;

public class RotateSquareMatrix {

	public RotateSquareMatrix() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		RotateSquareMatrix square = new RotateSquareMatrix();
		square.rotateMatrix(a);
		square.printMatrix(a);
	}
	
	public void rotateMatrix(int a[][]) {
		int N = a.length;
		for(int i=0;i<N/2;i++) {
			for(int j=i;j<N-1-i;j++) {
				int temp = a[i][j];
				a[i][j]=a[N-1-j][i];
				a[N-1-j][i]=a[N-1-i][N-1-j];
				a[N-1-i][N-1-j]=a[j][N-1-i];
				a[j][N-1-i]=temp;
			}
		}
	}
	
	public void printMatrix(int a[][]) {
		int N = a.length;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
