package LinkedList;

public class BasicAll {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static void display(Node head) {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("null");
		
	}
	public static void displayRecur(Node head) {
		if(head == null) {
			System.out.print("null");
			return;
		}
		System.out.print(head.data+"->");
		displayRecur(head.next);
	}
	public static void displayReverse(Node head) {
		if(head == null) {
			return;
		}
		displayReverse(head.next);
		System.out.print(head.data+"->");
	
	}
	public static void length(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Node a = new Node(5);
//		System.out.println(a);
		Node b = new Node(8);
		Node c = new Node(9);
		Node d = new Node(2);
		Node e = new Node(55);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
//		System.out.println(d.next.data);
//		display(a);
		System.out.println();
		displayRecur(a);
		System.out.println();
		displayReverse(a);
		System.out.println();
		length(a);
		
		

	}

}
