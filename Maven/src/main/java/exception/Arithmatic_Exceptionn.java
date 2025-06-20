package exception;

public class Arithmatic_Exceptionn {
	

	public static void main(String[] args) {
		int a=10;
		try{
		int c=a/0;
		}
		catch(ArithmeticException ae)//ae- exception variable.
		{
		int c=a/2;	
		System.out.println(c);
		System.out.println(ae);//exception variable gives details of exception.
		}
		
		

	}

}
