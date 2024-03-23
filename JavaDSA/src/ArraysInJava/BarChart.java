package ArraysInJava;
import java.util.*;
public class BarChart {
	public static void chart(int[] arr) {
	int max = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
	}
	for(int floor=max;floor>=1;floor--) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= floor) {
					System.out.print("*\t");
			}
			else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("elements are:");
        for(int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        }
       chart(arr);
       
        
	}

}
