package assignment;
//check whether the number is Palindrome/not by using Instance method
//Method 1 - to find the reverse(pass the number in argument)
//Method 2 - to check Palindrome or not

public class InstacePalindrome {
	
	public static int reverse(int num)
	{
		
	int rev=0,rem;
	while (num!=0)
	{rem=num%10;
	rev= rev*10+rem;
	num=num/10;
		
	}
	return rev;

	}
	public static void checkPali(int num,int rev)
	{
	
		if(num==rev)
			System.out.println("It is  Palindrome");
		else
			System.out.println("It is not Palindrome");
	}

	public static void main(String[] args) {
		int num=323;
		int t1=reverse(num);
		checkPali(num,t1);
		
		
		

	}

}
