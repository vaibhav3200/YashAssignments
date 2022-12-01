//WAP to store all Collection elements in Array and perform the Binary Search.
package Collection;

import java.util.ArrayList;
import java.util.List;

public class P2 {
	
	public static void main(String args[]){
		P2 Pro2 = new P2();
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(5);
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		
	    int n = arr.length;
	    int result = Pro2.binarySearch(arr, 0, n - 1, 4);
	    if (result == -1)
	    	System.out.println("Element not present");
	    else
	        System.out.println("Element found at index "+ result);
	    }
	
	    public int binarySearch(int arr[], int l, int r, int x){
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	 
	            if (arr[mid] == x)
	                return mid;
	 
	            if (arr[mid] > x)
	                return binarySearch(arr, l, mid - 1, x);
	 
	            return binarySearch(arr, mid + 1, r, x);
	        }
	        return -1;
	    }
}