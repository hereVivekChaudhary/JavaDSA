package StringsInJava;
import java.util.*;
public class UniqueElement {

    public static ArrayList<Integer> unique(int[] arr){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++) {
            if(arr[i] != arr[i+1] ) {
                ar.add(arr[i]);

            }
            else{
                i++;
            }
        }
        if(arr[n-2] != arr[n-1]){
            ar.add(arr[n-1]);
        }

        return ar;

    }
    public static void main(String[] args) {
       // int[] arr = {1,2,3,4,2,1};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> a= unique(arr);
        for(int val:a){
            System.out.print(val+" ");

        }
    }
}
