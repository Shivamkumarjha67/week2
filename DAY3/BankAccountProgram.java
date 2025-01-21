class BankAccount {
    static String bankName = "SBI";
    static int totalAccount = 0;

    static void getTotalAccount() {
        System.out.println("Total number of the account is: " + totalAccount);
    }

    protected String accountHolderName;
    public final int accountNumber; 

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }
}

class Account extends BankAccount {
    Account(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public void getAccountDetails() {
        System.out.println("Account holder name is " + accountHolderName + " and account number is " + accountNumber);
    }
}

public class BankAccountProgram {
    public static void main(String[] args) {
        Account account1 = new Account("Sandeep", 34234235);
        System.out.println("account1 is object of type BankAccount? " + (account1 instanceof BankAccount));
        account1.getAccountDetails();
        
    }
}