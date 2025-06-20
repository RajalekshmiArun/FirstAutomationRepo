package abstraction;

public class Abstractchild/*this is child class of Abstract Class*/ extends Abstractclass/*this is Abstract class*/
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractchild ob= new Abstractchild();
		ob.display();
		ob.add();
		ob.sum();
		ob.setName();
		Abstractclass ob1= new Abstractchild();// Reference of Abstract class is created.
		
		ob1.display();
		ob1.add();
		ob1.sum();
		//ob1.setName();// refecrence of Abstract class can't access child class methods
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	System.out.println("Abstract Methods declared in Abstract class is inherited");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=9;int b=8;
		int c=a+b;
		System.out.println("Sum is"+c);
		
		
		
	}
	public void setName()
	{
		
		System.out.println("Setname is a instancemethod of child class of absract class");
	}
	

}
