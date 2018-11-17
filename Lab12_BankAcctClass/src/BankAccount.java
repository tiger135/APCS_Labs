
public class BankAccount {
	// Class (static) variables
	private static int numberOfTransactions = 0;
	private static int numberofBankAccounts = 0;
	// Instance (nonstatic) variables
	private String firstName, lastName, middleInitial;
	private Money balance = new Money();
	private String bankName;

	// Constructors
	public BankAccount() {

	}

	public BankAccount(String first, String last, String middle, Money b, String bName) {
		firstName = first;
		lastName = last;
		middleInitial = middle;
		balance.dollars = b.dollars;
		balance.cents = b.cents;
		bankName = bName;
	}

	public BankAccount(String name, Money b, String bName) {
		String[] nameProp = name.split(" ");
		firstName = nameProp[0];
		middleInitial = nameProp[1].substring(0, 1); // get rid of period in
														// middle initial
		lastName = nameProp[2];
		balance.dollars = b.dollars;
		balance.cents = b.cents;
		bankName = bName;
	}

	// Getters/Setters
	public String getfName() {
		return firstName;
	}

	public void setfName(String fName) {
		firstName = fName;
	}

	public String getlName() {
		return lastName;
	}

	public void setlName(String lName) {
		lastName = lName;

	}

	public String getmInit() {
		return middleInitial;
	}

	public void setmInit(String mInit) {
		middleInitial = mInit;
	}

	public String getbName() {
		return bankName;
	}

	public void setbName(String bName) {
		bankName = bName;
	}

	public Money getBankAcct() {
		return balance;
	}

	public void deposit(Money depositAmount) {
		numberOfTransactions++;
		balance.add(depositAmount);
		if (balance.cents > 99) {
			balance.dollars += balance.cents / 100;
		}
		balance.cents %= 100;

	}

	public void withdraw(Money withdrawAmount) {
		numberOfTransactions++;
		balance.cents -= withdrawAmount.cents;
		balance.dollars -= withdrawAmount.dollars;
		if (balance.cents < 0) {
			balance.dollars += balance.cents / 100;
		}
		balance.cents %= 100;
	}

	// Other Methods
	public String toStr() {
		String returnVal = bankName + " bank account for " + firstName + " " + middleInitial + ". " + lastName + ": $"
				+ balance.dollars + ".";
		if (balance.cents < 10)
			returnVal += "0" + balance.cents;
		else
			returnVal += balance.cents;
		return returnVal;
	}

	public String fullName() {
		return firstName + middleInitial + lastName;
	}

}
