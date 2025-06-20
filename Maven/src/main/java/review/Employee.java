package review;

public class Employee implements Car{
	String name;
	int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em= new Employee();
		em.display("John",120);
		Car cr=new Employee();
		cr.display();
		
		}

	
	public void display(String name, int id)
	{
		this.name=name;
		this.id=id;
		System.out.println("Name "+name);
		System.out.println("Id "+id);
		}


	@Override
	public void display() {
	
		
		System.out.println("Regnum is 1336");
		System.out.println("Carname is innova");
	}
}
