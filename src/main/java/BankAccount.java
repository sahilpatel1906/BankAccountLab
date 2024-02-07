//import java.time.LocalDate;
public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

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

}
