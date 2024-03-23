package Recursion;

import java.util.Scanner;

public class xToPowerN {
//	public static int fun(int x , int n) {
//		if(n == 0) {
//			return 1;
//		}
//		int xnm1 = fun(x,n-1);
//		int r = x * xnm1;
//		return r;
//		}
	public static int fun(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int xny2 = fun(x,n/2);
		int res = xny2 * xny2;
		if(n % 2 == 1) {
		 res = res * x;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int r  = fun(x,n);
		System.out.println("x to power n = "+r);

	}

}
