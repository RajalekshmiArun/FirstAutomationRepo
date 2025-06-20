package multipleinheritence;

public class Childclass implements ParentInterface1,ParentInterface2  {

	public static void main(String[] args) {
		
		Childclass ob= new Childclass();
		ob.add(25,30);
		ob.display();

	}

	@Override
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Sum is "+c);
		
	}

	@Override
	public void display() {
		System.out.println("Display");
	}
}
	
 