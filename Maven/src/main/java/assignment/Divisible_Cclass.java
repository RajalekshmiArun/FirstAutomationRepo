package assignment;

public class Divisible_Cclass extends Addition_Pclass {
	
	public void divisibleby10()
	{super.add(10,20);
	int rem=super.c%10;
	if(rem==0)
	{System.out.println("It is divisible by zero");}
	
		}

	public static void main(String[] args) {
		Divisible_Cclass dc= new Divisible_Cclass();
		dc.divisibleby10();

	}

}
