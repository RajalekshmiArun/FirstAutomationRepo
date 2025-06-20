package aasignment_inheritance;

public class Salary extends CalculateSalary
{
	float totsal;
public void GetSalary()
{
	//super.CalculateHRAPF();
	totsal=super.bp+super.hra-super.pf-super.dd+super.bon;
	
}

public void SalarySLip()
{
System.out.println("Your Total salary is "+totsal);	
System.out.println("PF is"+super.pf);
System.out.println("HRA= "+super.hra);
System.out.println("Bonus= "+super.bon);
System.out.println("Deduction= "+super.dd);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s=new Salary();
		s.GetConsole(3000,200,1050);
		s.CalculateHRAPF();
		s.GetSalary();
		s.SalarySLip();

	}

}
