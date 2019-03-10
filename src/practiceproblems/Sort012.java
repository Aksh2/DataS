package practiceproblems;

import java.util.HashMap;
import java.util.Map;

import gsol.BinArray;

public class Sort012 {

	public static void main(String[] args) {
		Sort012 sortarray = new Sort012();
		int[] array = new int[] {0,1, 0, 2, 1,1, 0, 1, 1, 2,1,2,1,1, 0,1,1, 0,1,1, 0};  //new int[] {1,0,2};
		sortarray.sort(array);
	}
	
	public  void sort(int[] input) {
		//int index=0,next=index+1;
		int zeros,ones;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int index=0;index<input.length;index++) {
			if(map.containsKey(input[index])) {
				int count = map.get(input[index]);
				map.put(input[index], count+1);
			}else {
				map.put(input[index], 1);
			}
		}
		System.out.println(map.entrySet());
		for(zeros=0;zeros<(map.get(0)!=null?map.get(0):0);zeros++) {
			input[zeros]=0;
		}
		System.out.println("zero:"+zeros);

		for(ones=zeros;ones<(map.get(1)!=null?map.get(1):0)+zeros;ones++) {
			input[ones]=1;
		}
		System.out.println("ones:"+ones);

		for(int twos=ones;twos<input.length;twos++) {
			input[twos]=2;
		}
//		while(index<next && next<input.length) {
//			switch(input[index]) {
//			case 0:
//				index+=1;
//				if(next<input.length)
//					next+=1;
//				else
//					next=index+1;
//				break;
//			case 1:
//				if(input[index]>input[next]) {
//					int temp=input[next];
//					input[next]=input[index];
//					input[index]=temp;
//				
//				}else {
//					if(next==input.length) {
//						next=index+1;
//					}
//					next+=1;
//				}
//			break;	
//			case 2:
//				if(input[index]>input[next]) {
//					int temp=input[next];
//					input[next]=input[index];
//					input[index]=temp;
//					//index+=1;
//					//next+=1;
//				}else {
//					index+=1;
//					next+=1;
//				}
//				break;
//			}
//		}
		printArray(input);
	}
	
	public void printArray(int[] input) {
		for(int number: input) {
			System.out.print(number+" ");
		}
	}

}
