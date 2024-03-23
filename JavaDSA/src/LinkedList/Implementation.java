package LinkedList;

public class Implementation {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static class linkedlist{
		Node head = null;
		Node tail = null;
		int size = 0;
		void insertAtEnd(int data) {
			Node temp = new Node(data);
				if(head == null) {
					head = temp;
				}
				else {
					tail.next = temp;
					
				}
				tail = temp;
				size++;
			}
		void insertAtBeg(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
			}
			temp.next = head;
			head = temp;
			size++;
		}
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
             System.out.print("null");
		}
//		int size() {
//			Node temp = head;
//			int count = 0;
//			while(temp != null) {
//				count++;
//				temp = temp.next;
//			}
//			return count;
//		}

	
	void insertAt(int idx, int data) {
		Node node = new Node(data);
		Node temp = head;
		if(idx == 0) {
			insertAtBeg(data);
			return;
			
		}
		else if(idx < 0 && idx >= size) {
			System.out.println("wrong index");
			return;
		}
		for(int i=0;i<idx-1;i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
		
	}
	
	void delete(int idx) {
		Node temp = head;
		if(idx == 0) {
			head = head.next;
			return;
		}
		else if(idx < 0 && idx >= size) {
			System.out.println("wrong index");
			return;
		}
		for(int i=0;i<idx-1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	
	}
	int getAt(int idx) {
		Node temp = head;
		for(int i=1;i<=idx;i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	}

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		ll.insertAtEnd(6);
		ll.insertAtEnd(7);
		ll.insertAtEnd(8);
		ll.insertAtBeg(3);
		ll.display();
		System.out.println();
//		System.out.print("length of a linked list:"+ll.size());
//		System.out.println();
		ll.insertAt(0,50);
//		ll.display();
//		ll.delete(0);
		ll.display();
		System.out.println();
		System.out.println(ll.size);
		System.out.println(ll.getAt(0));
	

	}

}
