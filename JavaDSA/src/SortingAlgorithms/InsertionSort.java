//Name : Vivek
//Uni Rollno: 2115001141
//Section: C
//Class RollNo: 72


package SortingAlgorithms;

public class InsertionSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Sort(int[] arr) {               //complexity:
		  int n = arr.length;                            //Best case: O(n)
		for(int i=1;i<n;i++) {                           //Average case:O(n^2)
                                                         //Worst Case:O(n^2)
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current < arr[j]) {
			    arr[j+1] = arr[j];
			    j--;
			}
		    arr[j+1] = current;
			
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int[] arr = {5,8,6,7,3,4,1,2};
		Sort(arr);

	}

}
