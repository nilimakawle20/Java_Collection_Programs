/*Please use backward iteration using listiterator for arraylist without forward iteration and note down the error*/
package collection.methods;

import java.util.ArrayList;
import java.util.ListIterator;

public class A104_BackwardIterationWithoutForwardIterationForArrayList {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");                  //add object method
		a1.add("Shyam");
		a1.add("Siya");
		a1.add("Diya");
		a1.add("Ram");
		System.out.println(a1);
		
		ListIterator i2=a1.listIterator();
		
	
		System.out.println("lets iterate in backward direction");
			
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}
			
		System.out.println("No backward iteration using listiterator for arraylist without forward iteration ");

	}

}
