package ArraysInJava;

public class subArray {

	public static void main(String[] args) {
		char a[] = {'a','b','c','d'};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
