package ArraysInJava;

import java.util.Scanner;

public class CeilAndFloor {
	public static void fun(int[] arr,int num) {
	      int low = 0, high = arr.length-1;
	      int floor = 0;
	      int ceil = 0;
	      while(low <= high) {
	    	 int mid = (low + high) / 2; 
	    	 if(  arr[mid] < num) { 
	    		  low = mid+1;
	    		  floor = arr[mid];
	    	 }
	    	 else if(arr[mid] == num) {
	    		ceil = arr[mid]; 
	    		floor = arr[mid];
	    		break;
	    		
	    	 }
	    	 else {
	    		 
	    		 high = mid - 1;
	    		 ceil = arr[mid];
	    	 }
	      }
	      System.out.println("floor:"+floor+" "+"ceil:"+ceil);
	}

	public static void main(String[] args) {
		  Scanner  sc = new Scanner(System.in);
		    System.out.println("enter no. of elements in array");
		    int n = sc.nextInt();
		    System.out.println("number entered");
		    int num = sc.nextInt();
		    int arr[] = new int[n]; 

	        System.out.println("pls enter elements of arrays");
		    for(int i=0;i<n;i++) {
			    arr[i] = sc.nextInt();
		    }
		    fun(arr,num);

	}

}
