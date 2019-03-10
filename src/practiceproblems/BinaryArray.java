package practiceproblems;

public class BinaryArray {

	public static void main(String[] args) {
		BinaryArray binaryArray = new BinaryArray();
		binaryArray.sortArray(new int[] {1});
	}
	
	public void sortArray(int[] input) {
		printArray(input);
		System.out.println();
		int firstPointer=0,lastPointer=input.length-1;
		while(firstPointer!=lastPointer) {
			if(input[firstPointer]==0) {
				firstPointer+=1;
			}
			else if(input[firstPointer]==1) {
				if(input[lastPointer]==1) {
					lastPointer-=1;
				}else {
					int temp=-1;
					temp=input[lastPointer];
					input[lastPointer]=input[firstPointer];
					input[firstPointer]=temp;
				}
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
