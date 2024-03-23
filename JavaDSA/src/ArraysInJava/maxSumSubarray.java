package ArraysInJava;

public class maxSumSubarray {
	public static void maxSum(int arr[], int n) {
		int ss = (n*(n+1)) / 2;
		int subsum[] = new int[ss];
		int t=0;
		int currSum=0;
		
		for(int i=0;i<n;i++) {
			int start=i;
			for(int j=i;j<n;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
					
					currSum += arr[k];
					
					
				}
				
				System.out.println("sum="+currSum);
				
				
				subsum[t++] = currSum;
				currSum=0;
				
				
			}
				currSum = 0;
				
		}
		
		
		int maxs = Integer.MIN_VALUE;
		
		for(int i=0;i<subsum.length;i++){
			if(maxs < subsum[i]){
				maxs = subsum[i];
			}
		}
		System.out.println("maximum sum of subarray"+maxs);
		
	}
	

	public static void main(String[] args) {
	 int arr[] = {2,3,4,5};
	 int n = arr.length;
	 maxSum(arr,n);
	 
  
	}

}
