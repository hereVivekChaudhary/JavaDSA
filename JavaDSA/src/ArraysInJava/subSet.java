package ArraysInJava;
import java.util.*;
public class subSet {
	public static void Set(int[] arr) {
	     int limit = (int) Math.pow(2, arr.length);
	     for(int i=0;i<limit;i++) {
	    	 String set = "";
	    	 int temp = i;
	    	 for(int j=arr.length-1;j>=0;j--) {
	    		 int r = temp % 2;
	    		 temp /= 2;
	    		 if(r == 0) {
	    			set = '-' + " " + set; 
	    		 }
	    		 else {
	    			 set = arr[j] + " " + set;
	    		 }
	    	 }
	    	
	     System.out.println(set);
	     }
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Set(arr);
	}

}
