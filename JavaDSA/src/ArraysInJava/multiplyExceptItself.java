package ArraysInJava;

import java.util.Scanner;

public class multiplyExceptItself {
	public static int[] multiply(int[] arr) {
		int n = arr.length;
		int pref[] = new int[n];
		pref[0] = arr[0];
		int suff[] = new int[n];
		suff[n-1] = arr[n-1];
		for(int i=1;i<n;i++) {
			pref[i] = pref[i-1] * arr[i];
		}
		for(int i=n-2;i>=0;i--) {
			suff[i] = suff[i+1] * arr[i];
		}
		int ans[] = new int[n];
		ans[0] = suff[1];
		ans[n-1] = pref[n-2];
		for(int i=1;i<n-1;i++) {
			ans[i] = pref[i-1] * suff[i+1];
		}
		return ans;
	}

	public static void main(String[] args) {
		  Scanner  sc = new Scanner(System.in);
		    System.out.println("enter no. of elements in array");
		    int n = sc.nextInt();
		    int arr[] = new int[n]; 

	        System.out.println("pls enter elements of arrays");
		    for(int i=0;i<n;i++) {
			    arr[i] = sc.nextInt();
		    }
		    int ans[] = multiply(arr);
		    for(int i=0;i<ans.length;i++) {
		    	System.out.print(ans[i]+" ");
		    }
		    

	}

}
