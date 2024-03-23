package NumberSystem;

import java.util.Scanner;

public class binaryAddition {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
	      System.out.println("pls enter a number:");
	      int n1 = sc.nextInt();
	      System.out.println("pls enter second number:");
	      int n2 = sc.nextInt();
	      int carry = 0;
	      String  st = " ";
	      while(n1 < 0 || n2 < 0) {
	    	  int a = n1 % 10;
	    	  int b = n2 % 10;
	    	   st =(a+b+carry)%2 + st;
	    	   carry = (a+b+carry)/2;
	    	   n1 /= 10;
	    	   n2 /= 10;
	    	  
	    	  
	      }
	      System.out.println(st);
}
}
