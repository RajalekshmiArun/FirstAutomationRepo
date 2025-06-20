package abstractclass;
/*Write a Java program to create an abstract class BankAccount with abstract methods 
deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
extend the BankAccount class and implement the respective methods to handle deposits and 
withdrawals for each account type.*/
public abstract class BankAccount {
	
	private String accountNum;
	private double  balance;
	
	public BankAccount(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);

	
	

}
