package ArraysInJava;

public class practice {
	public static int trap(int[] h) {
		int n = h.length;
		int left[] = new int[n];
		 left[0] = h[0];
		 int ans = 0;
		 int right[] = new int[n];
	     right[n-1] = h[n-1];
	     for(int i=1;i<n;i++) {
	    	 left[i] = Math.max(left[i-1], h[i]);
	     }
	     for(int j=n-2;j>=0;j--) {
	    	 right[j] = Math.max(right[j+1], h[j]);
	     }
	     for(int i=0;i<n;i++) {
	    	 ans += Math.min(left[i], right[i]) - h[i];
	     }
	     return ans;
	}

	public static void main(String[] args) {
		int h[] = {7,4,3,2,6,5};
		int ans = trap(h);
	    System.out.println("water trap: " +ans);

		

	}

}
