package accessspecifier;

public class NewAccessSpecifier {
	
	public static void main(String[] args) {
		
		AccessSP ob1= new AccessSP();
		ob1.defaultmethod();
		ob1.pubmethod();
		ob1.protectedmethod();
		/* because private methods can use only within the class. but protected,default,
		 * public methods can access in different classes of same package */
	}

}
