package assignment;
//program to find factorial of a number(instance method)
//Output-"Factorial of <given number>is <result>"

public class InstanceFact {
	
	public static void fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

	public static void main(String[] args) {
		
		InstanceFact ob= new InstanceFact();
		ob.fact(5);
	}

}
