package BankInheritance;

/**
 * Account
 */
class Account {
    private String accNo;
    private String name;
    private String address;
    private String phone;
    private String dob;
    protected long balance;

    // non Parametrised constructor
    public Account() {
        System.out.println("Non Parametrised  constructor ");
    }

    // Parametrised constructor
    public Account(String acc, String n, String add, String phone, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phone = phone;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    };

    public String getPhone() {
        return phone;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

/**
 * SavingsAccount
 */
class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phone, String dob) {
        // called Parametrised constructor
        super(acc, n, add, phone, dob); // use super for default constructor
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}

/**
 * LoanAccount
 */
class LoanAccount extends Account {

    public LoanAccount(String acc, String n, String add, String phone, String dob) {
        // called Parametrised constructor
        super(acc, n, add, phone, dob); // use super for default constructor
    }

    public void payEMI(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void repay(long amt) {
        if (amt >= balance) {
            balance = 0;
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class BankInheritance {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA001", "John Doe", "123 Main St", "123-456-7890",
                "01-01-1990");

        // Depositing some amount
        savingsAccount.deposit(1000);

        // Withdrawing some amount
        savingsAccount.withdraw(500);

        // Getting account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccNo());
        System.out.println("Name: " + savingsAccount.getName());
        System.out.println("Address: " + savingsAccount.getAddress());
        System.out.println("Phone: " + savingsAccount.getPhone());
        System.out.println("Date of Birth: " + savingsAccount.getDOB());
        System.out.println("Balance: " + savingsAccount.getBalance());

        System.out.println();

        // Creating a LoanAccount object
        LoanAccount loanAccount = new LoanAccount("LA001", "Jane Smith", "456 Oak St", "987-654-3210", "02-02-1985");

        // Paying an EMI
        loanAccount.payEMI(200);

        // Repaying the loan
        loanAccount.repay(500);

        // Getting account details
        System.out.println("Loan Account Details:");
        System.out.println("Account Number: " + loanAccount.getAccNo());
        System.out.println("Name: " + loanAccount.getName());
        System.out.println("Address: " + loanAccount.getAddress());
        System.out.println("Phone: " + loanAccount.getPhone());
        System.out.println("Date of Birth: " + loanAccount.getDOB());
        System.out.println("Balance: " + loanAccount.getBalance());
    }
}
