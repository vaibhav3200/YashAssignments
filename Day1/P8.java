// count of odd and even numbers.
package Day1;

public class P8 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
           
        CountingEvenOdd(arr, n);
        
    }
		static void CountingEvenOdd(int arr[], int arr_size){
	        int even_count = 0;
	        int odd_count = 0;
	 
	        for (int i = 0; i < arr_size; i++) {
	            if ((arr[i] % 2) == 1)
	                odd_count++;
	            else
	                even_count++;
	        }
	 
	        System.out.println("Number of even elements = " + even_count + "\nNumber of odd elements = "+ odd_count);
	    }
	}