//upcasting//
package collection.interface1;
class Delhi
{
 void vehicle()
 {
	 System.out.println("Delhi vehicle");
 }
 
 void busses()
 {
	 System.out.println("Delhi busses");
 }
}

public class C29_Banglore extends Delhi{
	void add()
	{
		 System.out.println("Please add");
	}

	public static void main(String[] args) 
	{
		Delhi d1=new C29_Banglore();
		d1.vehicle();
		d1.busses();

	}

}
