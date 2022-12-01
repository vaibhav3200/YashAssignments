// From the given array put all the vowels and constants together.
package Day1;

public class P13 {
	public static void main(String[] args) {
		P13 program=new P13();
		char arr[]={'a','c','g','e','z','d','i','s'};
		program.sortArray(arr);
	}

	public void sortArray(char arr[])
	{
		char temp;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
			}
		}
        for(char k:arr)
        	System.out.println(k);
	}
}