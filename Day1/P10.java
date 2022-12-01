//LCM and HCF of two numbers.
package Day1;

public class P10 {
	public static void main(String[] args) {
		
		int n1 = 5 , n2 = 15, lcm;
	    lcm = (n1 > n2) ? n1 : n2;
	    int hcf = 1;
	    
	    while(true) {
	    	if( lcm % n1 == 0 && lcm % n2 == 0 ) {
	        System.out.printf("The LCM of " + n1 +" and " + n2 +" is " + lcm);
	        break;
	        }
	    	++lcm;
	    }
	    for (int i = 1; i <= n1 && i <= n2; ++i) {
	    	if (n1 % i == 0 && n2 % i == 0)
	    	hcf = i;
	    }
	    System.out.println("\nHCF of " + n1 +" and " + n2 + " is " + hcf);
	}
}