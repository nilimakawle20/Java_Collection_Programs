/*WAP using Collection methods*/
package collection.methods;
import java.util.ArrayList;

public class A101_CollectionMethods {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("Ram");                  //add object method
		a1.add("Shyam");
		a1.add("Siya");
		a1.add("Diya");
		a1.add("Ram");
		a1.add(321);
		a1.add("Siya");
		a1.add(null);
		a1.add(true);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		System.out.println(a2.addAll(a1));    //addAll collection
		a2.add("Riya");
		System.out.println(a2);
		
		System.out.println(a2.isEmpty());      //isEmpty
		
		System.out.println(a2.contains(null));  //contains object
		
		System.out.println(a2.containsAll(a1));  //containsAll collection
		
		System.out.println(a2.size());      //size method
		
		System.out.println(a2.remove(null));   //remove object method
		
		System.out.println(a2.size());
		
		System.out.println(a2);
		
		a2.add("Jiya");
		
		System.out.println(a2.removeAll(a1)); //removeAll collection
		
		System.out.println(a2);
		
		System.out.println("Before clearing-> "+a2);
		a2.clear();                                  //clear method
		System.out.println("After clearing-> "+a2);
	}

}
