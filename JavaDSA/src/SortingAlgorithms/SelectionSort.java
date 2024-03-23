


package SortingAlgorithms;

public class SelectionSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int smallest = i;
			for(int j=i+1;j<n;j++) {
				if(arr[smallest] > arr[j]) {
				 smallest = j;
				}
			}
		   int temp = arr[i];
		   arr[i] = arr[smallest];
		   arr[smallest] = temp;
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,4,1,2,3};
		Sort(arr);
        printArray(arr);
		
	}

}

//Complexity:
//Best Case: O(n^2)
//Average Case: O(n^2)
//Worst Case: O(n^2)
