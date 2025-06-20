package accessspecifier1;

import accessspecifier.AccessSP;

public class NewAccessSP extends AccessSP {

	public static void main(String[] args) {
		NewAccessSP ob2= new NewAccessSP();
		ob2.protectedmethod();
		ob2.pubmethod();
		
		/*Protected methods can invoke through inheritance to a different package and 
		 * public methods can invoke everywhere  */
		}

}
