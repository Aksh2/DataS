package gsol;

public class DutchNationFlag {

	public static void main(String args[]) {
		int[] array = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		DutchNationFlag dnf = new DutchNationFlag();
		dnf.sort(array, array.length);
	}
	
	public void sort(int array[],int length) {
		int temp=0,mid=0,low=0, high=length-1;
		while(mid<=high) {
		switch(array[mid]) {
		case 0:
			temp=array[mid];
			array[mid]=array[low];
			array[low]=temp;
			low++;
			mid++;
			break;
		case 1:
			mid++;
			break;
		case 2:
			temp=array[mid];
			array[mid]=array[high];
			array[high]=temp;
			high--;
			break;
			}
		}
		printArray(array);
		}
	
	public void printArray(int[] array) {
		for(int number:array) {
			System.out.print(number+" ");
		}
	
	}

}
