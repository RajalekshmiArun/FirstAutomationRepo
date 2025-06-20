package assignment;

public class PolymorphismOffseason extends PolymorphismOnseason {
	float ntotal,ndis,newdis;
	String season;
	public String CheckSeason( String season)
	{ 
		season=this.season;
		return season;
		
	}
	
	public void discount(float ntotal)
	{
	
		ndis=(ntotal*15)/100;
		newdis=ntotal-ndis;
		System.out.println("Your discount is "+ntotal+"Your new Total is "+newdis);
		super.discount(1000);
		
		//season="Offseason";
		//return season;
		
	}

	public static void main(String[] args) {
		
		PolymorphismOffseason po=new PolymorphismOffseason();
		String s=po.CheckSeason("Onseason");
		
		
	}

}
