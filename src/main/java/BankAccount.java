//import java.time.LocalDate;
public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    public BankAccount(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = 0;
        this.balance = 0;
        this.dateOfBirth = dateOfBirth;
        this.accountType = "savings";
        this.overdraft = 100;
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

    public double getOverdraft() {
        return this.overdraft;
    }

    public void setOverdraft(double newOverdraft) {
        this.overdraft = newOverdraft;
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

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }

    //Deposit method
    public void deposit(int val) {
        this.balance += val;
    }

    //Withdrawal method
    public void withdrawal(int val) {
        if ((this.balance - val) > (0-overdraft)){
            this.balance = 0-overdraft;
        } else {
            this.balance -= val;
        }
    }

    //Interest method
    public void addInterest() {
        double savings_interest = 1.02;
        double current_interest = 1.04;
        double interest = 1;
        switch (accountType) {
            case "savings":
                interest = savings_interest;
                break;
            case "current":
                interest = current_interest;
                break;
        }
        this.balance *= interest;
    }

}
