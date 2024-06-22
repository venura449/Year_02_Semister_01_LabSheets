

public class BankApp {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount("66080ABOC1","Venura Jayasingha",2000);
		customer1.balancesetter(5000);
		System.out.println("Current Balance of the Customer : "+customer1.balancegetter());
		customer1.deposit(2000);
		customer1.withdraw(1000);
		System.out.println("Current Balance of the Customer : "+customer1.balancegetter());
		customer1.display();
	}

}
