package collection.interface1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class C30_Behaviour_Set {

	public static void main(String[] args) {
		// Upcasting TreeSet_Behaviour to Set
				Set s1=new TreeSet();
				
				//checking indexing
				s1.add(12);
				s1.add(18);
				s1.add(6);
				s1.add(87);
				s1.add(65);
				System.out.println(s1);
				
				//duplicate
				s1.add(12);
				s1.add(12);
				s1.add(12);
				System.out.println(s1);
				
				//null checking
				//s1.add(null);
				//s1.add(null);
			//	s1.add(null);
			//	System.out.println(s1); //throws NullPointerException
				
				//iterate from iterator - Yes
				Iterator i1=s1.iterator();
				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
				
				//iterate from listinterface - No
				

	}

}
