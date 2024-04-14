public class SavingsAccount extends BankAccount {

    // Instance variables
    private double rate = 0.025; // 2.5%
    private int savingsNumber = 0;
    private String accountNumber;

    // Constructor taking name and initial balance as parameters
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        // Initialize accountNumber with the superclass's accountNumber concatenated with the savingsNumber
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;

    }

    // Method to calculate and deposit monthly interest
    public void postInterest() {
        // Calculate interest
        double interest = getBalance() * rate / 12;
        // Deposit interest into the account
        deposit(interest);
    }

    // Override the getAccountNumber method
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
        super(oldAccount, initialBalance);
        // Increment savingsNumber for the new account
        savingsNumber = oldAccount.savingsNumber + 1;
        // Initialize accountNumber for the new account
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
