package BasicProblems;
import java.util.*;
public class Hcf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n2 % n1 != 0){
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        System.out.println("hcf:"+n1);
    }
}