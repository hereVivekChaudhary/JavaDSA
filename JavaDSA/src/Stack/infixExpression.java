package Stack;
import java.util.*;

public class infixExpression {
	public static int Infix(String str) {
		Stack<Integer> values = new Stack<>();
		Stack<Character> oper = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if(ascii >= 48 && ascii <= 57) {
				values.push(ascii - 48);
				
			}
			else if(oper.isEmpty() || ch =='(' || oper.peek() == '('){
				oper.push(ch);
				
			}
			else if(ch == ')') {
				while(oper.peek() != '(') {
					//work
					int v2 = values.pop();
					int v1= values.pop();
					if(oper.peek() == '+') values.push(v1 + v2);
					if(oper.peek() == '-') values.push(v1 - v2);
					if(oper.peek() == '/') values.push(v1 / v2);
					if(oper.peek() == '*') values.push(v1 * v2);
					oper.pop();
				}
			    oper.pop(); // '(' delete
			}
			else {
				if(ch == '+' || ch == '-') {
					int v2 = values.pop();
					int v1= values.pop();
					if(oper.peek() == '+') values.push(v1 + v2);
					if(oper.peek() == '-') values.push(v1 - v2);
					if(oper.peek() == '/') values.push(v1 / v2);
					if(oper.peek() == '*') values.push(v1 * v2);
					oper.pop();
					oper.push(ch);
						
				} if(ch == '*' || ch == '/') {
					if(oper.peek() == '*' || oper.peek() == '/') {
					int v2 = values.pop();
					int v1= values.pop();
					
					if(oper.peek() == '/') values.push(v1 / v2);
					if(oper.peek() == '*') values.push(v1 * v2);
					oper.pop();
					oper.push(ch);
				}
					else {
						oper.push(ch);
					}
			}
				
		}
	}
		while(values.size() > 1) {
			int v2 = values.pop();
			int v1= values.pop();
			if(oper.peek() == '+') values.push(v1 + v2);
			if(oper.peek() == '-') values.push(v1 - v2);
			if(oper.peek() == '/') values.push(v1 / v2);
			if(oper.peek() == '*') values.push(v1 * v2);
			oper.pop();
			
		}
		return values.peek();
	}

	public static void main(String[] args) {
		String str = "9 - (5 + 3) * 4 / 6";
		int res = Infix(str);
		System.out.println("result:= "+ res);

	}

}
