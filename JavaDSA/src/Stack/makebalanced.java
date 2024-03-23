package Stack;

import java.util.Stack;

public class makebalanced {


		public static int balanced(String st) {
			int n = st.length();
			Stack<Character> sk = new Stack<>();
			int c = 0;
			for(int i=0;i<n;i++) {
				char ch = st.charAt(i);
				
				if(ch == '(') {
					sk.push(ch);
				}
				else {
					if(!sk.isEmpty() && sk.peek() == '(') {
						sk.pop();
					}
					else {
						c++;
						 
					}
					

	}
					
			}
			if(sk.size() > 0) {
			    return sk.size();
			}
			else {
				return c;
}
				
				
			
			
		}

		public static void main(String[] args) {
			String st = "(()())(()(";
			int s = balanced(st);
			System.out.println(s);
	}

}
