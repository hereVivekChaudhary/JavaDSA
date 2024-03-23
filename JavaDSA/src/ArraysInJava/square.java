package ArraysInJava;

public class square {

	public static void main(String[] args) {
     int[] arr = {-100,-20,3,5,9,500};
     int[] newArr = new int[arr.length];
     int k = arr.length-1;
     int l = 0, e = arr.length-1;
     while(l <= e) {
    	 if(Math.abs(arr[l]) > Math.abs(arr[e])) {
    		 newArr[k--] = arr[l] * arr[l];
    		 l++;
    	 }
    	 else {
    		 newArr[k--] = arr[e] * arr[e];
    		 e--;
    	 }
     }
     for(int i=0;i<newArr.length;i++) {
    	 System.out.print(newArr[i] +" ");
     }
 	}

}
