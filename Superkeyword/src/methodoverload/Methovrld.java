package methodoverload;

public class Methovrld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Methovrld ob= new Methovrld();
		 ob.add(12,10);
		 ob.add(2.32f,1);

	}

	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	
	public void add(float a,int b)
	{
		float c=a+b;
		System.out.println("Sum is "+c);
	}
}
