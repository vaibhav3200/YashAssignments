// find duplicates with their count.
package Day1;

public class P7 {
	public static void main (String[] args) {
		int A[] = {1,3,5,7,2,4,1,5,7,4};
		int MAX = Integer.MIN_VALUE;
		for (int i=0; i<A.length; i++) {
			if (A[i] > MAX)
			MAX = A[i];
		}
		
		int B[] = new int [MAX + 1]; 
		for (int i=0; i<A.length; i++) {
			B[A[i]]++;
		}
		
		for (int i=0; i<=MAX; i++) {
			if (B[i]>1)
				System.out.println(i+ "-" + B[i]);
		}
	}
}
