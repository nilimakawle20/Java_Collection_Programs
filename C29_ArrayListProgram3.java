package collection.interface1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C29_ArrayListProgram3 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Abhilash");
		a1.add("Monisha");
		a1.add("Zakir");
		System.out.println(a1);
		
	Iterator i1=a1.iterator();
	while(i1.hasNext()) //true if the iteration has more elements
	{
	System.out.println(i1.next()); //Returns the next element in the iteration.
	}
		
		
//with the help of iterator in collection, we can iterator elements in forward direction but not in backward direction
//bcz it has methods like next() and hasnext() and does not have methods previous() and hasprevious() 
//same drawback can be overcomed with the help of list iterator applicable to list interface & its child classes
	
		
	System.out.println("lets iterate in forward direction");
		
	ListIterator i2=a1.listIterator();
	while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	System.out.println("lets iterate in backward direction");
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
