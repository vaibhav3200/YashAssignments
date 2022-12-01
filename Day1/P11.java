// arrange strings in array on the basis of the length of each string.
package Day1;

public class P11 {
	public static void main(String args[]) {
		String arr[]= {"Chougale", "Ankush", "Nitin"};
		int n = arr.length;
		sort(arr, n);
	}
	
	public static void sort(String[] s, int n) {
		for (int i=1; i<n; i++) {
			String temp = s[i];
			int j = i-1;
			while (j>=0 && temp.length() < s[j].length()) {
				s[j+1]=s[j];
				j--;
			}
			s[j+1] = temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(s[i] + " ");
		}
	}	
}	
	
	
//		String arr[] = {"from", "i",  "technology", "am", "yash"};
//		int n = arr.length;
//		sort(arr, n);
//	} 
//	static void sort(String[] s, int n) {
//		for(int i=1; i<n; i++) {
//			String temp = s[i];
//			int j = i-1;
//			while(j>=0 && temp.length() < s[j].length()) {
//				s[j+1] = s[j];
//				j--;
//			}
//			s[j+1] = temp;
//		}
//		for (int i=0; i<n; i++) {
//			System.out.print(s[i] + " ");
//		}
//	}
//}