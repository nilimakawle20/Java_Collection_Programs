package collection.interface1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C30_Behaviour_List {

	public static void main(String[] args) {
		// Upcasting ArrayList to List
		List l1=new ArrayList();
		
		//checking indexing
		l1.add(90);
		l1.add(45);
		l1.add(12);
		l1.add(65);
		l1.add(43);
		System.out.println(l1);
		
		//duplicate
		l1.add(90);
		l1.add(90);
		l1.add(90);
		System.out.println(l1);
		
		//null checking
		l1.add(null);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		//iterate from iterator - Yes
		System.out.println("lets iterate in backward direction through iterator");
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//iterate from listinterface - Yes
		System.out.println("lets iterate in forward direction through ListInterface");
		
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
			
		System.out.println("lets iterate in backward direction through ListInterface");
			
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}

	}

}
