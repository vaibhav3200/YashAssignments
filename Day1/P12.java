// Sort array on the basis of unit place.
package Day1;

public class P12 {
	
	public static void main(String[] args) {
		P12 program=new P12();
		int arr[]={10,2,3,41,12,13,19,81,9};	
		System.out.print("Orignal Array:");
		for(int i:arr){
			System.out.print(" "+i);
		}
		program.sortArray(arr);	
	}

	public void sortArray(int arr[]){
		int temp=0;
		int brr[]=new int[arr.length];
		for(int i=0;i<=9;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j]%10==i){
					brr[temp]=arr[j];
					temp++;
				}
			}
		}
		System.out.print("\nUnite place Array:");
		for(int i:brr){
			System.out.print(" "+i);
		}	
	}
}
