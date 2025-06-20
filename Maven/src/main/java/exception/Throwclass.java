package exception;

public class Throwclass {
	
	

	public static void main(String[] args) {
		
		int a=10;
		if(a>=18)
		{System.out.println("You are eligible");
		
		}
		else
		{
		throw new ArithmeticException ("Age should be greater than or equal to 18");
		//it is used to create your own exception.
			
		}

	}

}
