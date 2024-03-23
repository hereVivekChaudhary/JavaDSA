package Stack;

import java.util.Stack;

public class Basic {
	public static void addAtBottom(Stack<Integer> st ,int x,int idx) {
		Stack<Integer> rt = new Stack<>();
		while(st.size() > idx) {
			rt.push(st.pop());
		}
	    rt.push(x);
	    while(rt.size() > 0) {
	    	st.push(rt.pop());
	    }
	    System.out.print(st);
		
	}
	//copy elements from one stack to another stack
	public static void copyStack(Stack<Integer> st) {
		Stack<Integer> rt = new Stack<>();
		Stack<Integer> cs = new Stack<>();
		while(st.size() > 0) {
			rt.push(st.pop());
		}
		while(rt.size() > 0) {
			cs.push(rt.pop());
			
		}
		System.out.println("copy stack"+cs);
	}
	public static void remove(Stack<Integer> st,int idx) {
		Stack<Integer> rt = new Stack<>();
		while(st.size() > idx) {
			rt.push(st.pop());
		}
		st.pop();
		while(rt.size() > 0) {
			st.push(rt.pop());
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		System.out.println(st);
//		while(st.size() > 0) {
//			System.out.println(st.pop());
//		}
//        addAtBottom(st,60,2);
		System.out.println(st);
//		copyStack(st);
//		System.out.println(cs);
		remove(st,2);
		
		
	}

}
