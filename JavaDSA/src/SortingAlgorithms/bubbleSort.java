
//Name : Vivek
//Uni Rollno: 2115001141
//Section: C
//Class RollNo: 72

package SortingAlgorithms;

public class bubbleSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		
			
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int arr[] = {5,4,1,2,3};
		 Sort(arr);	

	}

}

//Complexity:
//	Best Case: O(n)
//	Average Case: O(n^2)
//	Worst Case: O(n^2)
