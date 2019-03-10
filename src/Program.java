

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Program {

	    // Complete the repeatedString function below.
	    static long repeatedString(String s, long n) {
	        Long count=0L;
	        int length=s.length();
	        Map<Long,Long> map = new HashMap<Long,Long>();
	        if(length==1 && s.charAt(0)=='a'){
	            return n;
	        }
	        map.put(0L,0L);
	        for (int i = 0; i < length; i++) {
	            char ch = s.charAt(i);
	            if (ch == 'a') {
	                Long frequency=map.get(i);
	                map.put(Long.valueOf(i+1),frequency+1);
	            }else{
	                map.put(Long.valueOf(i+1),map.get(i));
	            }
	        }
	        Long reminder=0L,difference=0L;
	        if(n>length){
	            reminder=n%length;
	            difference=n-reminder;
	            count=map.get(difference)+((n-difference)*map.get(length));
	        }else{
	            count=map.get(length);
	        }
	        
	        /*for(int i=0;i<n;i++){
	          char ch = s.charAt(i%length);
	            if(ch=='a'){
	                count++;
	            }
	        }*/
	        return count;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	        long n = scanner.nextLong();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long result = repeatedString(s, n);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}


