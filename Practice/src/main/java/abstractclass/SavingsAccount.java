package abstractclass;

public class SavingsAccount extends BankAccount {
double ibal=1000.;
double damount=500;
double wamount=300;

	public SavingsAccount(String accountNum, double balance) {
		super(accountNum, balance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa= new SavingsAccount("CA100",ibal);
		System.out.println("Initial Balance is ");
		sa.deposit(300);
		sa.withdraw(240);
		
		

	}

		@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amount);
		System.out.println("Deposited amount is "+amount+"Curent Balance is"+getBalance());
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(getBalance()>=amount)
		{
			setBalance(getBalance()-amount);
			System.out.println("Withdrawed amount is"+amount+"New Balance is"+getBalance());
		}
		else
		{System.out.println("Insufficient Balance");}
		
		
			
	}

}
