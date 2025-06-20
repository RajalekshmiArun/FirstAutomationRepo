package Superkw;

public class Childclass extends Parentclass {
	int a=50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childclass cc=new Childclass();
		cc.meth();
	
	} 
	public void meth()
	{
		System.out.println("JAVA");
		super.sample();
		System.out.println(super.a);
	}
	public Childclass()
	{
		super();
		System.out.println("Constructor");	
	}
	

}
