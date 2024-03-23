package ArraysInJava;
import java.util.*;
import java.util.Scanner;

public class qQuery {
//	public static void search(int arr[] ,int k) {
//		int n = arr.length;
//		int flag = 1;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == k) {
//				flag = 0;
//				System.out.println("present");
//				
//				break;
//			}
//			
//		}
//		if(flag == 1) {
//		     System.out.println("not present");
//	      }
//	    else {
//		     System.out.println(" present");
//	    }
	//}
	public static int[] makeFreqArray(int arr[]) {
		int freq[] = new int[10005];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
  public static void main(String args[]) {
        Scanner  sc = new Scanner(System.in);
	    System.out.println("enter no. of elements in array");
	    int n = sc.nextInt();
	    int arr[] = new int[n]; 

        System.out.println("pls enter elements of arrays");
	    for(int i=0;i<n;i++) {
		    arr[i] = sc.nextInt();
	}	
	    int freq[] = makeFreqArray(arr);
	    System.out.println("no.of query:");
	    int q = sc.nextInt();
	    while(q-- > 0) {
	    	System.out.println(" elemennt want to be search");
	    	int k =sc.nextInt();
	    	if(freq[k] > 0) {
	    		System.out.println("yes");
	    	}
	    	else {
	    	   System.out.println("no");
	    	}
	    }
	    System.out.println("exit");
  
}
}
