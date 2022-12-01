// Duplicate number and their counting. 

package Day1;

public class P4 {
	
	public static void main(String[] args) {
		P4 program=new P4();
		int arr[]={3,5,3,6,21,34,36,12,34,21,3};
		program.repeatCount(arr);
		
	}
	public void repeatCount(int arr[]){
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			int num=arr[i];
			count=1;
			if(num>0){
				for(int j=i+1;j<arr.length;j++){
					if(num==arr[j]){
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(num+" :"+count);
			}		
		}
	}
}
