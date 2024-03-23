package ArraysInJava;

public class BinarySearch {
	public static int Search(int arr[],int n,int target) {
		int s=0, l=n-1;
		
		while (s <= l){
			int mid = (s + l) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target) {
				l = mid-1;
			}
			if(arr[mid] < target) {
				s = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,11,14};
		int n = arr.length;
		int target = 4;
		int id = Search(arr,n,target);
		System.out.println("found at index:"+id);

	}

}
