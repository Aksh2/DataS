package gsol;


public class BinArray {
	
	/*
	 * [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
	 *	0) left = 0 & right =9
	 *	1) left=1 & right=9, [0,0,0,1,0,0,1,1,1,1], left=2 & right=8
	 *	2) left=3 & right=5  [0,0,0,0,0,1,1,1,1,1] left=4 & right=5
	 */

	public static void main(String[] args) {
		BinArray binaryArray = new BinArray();
		int[] array = new int[] {0, 0, 0, 0, 0,0, 0, 0, 0, 0};
		binaryArray.sortArray(array, array.length);
	}
	
	public void sortArray(int[] input,int size) {
		int left=0, right=size-1;
		while(left<right) {
			
			while(input[left]==0 & left<right)
				left++;
			
			while(input[right]==1 & left<right)
				right--;
			
			if(left<right) {
				input[left]=0;
				input[right]=1;
				left++;
				right--;
			}
			
		}
		printArray(input);
	}
	
	public void printArray(int[] input) {
		for(int number: input) {
			System.out.print(number+" ");
		}
	}

}
