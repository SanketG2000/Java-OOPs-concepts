//Encapsulation program

class Person1 {
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}
	 public void setname(String name) {
	        this.name = name;
	}
	 public int getage() {
		 return age;
	 }
	 public void setage(int age) {
		 this.age =age;
		 
	 }
}



public class person {

	public static void main(String[] args) {
		
		Person1 p1=new Person1();
	p1.setname("Sanket");
	p1.setage(22);
	System.out.println("Name: "+ p1.getname());
	System.out.println("Age: "+ p1.getage());
	}

}
