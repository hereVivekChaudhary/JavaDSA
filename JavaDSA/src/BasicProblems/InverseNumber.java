package BasicProblems;
import java.util.*;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a number");
        int num = sc.nextInt();
        int rem = 0,i=1,sum = 0;
        while(num != 0){
            rem = num % 10;
            sum += i * Math.pow(10,rem-1);
            num /= 10;
            i++;
        }
        System.out.println("Inverse of a number:"+sum);

    }
}
