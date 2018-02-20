import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        this.accountNumber = Bank.getNumberOfAccount();
        Bank.incrementNumber();
        this.accountBalance = 0;
    }

    public boolean deposit(final double amount) {
        if (amount < 0) {
            return false;
        }
        this.accountBalance += amount;
        return true;
    }

    public boolean withdraw(final double amount) {
        if (amount < 0 || amount > this.accountBalance) {
            return false;
        }
        this.accountBalance -= amount;
        return true;
    }

    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}