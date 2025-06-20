package finalkw;

//public final class Finalkeyword
//final class can't be inherited
public class Finalkeyword
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int a=10;// a variable declared as final
		//a=10; can't change the value.
		 
	}
	
	public final void display()
	{
		System.out.println("Cant override final method");
		
	}

}
