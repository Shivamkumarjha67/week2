import java.util.ArrayList;

public class BankAndAccountHolder {
    public static void main(String[] args) {
        // Bank class objects
        Bank sbi = new Bank("SBI", "Bhopal");
        Bank uco = new Bank("UCO", "Bhagalpur");

        // Customer class objects
        Customer customer1 = new Customer("Sandeep", "Male", 23, "34523234");
        Customer customer2 = new Customer("vishwa", "Female", 22, "3523226663");

        // Adding the customer to 1st bank account
        sbi.openAccount(customer1);
        customer1.addAccount(sbi);
        sbi.openAccount(customer2);
        customer2.addAccount(sbi);

        // Adding the customer to 2nd bank account
        uco.openAccount(customer1);
        customer1.addAccount(uco);
        uco.openAccount(customer2);
        customer2.addAccount(uco);

        sbi.displayBankDetails();
        uco.displayBankDetails();

        sbi.showCustomersDetails();
        uco.showCustomersDetails();

        customer1.getAllAccounts();
        customer2.getAllAccounts();
    }
}

// Bank class definition
class Bank {
    // Attributes of the bank class 
    private String bankName;
    private String branchName;
    private int numberOfCustomers;

    // Collection of the customer in a bank
    private ArrayList<Customer> customers = new ArrayList<>();

    // Parameterized constructor
    Bank(String name, String branchName) {
        this.bankName = name;
        this.branchName = branchName;
    }

    // Getters
    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }
        
    // Method for the opening the account
    public void openAccount(Customer customer) {
        customers.add(customer);
        numberOfCustomers++;
        System.out.println("Account opened successfully.");
    }

    // Method for displaying the bank details
    public void displayBankDetails() {
        System.out.println("Bank name is " + bankName + " and it's branch name is " + branchName + ". Currently the number of the customer in the bank is " + numberOfCustomers);
    }

    // Method for displaying the details of the customer
    public void showCustomersDetails() {
        for(Customer customer : customers) {
            System.out.println("Cusomer name is " + customer.getName());
        }
    }
}

// Customer class definition
class Customer {
    // Attributes of the customer class
    private String name;
    private String gender;
    private int age;
    private String mobileNumber;

    // Customer having account in different banks
    private ArrayList<Bank> accounts = new ArrayList<>();

    // Parameterized constructor
    Customer(String name, String gender, int age, String mobilenumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = mobilenumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Adding all accounts to the customer record
    public void addAccount(Bank account) {
        accounts.add(account);
    }

    // Method for getting all accounts that customer has opened
    public void getAllAccounts() {
        for(Bank account : accounts) {
            System.out.println("Bank name is " + account.getBankName() + " and branch name is " + account.getBranchName());
        }
    }
}