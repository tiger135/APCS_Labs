
public class SavingsAccount {
	//Class (static) variables
	private static int numberOfTransactions=0;
	private static int numberOfBankAccounts=0;
	private static int nextAccount = 10000000;
	
	//Instance (nonstatic) variables
	private String firstName, lastName, middleInitial; // Mid initial no period
	private Money balance = new Money();
	private String bankName;
	private int accountNumber;
	private double interestRate; // Annual interest rate. This is fixed! Once it's set, it never changes.
	
	//Constructors
	public SavingsAccount() {
		
	}
	public SavingsAccount(String first, String last, String middle, Money b, String bName, double iRate) {
		firstName = first;
		lastName = last;
		middleInitial = middle;
		balance.dollars = b.dollars;
		if (b.dollars >= 1000) balance.add(new Money(100,0));
		balance.cents = b.cents;
		bankName = bName;
		interestRate = iRate;
	}
	public SavingsAccount(String name, Money b, String bName, double iRate) {
		String[] nameVal = name.split(" ");
		firstName = nameVal[0];
		middleInitial = nameVal[1].substring(0, 1);
		lastName = nameVal[2];
		balance.dollars = b.dollars;
		balance.cents = b.cents;
		bankName = bName;
		interestRate = iRate;
	} // name = "Bryan C. Vu" "Stephanie Shoa"
	
	public SavingsAccount(String bName, double iRate) {
		bankName = bName;
		interestRate = iRate;
	}
	//Getters/Setters
	public int getNumTransac() {
		return numberOfTransactions;
	}
	public int getNumAccts() {
		return numberOfBankAccounts;
	}
	public int getNextAcct() {
		return nextAccount;
	}
	public double getiRate() {
		return interestRate;
	}
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
	public Money getBalance() {
		return new Money(balance);
	}
	public String getbName() {
		return bankName;
	}
	public void setbName(String bName) {
		bankName = bName;
	}
	public int getAcctNum() {
		return accountNumber;
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
        return firstName + " " + middleInitial + ". "+lastName;
    }
    
    public void printReport() {
    	System.out.println("Bank: "+bankName);
    	System.out.println("Account Type: Savings Account");
    	System.out.println("Name: "+fullName());
    	System.out.println("Balance: "+balance.toStr());
    	System.out.println("Interest Rate: "+interestRate*100.0+"%");
    }
    
    public void accrueMonthlyInterest() {
    	Money beforeBal = balance;
    	balance.mult(1+interestRate/12.0);
    }
    
    






}
