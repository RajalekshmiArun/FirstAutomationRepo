package exception;

public class Custom_Exception {

	public static void main(String[] args) throws MyException //exception declaration
	{

		int a=10;
		if(a>=18)
		{System.out.println("You are eligible");
		
		}
		else
		{
		throw new MyException ("Age should be greater than or equal to 18");
		//here we call the constructor MyException
	}

}
	}
