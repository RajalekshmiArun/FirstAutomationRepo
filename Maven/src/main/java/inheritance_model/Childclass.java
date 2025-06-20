package inheritance_model;

//import inheritancemodel.Childclass;

public class Childclass extends Parentclass {
	

	public Childclass()
	{
		System.out.println("This is child class constructor");
		
	}
	
	
	
	public static void main(String[] args)
	{
		Childclass op= new Childclass();
		op.add(12,15);

	}
	public void add(int a,int b)
	{
		
	int c=a+b;
	System.out.println("Sum is "+c);
	System.out.println(super.b);
	}

}
