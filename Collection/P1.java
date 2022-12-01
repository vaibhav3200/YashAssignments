//WAP to sort Collection elements in ascending order.

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(7);
		list.add(1);
		list.add(9);
		Collections.sort(list);
		System.out.println(list);
	}
}
