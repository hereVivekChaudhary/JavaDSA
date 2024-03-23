package ArraysInJava;

public class InverseArray {

	public static void main(String[] args) {
	     int arr[] = {3,4,1,2,0};
	     int ans[] = new int[arr.length];
	     int k=0;
	     for(int i=0;i<arr.length;i++) {
	    	 ans[arr[i]] = i;
	     }
	     for(int i=0;i<ans.length;i++) {
	    	 System.out.print(ans[i] +" ");
	     }

	}

}
