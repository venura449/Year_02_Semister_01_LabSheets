package labs.lab01;

public class BankAccount {

	private	String accNumber;
	private String accHolderName;
	private float balance;

	public BankAccount() {
		
	}
	
	public BankAccount(String accNumber,String accHolderName,float balance) {
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
		
	}
	
	public float balancegetter() {
		return balance;
	}
	
	public void balancesetter(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amount) {
		balance+=amount;
	}
	
	public void withdraw(float amount) {
		balance-=amount;
	}

	public void display() {
		System.out.println("Account No :"+ accNumber);
		System.out.println("Account Holder Name :"+accHolderName);
		System.out.println("Current Account Balance : "+balance);
	}
	
}
