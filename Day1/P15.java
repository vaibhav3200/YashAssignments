// remove the String which is not palindrome string from the array of String.
package Day1;

public class P15 {
	
	public static void main(String[] args) {
		P15 program=new P15();
		String arr[]={"abc","yuds","nitin", "hfhf","aba", "abcba"};
		program.checkPalindrome(arr);
	}
	public void checkPalindrome(String arr[]){
		for(int k=0;k<arr.length;k++)
		{
			boolean flag=false;
			String str=arr[k];
			for(int i=0,j=str.length()-1;i<j;i++,j--)
			{
				char last=str.charAt(j);
				char first=str.charAt(i);
				if(last!=first)
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				arr[k]="";
			}			
		}	
		for(String str:arr)
			System.out.print(" "+str);	
	}
}
