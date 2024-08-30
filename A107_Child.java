/*WAP using upcasting concept*/
package collection.methods;

class Parent
{
	void method1()
	{
		System.out.println("Parent method 1");
	}
	
	void method2()
	{
		System.out.println("Parent method 2");
	}
}

public class A107_Child extends Parent{
	void add()
	{
		 System.out.println("Please add");
	}

	public static void main(String[] args) {
		
		Parent p=new A107_Child(); // upcasting , Parent = child
		p.method1();
		p.method2();
	}

}
