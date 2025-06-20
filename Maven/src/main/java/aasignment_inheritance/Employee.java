/*Program to find the total salary by hand of an Employee
a. Class 1- Get basic pay, deduction, and bonus from the console
b. Class 2- Calculate HRA(5% of basic pay ) and PF(20%)
c. Class 3 finds the total salary (basic pay+hra-pf-education+bonus) and get the salary slip
d. Salary slip should contains:- basic pay, deduction, HRA, PF, bonus, and total 
salary by hand*/

package aasignment_inheritance;

public class Employee {
	float bp, dd, bon;
	float hra,pf;

	public void GetConsole(float bp,float dd,float bon)
	{
System.out.println("Basic Pay is"+bp+"Deduction= "+dd+"Bonus= "+bon);
this.bp=bp;
this.dd=dd;
this.bon=bon;
		
		
	}

}

