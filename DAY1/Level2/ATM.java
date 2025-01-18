// Creating the ATM class having main method
public class ATM {
	public static void main(String[] args) {
		// Creating the object of BankAccount class
		BankAccount account1 = new BankAccount("Shivam Kumar", "SBI939753N", 62000.92);
        account1.displayAccountHolderDetails();
        account1.depositingMoney(21000.0067);
        account1.displayAccountHolderDetails();
        account1.withdrawMoney(40000);
        account1.displayAccountHolderDetails();
	}
}

class BankAccount {
	// Attribute of BankAccount class
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	// Constructor of the MobilePhone class, used for the initialization of the variables
	BankAccount(String name, String accountNumber, double balance) {
		this.accountHolder = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Behaviours of the AccountHolder class
	public void displayAccountHolderDetails() {
		System.out.println("Account holder name is " + accountHolder + " and account number is " + accountNumber + ". And current balance is: " + balance);
	}

	// Method for depositing the money
	public void depositingMoney(double amount) {
		balance += amount;
        System.out.println(amount + " has been deposited.");
	}

    // Method for withdrawing the money
	public void withdrawMoney(double amount) {
		if(amount > balance) {
            System.out.println("Insufficient balance in the account.\n Please try again!");
            return;
        }

        balance -= amount;
        System.out.println(amount + " is successfully withdrawn. \nCurrent balance left is: " + balance);
	}
}