package collection.interface1;

import java.util.ArrayList;
import java.util.Collections;

public class C30_Collection_Sort {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Abhilash");
		a1.add("Monisha");
		a1.add("Zakir");
		a1.add("C14_Nilima");
		Collections.sort(a1); //sort method applicable to homogeneous elements
		System.out.println(a1);
		
		

	}

}
