/*WAP-Iterator in concept of Linkedlist*/
package collection.methods;
import java.util.Iterator;
import java.util.LinkedList;

public class A110_Iterator_inLinkedList {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add(200);
		l1.add(700);
		l1.add(500);
		System.out.println(l1);
		
		System.out.println("Below is how Iterator works in concept of Linkedlist");
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
