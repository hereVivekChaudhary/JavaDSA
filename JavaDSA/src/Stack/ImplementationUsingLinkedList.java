package Stack;

import Stack.ImplementationUsingArray.Stack;


public class ImplementationUsingLinkedList {
	public static class Node{     // User defined datatype
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	public static class Stack{     // User defined data Structure
		Node head = null;
		int size = 0;
		
        void push(int x) {
        	Node temp = new Node(x);
        	temp.next = head;
        	head = temp;
        	size++;
           	
	}
        void display() {
        	Node temp = head;
        	while(temp != null) {
        		System.out.print(temp.val+" ");
        		temp = temp.next;
        	}
        	System.out.println();
        	
        }
        int pop() {
        	if(head == null) {
        		System.out.println("stack is empty");
        		return -1;
        	}
        	int top = head.val;
        	head = head.next;
        	size--;
        	return top;
        	
        		
        }
        int peek() {
        	if(head == null) {
        		System.out.println("stack is empty");
        		return -1;
        	}
        	return head.val;
        }
        int size() {
        	return size;
        }
        boolean isEmpty() {
        	if(size == 0) {
        		return true;
        	}
        	else {
        		return false;
        	}
        }
        void displayReve(Node h) {
        	if(h == null) {
        		return;
        	}
        	displayReve(h.next);
        	System.out.print(h.val+" ");
        }
        void displayR() {
        	displayReve(head);
        	System.out.println();
        	
        }
        
		
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.display();
		st.push(20);
		st.display();
		st.push(30);
		st.display();
		st.push(40);
		System.out.println(st.peek());
		st.push(50);
		st.pop();
		st.display();
		System.out.println(st.size());

	}

}
