//import java.time.LocalDate;
public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = 0;
        this.balance = 0;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String changedFirstName) {
        this.firstName = changedFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String changedLastName) {
        this.lastName = changedLastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDOB) {
        this.dateOfBirth = newDOB;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }


    //Deposit method
    public void deposit(int val) {
        this.balance += val;
    }

    public void withdrawal(int val) {
        this.balance -= val;
    }

    public void addInterest() {
        double savings_interest = 1.02;
        this.balance *= savings_interest;
    }

}
