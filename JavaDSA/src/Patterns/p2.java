
package Patterns;
import java.util.*;
public class p2 {
    public static void pattern1(int n){
        int row = 1;
        int star = 5;
        while(row <= n){
            int i = 1;
            while(i <= star){
                System.out.print("*"+" ");
                i++;
            }
            star--;
            row++;
            System.out.println();
        }

    }
    public static void pattern2(int n){
        int space = 0;
        int row = 1;
        int star = 5;
        while(row <= n){
            int i=1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print("*"+" ");
                j++;
            }
            space++;
            star--;
            row++;
            System.out.println();
        }
    }
    public static void pattern3(int n){
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row <= n){
            int i =1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<= star){
                System.out.print("*"+" ");
                j++;
            }
            //next row
            star += 2;
            space -= 1;
            row++;
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                if(j%2 == 0){
                    System.out.print("  ");
                }
                else {
                    System.out.print("*" + " ");
                }
                j++;
            }
            //next row
            star += 2;
            space -= 1;
            row++;
            System.out.println();
        }
    }
    public static void pattern5(int n){
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row <= 2*n-1){
            int i =1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print("*"+" ");
                j++;
            }
            //next row
            //mirror
            if(row < n){
                star += 2;
                space--;
            }
            else{
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
//    public static void pattern6(int n){
//        int star = 7;
//        int row = 1;
//        int space = 0;
//        while(row <= n){
//            int i=1;
//            while(i<=star){
//                System.out.print("*"+" ");
//                i++;
//            }
//            int j=1;
//            while(j <= space){
//                System.out.print("  ");
//                j++;
//            }
//             i=1;
//            while(i<=star){
//                System.out.print("*"+" ");
//                i++;
//            }
//
//        }
//    }
    public static void pattern6(int n){
        int space = 0;
        int row = 1;
        int star = n;
        while(row <= 2*n-1){
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print("*"+" ");
                j++;
            }
            // next row
            //mirror;
            if(row < n){
                star--;
                space += 2;
            }
            else {
                star++;
                space -= 2;
            }
            row++;
            System.out.println();

        }
    }
    public static void pattern7(int n){
        int space = n-1;
        int row = 1;
        int star = n;
        while(row <= 2*n-1){
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print("*"+" ");
                j++;
            }
            // next row
            //mirror;
            if(row < n){
                star--;
                space--;
            }
            else {
                star++;
                space++;
            }
            row++;
            System.out.println();

        }
    }
    public static void pattern8(int n) {

        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(j+" ");
                if (j <= (star/2)+1) {
                    j++;
                }
                else {
                    j--;
                }
            }
                //next row
                star += 2;
                space -= 1;
                row++;
                System.out.println();

        }
    }
    public static void pattern9(int n) {
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val = row;

            while (j <= star) {
                System.out.print(val + " ");
                if (val < (star / 2) + 1) {
                    val++;
                } else {
                    val--;
                }

                j++;
            }
            //next row
            star += 2;
            space -= 1;
            row++;
            System.out.println();
        }
    }
    public static void pattern10(int n) {
        int star = n;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                if (i == row || i + row == n + 1) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }

            row++;
            System.out.println();
        }
    }





    public static void main(String[] args) {
        int n = 5;
        pattern8(n);
        
    }
}