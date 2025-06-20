package methodoverld;

public class Childclass extends Parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childclass cc= new Childclass();
		cc.sample();
		cc.add(12,14);

	}

public void sample()
{
	System.out.println("Child class method");
	super.sample();
}
	
public void add(int a,int b)
{  
	super.add(25, 25);
	int c=a+b;
	System.out.println("Sum is "+c);
			}


}
