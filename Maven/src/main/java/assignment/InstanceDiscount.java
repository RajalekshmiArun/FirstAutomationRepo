package assignment;
/*WAP to check whether the customer have discount (get 20% discount if total amount is greater than 5000)
 * or not and get the final amount in main method. (Instance Method)
 * Get prices of items using parameterized method
 * METHOD 1 -Calculate Total amount
 * METHOD 2-Check discount
*/
public class InstanceDiscount {
	

	public int calculateAmount(int price1,int price2)
	{
		int total= price1+price2;
		if(total<5000)
		{
		System.out.println("Your total amount is "+total);
		}return total;
		}
		public int calculateDiscount(int t1)
		{int dis;
		dis=(t1*20)/100;
		if (t1>5000)
		{
		System.out.println("Your discounted amount is "+dis);}
		return dis;
		}
	public static void main(String[] args) {
	
		InstanceDiscount ob= new InstanceDiscount();
		int t1=ob.calculateAmount(4000,3000);
		int t2=ob.calculateDiscount(t1);
		if(t1>5000)
		{
		int t3=t1-t2;
		System.out.println("Your total amount is "+t3);
		}
		else
		{System.out.println("You will not get any discount");}
		
		
	}

}
