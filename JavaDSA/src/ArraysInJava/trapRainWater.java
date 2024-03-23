package ArraysInJava;
import java.util.*;
public class trapRainWater {
	public static int trap(int height[]) {
		int n = height.length;
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = height[0];
		right[n-1] = height[n-1];
		for(int i=1;i<n;i++) {
             left[i] = Math.max(left[i-1], height[i]);
	     }
		for(int i=n-2;i>=0;i--) {
            right[i] = Math.max(right[i+1], height[i]);
	     }
		int ans = 0;
		for(int j=0;j<n;j++) {
			ans += Math.min(left[j], right[j]) - height[j];
		}
		return ans;
	}
		

	public static void main(String[] args) {
		int height[] = {4,2,0,6,3,2,5};
		int vol = trap(height);
		System.out.println("vol of water trap:"+vol);
		

	}

}
