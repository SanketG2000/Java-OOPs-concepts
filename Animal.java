//Single  and multilevel inheritence
class Zoo {
 void  Dog()
 {
	System.out.println("Dog is barking"); 
 }
}
 class animal2 extends Zoo {
	void cat()
	{
		System.out.println("Cat is eating");
	}
}
 class animal3 extends animal2{
	 void monkey()
	 {
		 System.out.println("Monkey eating banana");
	 }
 }
public class Animal {
	public static void main(String[] args) {
		animal3 am=new animal3();
		am.Dog();
		am.cat();
		am.monkey();
	}
}

//Hierarchical inheritance

class Zoo {
 void  Dog()
 {
	System.out.println("Dog is barking"); 
 }
}
 class animal2 extends Zoo {
	void cat()
	{
		System.out.println("Cat is eating");
	}
}
 class animal3 extends Zoo{
	 void monkey()
	 {
		 System.out.println("Monkey eating banana");
	 }
 }
public class Animal {
	public static void main(String[] args) {
		animal3 am=new animal3();
		animal2 am1=new animal2();
		am.Dog();
		am1.cat();
		am.monkey();
	}
}
