package Stack;

import java.util.Stack;

public class Basic1 {
	public static void  reverse(Stack<Integer> st) {
		int n = st.size();
		int[] arr = new int[n];
		for(int i=0;i>n;i++){
			arr[i].push(st.pop());
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			st.push(arr[i]);
		}
		System.out.println(st);
		
				
				
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		 st.push(50);
		 st.push(40);
		 st.push(30);
		 st.push(20);
		 st.push(10);
		 reverse(st);
        
	}

}
