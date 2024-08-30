/*WAP-Iterator in concept of ListIterator*/
package collection.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A111_IteratorinListIterator {

	public static void main(String[] args) {
	List l=new ArrayList();
	l.add("Jasmine");
	l.add("Rose");
	l.add("Lily");
	l.add("Jerbera");
	l.add("Tulip");
	System.out.println(l);
	
	ListIterator ls=l.listIterator();
	System.out.println("Iterate in forward direction");
	while(ls.hasNext())
	{
		System.out.println(ls.next());
	}
	
	System.out.println("Iterate in backward direction");
	while(ls.hasPrevious())
	{
		System.out.println(ls.previous());
	}
	
	}

}
