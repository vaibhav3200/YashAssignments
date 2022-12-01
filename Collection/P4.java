// WAP to store elements in List and remove all duplicates names of items. After 
// duplicates are removed print all elements in descending order. 
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("vaibhav");
		list.add("vijay");
		list.add("pavan");
		list.add("shubham");
		list.add("akash");
		list.add("vikas");
		list.add("sagar");
		list.add("suraj");
			
		
		Set<String> set=new HashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		list.sort(Collections.reverseOrder());
		System.out.println(list);	
	}
}