// WAP to print the all alphabets of string in ascending order.

package Day1;
import java.lang.reflect.Array;
import java.util.Arrays;

public class P1 {
	
	public static void main(String[] args) {
		String str = "ddbbcccaa";
		sortString(str);
	}
	
	static void sortString (String str) {
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);	
	}
}
