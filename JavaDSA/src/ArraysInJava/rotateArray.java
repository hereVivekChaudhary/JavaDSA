package ArraysInJava;
import java.util.*;
public class rotateArray {
	public static void printArray(int arr[], int n) {
		for(int i=0;i<n;i++) {
		    System.out.print(arr[i] +" ");
		}
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverse(int arr[], int l ,int r) {
		int n = arr.length;
//		int l=0, r=n-1;
		while(l < r) {
			swap(arr,l,r);
			l++;
			r--;
		}
	}
	public static void rotateBySteps(int arr[] , int k) {
		int n = arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		System.out.println("rotate by k elements");
	    int k = sc.nextInt();
	    System.out.println("pls enetr elements of arrays");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		rotateBySteps(arr, k);
//		reverse(arr,0,n-1);
//		printArray(arr ,n);
		System.out.println("after rotate");
		rotateBySteps(arr ,k);
		printArray(arr,n);
		
		
	}

}
