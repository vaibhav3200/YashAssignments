// remove vowels.
package Day1;

import java.util.Scanner;

public class P3 {
	
	public String removeVowels(String first)
	{
		String ansString="";
		for(int i=0;i<first.length();i++)
		{
			char ch=first.charAt(i);
			if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u'))
			{
				ansString=ansString+first.charAt(i);
			}
		}
		return ansString;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:");
		String first=scanner.nextLine();
		P3 program3=new P3();
		String ans=program3.removeVowels(first);
		System.out.println(ans);
	}
}
//	public static void main(String[] args){
//		String str = "Yash Technologies";       
//	    System.out.println(remVowel(str));
//	   }
//	   
//	static String remVowel(String str){
//        return str.replaceAll("[aeiouAEIOU]", "");
//   }