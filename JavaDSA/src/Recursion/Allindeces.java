package Recursion;

public class Allindeces {
	public static int[] fun(int[] arr,int x,int idx,int fsf) {
		if(idx == arr.length) {
			return new int[fsf];
		}
		if(arr[idx] == x) {
			int[] ar = fun(arr, x, idx+1, fsf+1);
			ar[fsf] = idx;
			return ar;
		}
		else {
			int[] ar = fun(arr, x, idx+1, fsf);
			return ar;
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,4,8,4,4};
		int ar[] = fun(arr, 4 ,0, 0);
	    for(int i=0; i<ar.length; i++) {
		System.out.print(ar[i]+" ");
	    }

	}

}
