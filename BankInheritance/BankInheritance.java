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

    }
}

