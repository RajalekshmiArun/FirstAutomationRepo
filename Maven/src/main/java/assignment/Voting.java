package assignment;
//WAP to check whether the candidate is eligible for voting(use static method 
//and boolean return type)
public class Voting {
	
	static void vote(int a)
	{
	int age=a;
	boolean eli=true,noeli=false;
	if (age>=18)
		System.out.println(eli);
	else
		System.out.println(noeli);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=19;
		vote(a);
		
		
		
	}

}
