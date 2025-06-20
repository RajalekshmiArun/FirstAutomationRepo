package aggregationnew;

public class Line_Item {
	
	
	
	int qty;
	Product pr;
	
	public Line_Item(int qty, Product pr) {
		super();
		this.qty = qty;
		this.pr = pr;
	}

	public void display()
	{
		
		System.out.println("ID:"+pr.id);
		System.out.println("Name:"+pr.name);
		System.out.println("Description:"+pr.desc);
		System.out.println("Quantity"+qty);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pr1= new Product(320,"New","Good and Reusable");
		Line_Item li= new Line_Item(5,pr1);
		li.display();

	}

}
