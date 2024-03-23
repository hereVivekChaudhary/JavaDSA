package Stack;

import java.util.Stack;

public class removeConsecutiveSequence {
	public static int[] RemoveCons(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(st.size() == 0 || arr[i] != st.peek()) {
				st.push(arr[i]);
			}
			else if(st.peek() == arr[i]) {
				if(i == n-1 || arr[i] != arr[i+1]) {
					st.pop();
					}
			}
			
		}
		int m = st.size();
		int res[] = new int[m];
		for(int i=m-1;i>=0;i--) {
		    res[i] = st.pop();
		}
		return res;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,10,10,10,8,4,4,4,5,7,7,2};
		int res[] = RemoveCons(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
