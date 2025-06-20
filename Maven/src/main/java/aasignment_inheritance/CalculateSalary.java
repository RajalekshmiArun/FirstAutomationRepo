package aasignment_inheritance;
//Class 2- Calculate hra(5% of basic pay ) and pf(20%)
public class CalculateSalary extends Employee {
	
	float hra,pf;
	public void CalculateHRAPF()
	{ 
		//super.GetConsole(3000,200,600);
	System.out.println(super.bp);
	hra=(super.bp*5)/100;
	pf=(super.bp*20)/100;
	
	
	
	}

	/*public static void main(String[] args) {
		
	 	CalculateSalary	ob=new CalculateSalary();
	 	ob.CalculateHRAPF();
		
	}*/

}
