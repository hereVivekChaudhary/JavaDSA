package NumberSystem;
import java.util.*;
public class digitFreq {
	public static void Freq(int num,int v) {
		int cnt = 0;
		while(num != 0) {
			int rem = num % 10;
			if(rem == v) {
				cnt++;
			}
			num /= 10;
		}
		System.out.println("number of times v is find:"+cnt);
	}

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("pls enter a number");
	 int num = sc.nextInt();
	 System.out.println("enter number to be count");
	 int v = sc.nextInt();
	 Freq(num,v);

	}

}
