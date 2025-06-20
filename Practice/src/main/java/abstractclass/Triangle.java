package abstractclass;

public class Triangle extends Geometricshape {
	private double s1;
	private double s2;
	private double s3;
	 public Triangle(double s1,double s2,double s3)
	 {
		 this.s1=s1;
		 this.s2=s2;
		 this.s3=s3;
		 
		 
	 }

	public static void main(String[] args) {
		Geometricshape gs=new Triangle(12,12,12);
		System.out.println("Area of Trianlge is "+gs.area());
		System.out.println("Perimeter of Trianlge is "+gs.perimeter());

	}

	@Override
	public double area() {
		double side=(s1+s2+s3)/2;
		return Math.sqrt(side*(side-s1)*(side-s2)*(side-s3));
		
	}

	@Override
	public double perimeter() {
		return(s1+s2+s3);
	}

}
