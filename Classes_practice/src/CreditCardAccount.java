
public class CreditCardAccount {
	String firstName;
	String lastName;
	int accountNumber;
	String bankName;
	int amtDollars;
	int minDollars;
	int CVC;
	int expDate;
	String type;

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// Setters
	public void setFirstName(String firstNameVal) {
		firstName = firstNameVal;
	}

	public void setLastName(String lastNameVal) {
		lastName = lastNameVal;
	}

	// Constructors
	public CreditCardAccount() {

	}

	public CreditCardAccount(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

}