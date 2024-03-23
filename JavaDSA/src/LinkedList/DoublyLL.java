package LinkedList;

public class DoublyLL {
       public static class Node{
    	   int val;
    	   Node next;
    	   Node prev;
    	   Node(int val){
    		   this.val = val;
    	   }
       }
       public static void display(Node head) {
    	   Node temp = head;
    	   while(temp != null) {
    		   System.out.print(temp.val+" ");
    		   
    		   temp = temp.next;
    		   
    	   }
    	   System.out.println();
       }
       public static void displayRev(Node tail) {
    	   Node temp = tail;
    	   while(temp != null) {
    		   System.out.print(temp.val+" ");
    		   temp = temp.prev;
    	   }
    	   System.out.println();
       }
       public static void display2(Node random) {
    	   Node temp = random;
    	   while(temp.prev != null) {
    		   temp = temp.prev;
    	   }
    	   while(temp != null) {
    		   System.out.print(temp.val+" ");
    		   temp = temp.next;
    	   }
       }
       
       public static Node insertAtHead(Node head,int x) {
    	    Node temp = new Node(x);
    	    temp.next = head;
    	    head.prev = temp;
    	    head = temp;
    	    return head;
       }
       public static void insertAtTail(Node head,int x) {
    	   Node temp = head;
    	   while(temp.next != null) {
    		  temp = temp.next; 
    	   }
    	   Node t = new Node(x);
    	   temp.next = t;
    	   t.prev = temp;
    	   temp = t;
    	   
       }
       public static void insertAtIdx(Node head,int idx, int x) {
    	   Node temp = head;
    	   for(int i=1;i<=idx-1;i++) {
    		   temp = temp.next;
    	   }
    	   Node t = new Node(x);
    	   temp.next.prev = t;
    	   t.prev = temp;
    	   t.next = temp.next;
    	   temp.next = t;
       }
    	   
       
       
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next = null;
//		display(a);
//        
//        display2(c);
//        Node newNode = insertAtHead(a,60);
//        display(newNode);
//        insertAtTail(a,100);
//        display(a);
		 insertAtIdx(a,3,200);
		 display(a);
	}

}
