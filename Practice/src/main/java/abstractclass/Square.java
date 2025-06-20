package abstractclass;

public class Square extends Geometricshape{
	
	private double side;
	
	public Square(double side) {
		
		this.side=side;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Geometricshape g=new Square(12.5);
		System.out.println("Area of square is"+g.area());
		System.out.println("Perimeter  of square is "+g.perimeter());

	}


	@Override
	public double area() {
		double a=side*side;
		
		
		return a;
		
	}


	@Override
	public double perimeter() {
		
		double p= 4*side;
		return p;
	}

}
