//Polymorphism method overloading

class adder{
	static int add(int a,int b) 
	{
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static double add(double a,double b) {
		return a*b;
	}
}
public class Overloading1 {

	public static void main(String[] args) {
	adder ad=new adder();
System.out.println(	ad.add(1,2));
System.out.println(ad.add(2,5,8));
System.out.println(ad.add(2.0,8.0));
	
	}

}
