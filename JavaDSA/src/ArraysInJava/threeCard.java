package ArraysInJava;
import java.util.Scanner;
public class threeCard {
 static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<t;i++) {
				String s = sc.nextLine();
				if(isSortable(s)) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
			sc.close();

		}
		public static boolean isSortable(String s) {
			if(s.charAt(1) == 'a') return true;
			if(s.charAt(0) == 'b' || s.charAt(2) == 'b') return true;
			if(s.charAt(1) == 'c') return true;
			return false;
		}

	}

