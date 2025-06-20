package assignment;
//Program to  set your name and age by a instance method
public class SetNameAge {
	
	public static void setNameandAge(String name, int age)
	{
		System.out.println("Name is "+name+"\nAge is "+age);
	}
	public static void main(String[] args) 
	{
		SetNameAge ob= new SetNameAge();
		ob.setNameandAge("Devu",25);

	}

}
