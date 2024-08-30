/*WAP to utilize add method from Set Interface*/
package collection.methods;

import java.util.Set;
import java.util.TreeSet;

public class A108_Set_Interface {

	public static void main(String[] args) {
		// Upcasting TreeSet to Set
		Set s1=new TreeSet();
		
		//checking indexing
		s1.add(12);
		s1.add(18);
		s1.add(6);
		s1.add(87);
		s1.add(65);
		System.out.println(s1);
		
	}

}
