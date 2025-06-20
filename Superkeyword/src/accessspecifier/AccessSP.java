package accessspecifier;



public class AccessSP {

	public static void main(String[] args) {
		AccessSP ob= new AccessSP();
		ob.defaultmethod();
		ob.privatemethod();
		ob.pubmethod();
		ob.protectedmethod();

	}
	 public void pubmethod()
	 {
		System.out.println("This is Public Method"); 
	 }
	 private void privatemethod()
	 {
		 System.out.println("This is Private Method"); 
	 }
	  void defaultmethod()
	 {
		  System.out.println("This is Default Method");  
	 }
	  protected void protectedmethod()
		 {
		  System.out.println("This is Protected Method");  
		 }
}
