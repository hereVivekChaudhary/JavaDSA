package BasicProblems;
import java.util.*;
public class DigitsOfNumber {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a number");
        int num = sc.nextInt();
//        int rev = 0;
//        while(num > 0){
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            num /= 10;
//        }
//        while(rev > 0){
//            int r = rev % 10;
//            System.out.println(r+" ");
//            rev /= 10;
//        }
       // System.out.println(rev);

        int n = 8,i=1;

        while(num != 0){

            double digit = num / Math.pow(10,n-i);
            System.out.println((int)digit+" ");
            num %= Math.pow(10,n-i);
            i++;

        }
    }
}
