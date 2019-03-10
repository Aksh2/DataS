package practiceproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution {
	int[] inputArray;
	public static void main(String[] args) {
		int size=0;
        solution s = new solution();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("No. of tests: " + t);
        for (int n = 0; n < t; n++) {
            size = sc.nextInt();
            System.out.println("Size: " + size);
            s.inputArray= new int[size];
            for(int i=0;i<size;i++) {
            		s.inputArray[i]=sc.nextInt();
            		System.out.print(s.inputArray[i]+" ");
            }
            
        }
        
        s.maxSubArray(s.inputArray,size);

    }
	
	public void maxSubArray(int[] inputArray,int length) {
		List<Integer> sums = new ArrayList<Integer>();
		if(inputArray.length>2) {
		for(int index=0;index<inputArray.length;index++) {
			int sum=0;
			while(index+1<length&&(inputArray[index+1]-inputArray[index])==1) {
				sum+=inputArray[index];
				index++;
			}
			sum+=inputArray[index];
			sums.add(sum);
			
		}
		}
		Collections.sort(sums);
		System.out.println("output: " +sums.get(sums.size()-1));
		
	}

}
