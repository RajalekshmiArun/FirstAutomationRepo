package aggregation;

public class Childclass {

String name;
int id;
Parentclass ob;

	
	
	public Childclass(String name, int id, Parentclass ob) {
	super();
	this.name = name;
	this.id = id;
	this.ob = ob;
}


	public void display() {
		
		System.out.println("Name "+name);
		System.out.println("Id:"+id);
		System.out.println("House Name "+ob.hname);
		System.out.println("City "+ob.city);
		System.out.println("State "+ob.state);
		System.out.println("Pin:"+ob.pin);



		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parentclass ob1= new Parentclass("John villa","Cochin","Kerala",690500);
		Childclass ob2= new Childclass("John",320,ob1);
		ob2.display();
		
	}

}
