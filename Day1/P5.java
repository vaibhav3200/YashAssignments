// Difference between string, string builder and string buffer
package Day1;

public class P5 {

    public static void main(String[] args){
        String s1 = "Technologies";
        concat1(s1);
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder("Technologies");
        concat2(s2);
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Technologies");
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
    }
    
	public static void concat1(String s1){
        s1 = s1 + "Yash Technologies";
    }
 
    public static void concat2(StringBuilder s2){
        s2.append("Yash Technologies");
    }
 
    public static void concat3(StringBuffer s3){
        s3.append("Yash Technologies");
    }
}