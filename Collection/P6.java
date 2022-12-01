/*WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.*/

package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P6 {
	 public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("kolhapur", 298298);
		map.put("mumbai", 83774);
		map.put("pune", 123432);
		map.put("satara", 7645);
		map.put("nashik", 2133);
		map.put("sangali", 34233);
			
		System.out.println(map);
		TreeMap<String, Integer> map2=new TreeMap<>(map);
		System.out.println(map2);	
	}
}