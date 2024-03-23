package ArraysInJava;

public class DiffTwoArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		 int b[] = {5,1,2,8};
		 int m = a.length;
		 int n = b.length;
		 int diff=0;
		 int mx = Math.max(m,n);
		 int c[] = new int[mx];
		 int k=0;
		 int i=0;
		while(i<m && i<n) {
			if(a[i] > b[i]) {
			    diff = a[i] - b[i];
			    c[k++] = diff;
			    diff=0;
			    i++;
			}
			if(a[i] < b[i]) {
				diff = b[i] - a[i];
				c[k++] = diff;
				diff=0;
				i++;
		    }
			
		}
		while(i<m) {
			c[k++] = a[i++];
		}
		while(i<n) {
			c[k++] = b[i++];
		}
		for(int j=0;j<c.length;j++) {
			System.out.print(c[j]+" ");
		}

	}

}
