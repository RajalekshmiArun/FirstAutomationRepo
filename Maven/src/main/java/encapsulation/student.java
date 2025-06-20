package encapsulation;

public class student {

	private int id;//instance variable declared as private
	private String name;
	//used source -> generate Getter and Setter methods 
	public int getId() {
		return id;
	}
	public void setId(int id) //used to set
	{
		this.id = id;//local variable value is stored in instance variable
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
