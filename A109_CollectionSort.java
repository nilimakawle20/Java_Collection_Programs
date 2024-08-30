/*WAP using sort*/
package collection.methods;

import java.util.ArrayList;
import java.util.Collections;

public class A109_CollectionSort {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Riya");
		a1.add("Diya");
		a1.add("Siya");
		a1.add("Jisha");
		a1.add("Nishtha");
		a1.add("Divya");
		Collections.sort(a1); //sort method applicable to homogeneous elements
		System.out.println(a1);

	}

}
