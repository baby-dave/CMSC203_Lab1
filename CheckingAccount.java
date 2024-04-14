
	public class CheckingAccount extends BankAccount {

	    // Static constant representing the cost of clearing one check
	    static final double FEE = .15;

	     // Constructor taking name and initial amount as parameters
	     public CheckingAccount(String name, double initialAmount) {
	         super(name, initialAmount);
	         // Initialize accountNumber with the current value concatenated with "-10"
	        setAccountNumber(getAccountNumber() + "-10");
	     }
	 
	     // Override the withdraw method
	     @Override
	     public boolean withdraw(double amount) {
	         // Add the fee for check clearing to the withdrawal amount
	         double totalAmount = amount + FEE;
	         // Call the withdraw method from the superclass
	         boolean completed = super.withdraw(totalAmount);
	         // Return the result from the superclass method
	         return completed;
	     }

	     

	}


