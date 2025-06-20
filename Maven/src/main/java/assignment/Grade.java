package assignment;

public class Grade {
	int sum,mark1,mark2,mark3,total1,total2;
	
	public Grade(int m1, int m2, int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
		sum=mark1+mark2+mark3;
		System.out.println(sum);
		}
	public Grade(int total1,int total2)
	{
		float p= total1/3;
		float p1=total2/3;
		
		if (p >= 90)System.out.println("A"); 
        else if (p >= 80) System.out.println("B");
        else if (p >= 70) System.out.println("C");
        else if (p >= 60) System.out.println("D");
        else System.out.println("E");
		if (p1 >= 90)System.out.println("A"); 
        else if (p1 >= 80) System.out.println("B");
        else if (p1 >= 70) System.out.println("C");
        else if (p1 >= 60) System.out.println("D");
        else System.out.println("E");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grade t1=new Grade(100,63,89);
Grade t2=new Grade(25,45,99);
int total1=t1.sum;
int total2=t2.sum;
Grade t3=new Grade(total1,total2);

	}

}
