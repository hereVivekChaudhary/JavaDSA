package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println(" pls enter String");
		String str = sc.nextLine();
		ArrayList<String> s2 = new ArrayList<>();
		s2 = sequence(str);
		
	    System.out.print(s2);

	}
	public static ArrayList<String> sequence(String str){
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
	    char ch = str.charAt(0);
	    String st = str.substring(1);
	    ArrayList<String> st1 = sequence(st);
	    
	    ArrayList<String> strr = new ArrayList<>();
	     for(String s : st1) {
	    	 strr.add(""+s);
	     }
	     for(String s1 : st1) {
	    	 strr.add(ch+s1);
	     }
	     return strr;
 
	}
	
  
}
