package SortingAlgorithms;
import java.util.*;
public class CountingSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void Sort(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
        	max = Math.max(max, arr[i]);
        }
        int freq[] = new int[max+1];
        
        for(int i=0;i<arr.length;i++) {
        	freq[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<freq.length;i++) {
        	while(freq[i] > 0) {
        		arr[j] = i;
        		j++;
        	    freq[i]--;
        	}
        }
       
        
	}

	public static void main(String[] args) {
	   int[] arr = {14,2,4,4,5,2,2,5,3};
	   Sort(arr);
	   printArray(arr);

	}

}
