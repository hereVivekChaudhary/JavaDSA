package BasicProblems;
import java.util.*;
public class rotateNumber {


    public static void rotate(int num, int n, int k){
        int sum = 0;
        if(k > 0){
           double rem = num % Math.pow(10,k);
           double n1 = rem * Math.pow(10,n-k);
           double n2 = num / Math.pow(10,k);
           sum = (int)n1 + (int)n2;
           System.out.println("rotate number:"+sum);
        }
        else if(k < 0) {
            double n1 = num / Math.pow(10, n+k);
            double n2 = num % Math.pow(10, n+k);
            n2 = n2 * Math.pow(10, -k);
            sum = (int) n1 + (int) n2;
            System.out.println("rotate number:" + sum);
        }
        else{
            System.out.println("rotate number:"+num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a number");
        int num = sc.nextInt();
        int n = 8,k = 4;
        rotate(num,n,k);
    }
}
