//This program is about Class & Object
class Area1 {
int side;
int l,b;

void square()
{
	side=5;
	System.out.println("Area of square=" +side*side);
}
void rect()
{
	l=3;b=5;
	System.out.println("Area of rectangle=" + l*b);
}
}

public class Area {

	public static void main(String[] args) {
	Area1 ar=new Area1();
	ar.square();
	ar.rect();

	}

}
