package Stack;

public class ImplementationUsingArray {
	public static class Stack{
		int[] arr = new int[50];
		int idx = 0;
		void push(int x) {
			if(isFull()) {
				System.out.println("stack i full");
			}
			arr[idx] = x;
			idx++;
		}
		int peek() {
		   if(idx == 0) {
			   System.out.println("stack is empty");
			   return -1;
			   
		   }
		   return arr[idx-1];
		}
		int pop() {
		   if(idx == 0) {
			  System.out.println("stack is empty");
			  return -1;	   
		  }
		   int top = arr[idx-1];
		   arr[idx-1] = 0;
		   idx--;
		   return top;
		}
		void display() {
			for(int i=0;i<=idx-1;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		int size() {
			return idx;
		}
		boolean isEmpty() {
			if(idx == 0) {
				return true;
			}
			else {
				return false;
			}
		}
        boolean isFull() {
        	if(idx == arr.length) {
        		System.out.println("stack is full");
        		return true;
        	}
        	else {
        		return false;
        	}
        }
        int capacity() {
        	return arr.length;
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
