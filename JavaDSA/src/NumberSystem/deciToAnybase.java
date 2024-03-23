package NumberSystem;
import java.util.*;
public class deciToAnybase {
	public static void toBase(int n,int k) {
		 String st = " ";
		 if(k == 2) {
	       while(n != 0){
	           int rem = n % 2;
	            st =   rem + st;
	            n /= 2;
	        }
	        System.out.println((st));
		 }
		 else if(k == 8) {
			  while(n != 0){
		           int rem = n % 8;
		            st =   rem + st;
		            n /= 8;
		        }
		        System.out.println((st));
		    }
		 else if(k == 16) {
			  while(n != 0){
		           int rem = n % 16;
		            st =   rem + st;
		            n /= 16;
		        }
		        System.out.println((st));
		    }
		 }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("pls enter a number:");
		        int num = sc.nextInt();
		        System.out.println("base no:");
		        int k = sc.nextInt();
		        
		        toBase(num,k);

		    }
		
	}
	


