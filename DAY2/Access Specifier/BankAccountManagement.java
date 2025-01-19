public class BankAccountManagement {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount(93748637, "Shivam", 4545);
        account1.getAccountNumber();
        account1.getAccountHolder();
    }
}

// Bank Account class definition
class BankAccount {
    // Attributes
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Paramaterized constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to get balance of the bank account
    public double getBalance() {
        return balance;
    }

    // Method to modify the balance of the bank account
    public void modifyBalance(double balance) {
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount {
    SavingAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void getAccountNumber() {
        System.out.println("Account number is " + accountNumber);
    }

    public void getAccountHolder() {
        System.out.println("Account holder is " + accountHolder);
    }
}