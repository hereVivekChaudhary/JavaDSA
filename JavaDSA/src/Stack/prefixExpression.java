package Stack;
import java.util.*;
public class prefixExpression {
	public static void prefix(String str) {
		Stack<String> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 48 && ascii <= 57) {
				String s = "" + ch;
				val.push(s);
				}
			else if(op.size() == 0 || ch == '(' || op.peek() == '(') {
				op.push(ch);
			}
			else if(ch == ')') {
				while(op.peek() != '(') {
					String s2 = val.pop();
					String s1 = val.pop();
					char x = op.pop();
					String t = x + s1 + s2;
					val.push(t);
				}
			  op.pop(); // '(' remove
			}
			else {
				if(ch == '+' || ch == '-') {
					String s2 = val.pop();
					String s1 = val.pop();
					char x = op.pop();
					String t = x + s1 + s2;
					val.push(t);
					//push
					
					op.push(ch);
						
				}
				if(ch == '*' || ch == '/') {
					if(op.peek() == '*' || op.peek() == '/') {
						//work
						String s2 = val.pop();
						String s1 = val.pop();
						char x = op.pop();
						String t = x + s1 + s2;
						val.push(t);
						//push
						op.push(ch);
					}
				
				else {
					op.push(ch);
				}
				}
			}
		}
		
		while(val.size() > 1) {
			// work
			String s2 = val.pop();
			String s1 = val.pop();
			char x = op.pop();
			String t = x + s1 + s2;
			val.push(t);
		}
		String res = val.pop();
		System.out.println("prfix : "+res);
		
		
	}

	public static void main(String[] args) {
		String str = "9-(5+3)*4/6";
		prefix(str);
//		System.out.println("Infix: ="+ str);

	}

}
