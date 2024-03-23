package Patterns;
import java.util.*;
public class p1 {

	  public static void pattern1(int n){
	        for(int i=1; i<=n; i++){
	            for (int j = i; j <= n; j++) {
	                System.out.print("*\t");
	            }
	            System.out.println();
	        }
	    }
	   public static void pattern2(int n){
	        for(int i=1; i<=n; i++){
	            for (int j = 1; j < i; j++) {
	                System.out.print(" \t");
	            }
	            for(int k=i;k<=n;k++){
	                System.out.print("*\t");
	            }
	            System.out.println();
	        }
	    }
	   public static void pattern3(int n){
	        for(int i=1;i<=3;i++){
	            for(int j=i;j<=3;j++){
	                System.out.print("*\t");
	            }
	            for(int s=1;s<=(2*i-1);s++){
	                System.out.print(" \t");
	            }
	            for(int j=i;j<=3;j++){
	                System.out.print("*\t");
	            }
	            System.out.println();
	        }
	        for(int i=1;i<=2;i++){
	            for(int j=1;j<=i+1;j++){
	                System.out.print("*\t");
	            }
	            for(int s=1;s<=(5-(2*i));s++){
	                System.out.print(" \t");
	            }
	            for(int j=1;j<=i+1;j++){
	                System.out.print("*\t");
	            }
	            System.out.println();
	        }

	    }
	   public static void main(String[] args) {
	        Scanner sc =  new Scanner(System.in);
	        int n = sc.nextInt();
	        pattern3(n);

	    }
	}


