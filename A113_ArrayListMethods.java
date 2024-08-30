/*WAP on ArrayList methods of get(), set(), indexOf()*/
package collection.methods;

import java.util.ArrayList;

public class A113_ArrayListMethods {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Vidhya");
		a1.add("Radha");
		a1.add("Siya");
		a1.add("Jisha");
		a1.add("Saavi");
		System.out.println(a1);
		
		int indexofSaavi=a1.indexOf("Saavi"); //indexOf() - gives index of object
		System.out.println(indexofSaavi);
		
		System.out.println(a1.get(3)); //get() - fetch object at index 
		a1.set(2,"Maya"); //set()-replace object at index
		System.out.println(a1);
	
	}

}
