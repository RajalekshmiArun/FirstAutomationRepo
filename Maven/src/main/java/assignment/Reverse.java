package assignment;

/*Program to find reverse of a number
1.Two constructors, one for calculation reverse and other for display
2.argument variable and instance variable should be same
3. Main method allows to invoke only one constructor;*/
public class Reverse {
	int n,rev=0,rev1;
	
	public Reverse(int n)

	{
		this.n=n;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		//System.out.println(rev);
		//System.out.println(this.n);
		this.rev1=rev;
		
	}

	public Reverse()
	{
		this(108);
		
		System.out.println("THe reverse of "+n+" is "+rev1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Reverse r1= new Reverse(36);	
		int s=r1.rev1;
		int b= r1.n;*/
		Reverse r2=new Reverse();
		
		
 
	}

}
