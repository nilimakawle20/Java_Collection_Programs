/*WAP on Stack methods pop(), peak(), push()*/
package collection.methods;
import java.util.Stack;
public class A115_StackMethods {
public static void main(String[] args) 
    {
	 Stack s=new Stack();
	 s.add("Nilima");
	 s.add("Siya");
	 s.add("Radha");
	 s.add("Nishtha");
	 s.add("Maithili");
	 System.out.println("Printing stack: " +s);
	 
	Object a1 =s.pop();         //pop()-remove last object from stack top
	System.out.println("pop object: "+a1); 
	System.out.println("stack after pop operation: "+s);
	
	Object a2 =s.peek();
	System.out.println("peak object: "+a2); //pop()-look at last object from stack top but do not remove it
	System.out.println("stack after peak operation: "+s);
	 
	Object a3 =s.push("Arha");         //push()-add object at last on stack top
	System.out.println("push object: "+a3); 
	System.out.println("stack after push operation: "+s);
	}

}
