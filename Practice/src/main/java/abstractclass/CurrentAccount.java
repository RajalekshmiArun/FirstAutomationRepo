package abstractclass;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNum, double balance) {
		super(accountNum, balance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (getBalance()>=amount)
		{
			setBalance(getBalance()-amount);
			System.out.println("Debited amount is"+amount+"NewBalance is "+getBalance());
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amount);
		System.out.println("Deposited Amount"+amount+"New Balnce is"+getBalance());
		
	}

}
