package assignment;
/*Program to calculate discount, if customer purchase clothes 
 * on off season, set discount 15”% and on season 40%
1.	should use two classes onseason, offseason
2.	use two methods-discount (?method name should be same)*/


public class PolymorphismOnseason {
	
	float dis;
	//String season;
	String season;
	public String CheckSeason(String season)
	{ 
		season=this.season;
		return season;
		
	}
	public void discount(float total)
	
	{
		dis=(total*40)/100;
		float disc=total-dis;
		System.out.println("Your discount is "+dis+"Your new total is "+disc);
		//season="Onseason";
		//return season;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
