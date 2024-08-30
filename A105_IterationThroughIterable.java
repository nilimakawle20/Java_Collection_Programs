/*WAP using iterator(process of iteration through Iterable)*/
package collection.methods;

import java.util.ArrayList;
import java.util.Iterator;

public class A105_IterationThroughIterable {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Pen");
		al.add("Scale");
		al.add("Pencil");
		al.add("Protractor");
		
		System.out.println(al);
		
		System.out.println("Forward iteration through iterable");
		Iterator i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
