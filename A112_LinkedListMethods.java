/*WAP in methods of Linkedlist addFirst, addLast, getFirst, getLast, removeFirst, removeLast, pollFirst, pollLast*/
package collection.methods;

import java.util.Collections;
import java.util.LinkedList;

public class A112_LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ln=new LinkedList();
		//indexing
		ln.add("Akshay");
		ln.add("Aaarav");
		ln.add("Veer");
		ln.add("Badal");
		ln.add("Sachin");
		System.out.println("indexing : "+ln );    //indexing - true
		
		Collections.sort(ln);
		System.out.println("Sorting :"+ln); //sorting - true
		
		//null checking
		ln.add(null);
		ln.add(null);
		ln.add(null);
		System.out.println("null checking : "+ln ); //null - true
		
		ln.add(100);
		ln.add(5.789);
		ln.add(false);
		System.out.println("heterogeneous : "+ln );  //heterogeneous - true
		
		ln.add(100);
		ln.add(100);
		ln.add(100);
		System.out.println("duplicate : "+ln );  //duplicate -true
		
		System.out.println("Order of insertion : "+ln );  //Order of insertion - true
		
		System.out.println("Execution of Linkedlist methods");
		
        ln.addFirst("Shruti");                 //addFirst() - getting first object
        System.out.println("adding first object : "+ln);
        
        ln.addLast("Aarti");                  //addLast() - getting last object
        System.out.println("adding last object : "+ln);
        
        System.out.println(ln.getFirst());  //getFirst() -  getting first object
        System.out.println(ln.getLast());   //getLast() - getting last object
        
        System.out.println(ln.removeFirst());  //removeFirst() - remove first object
        System.out.println(ln.removeLast());   //removeLast() - remove last object
		
        System.out.println(ln.pollFirst());  //pollFirst()- remove first object
        System.out.println(ln.pollLast());   //pollLast()- remove last object
		

	}

}
