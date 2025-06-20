package interfacedemo;

public class Interfaceclass implements Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceclass ob= new Interfaceclass();
		ob.display();
		Interfacedemo ob1= new Interfaceclass();//reference of interface is created.
		ob1.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method");
		System.out.println("Value of A is "+a);
	}

}
