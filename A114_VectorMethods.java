/*WAP on Vector methods addElement(), firstElement(), lastElement(), removeElement(), removeElementAt(), removeAllElements(), capacity()*/
package collection.methods;
import java.util.Vector;
public class A114_VectorMethods {
public static void main(String[] args) {
		Vector v1=new Vector();  
		v1.addElement("Revaa");      //addElement(Object obj); - add the element
		v1.addElement("Sanchi");
		v1.addElement("Ziva");
		v1.addElement("Maya");
		System.out.println(v1);
		
		v1.addElement(800);
		v1.addElement("Ziva");
		v1.addElement("Ziva");
		
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement(null);
		System.out.println("adding heterogeneous elements one by one : "+v1);
		
		
		System.out.println(v1.firstElement());  //firstElement() - get the first element
		System.out.println(v1.lastElement());   //lastElement() - get the last element
		
		System.out.println(v1.removeElement("Maya")); //removeElement(Object obj); - remove the element
		
		v1.removeElementAt(1); //removeElementAt(int index); - remove the element at given index
		
		System.out.println(v1);
		
		System.out.println(v1.capacity()); //capacity-length of array
		
		v1.removeAllElements(); //removeAllElements() -remove all elements from collection
		System.out.println(v1);
	
	}

}
