package assignment;
/*Program to find the factorial of a number
 * 1.Two methods, one for find calculate and other for print result
 * 2. Pass the number as argument
 * 3.Main method allows to invoke only one method 
 */
public class Factorial {
	int num,fact=1,disfact;
	
	public Factorial(int num)
	{
		this.num=num;	
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		this.disfact=fact;
	}
	
	public Factorial()
	{ this(5);
	System.out.println("Factorial of a number is "+disfact);
	
		
	}
public static void main(String[] args) 
{
	Factorial f1= new Factorial();
	}

}
