package Stack;
import java.util.*;

public class balancedBracket {
	public static boolean balanced(String st) {
		int n = st.length();
		Stack<Character> sk = new Stack<>();
		
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
					return false;
			
				}
          }
				
		}
			if(sk.size() > 0) {
				return false;	
			}
			else {
				return true;
			}
			
		
		
	}

	public static void main(String[] args) {
		String st = "(()()))";
		boolean s = balanced(st);
		System.out.println(s);

	}

}
