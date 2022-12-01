// work of heap memory and string pool.
package Day1;

public class P17 {
	
	public static void main(String[] args) {
		String str=new String("Yash Technology");
		String ans =str.intern();
		System.out.println("Heap memory:"+str);
		System.out.println("String Constant pool:"+ans);
	}
}