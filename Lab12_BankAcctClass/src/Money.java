
public class Money {
	int dollars;
	int cents;
	double money;
	String currency;

	// Getters
	public int getDollars() {
		return dollars;
	}

	public int getCents() {
		return cents;
	}

	public String currency() {
		return currency;
	}

	// Setters
	public void setDollars(int dollarVal) {
		if (dollarVal < 0)
			System.out.println("Can't have a negative amount of dollars");
		else
			dollars = dollarVal;
	}

	public void setMoney(double moneyVal) {
		money = Math.abs(moneyVal);
	}

	public void setCents(int centVal) {
		cents = centVal;
		if (dollars >= 0) {
			while (cents >= 100) {
				cents -= 100;
				dollars++;
			}
			while (cents < 0) {
				cents += 100;
				dollars--;
			}
		} else {
			while (cents > 0) {
				cents -= 100;
				dollars++;
			}
			while (cents <= -100) {
				cents += 100;
				dollars--;
			}
		}

	}

	public void setCurrency(String currencyVal) {
		currency = currencyVal;
	}

	// Other Methods

	// Constructors
	public Money() {

	}

	public Money(int dollars, int cents) {
		setDollars(dollars);
		if (cents > 99) {
			dollars += cents / 100;
		}
		cents %= 100;
		setCents(cents);
	}

	public void add1(Money m) {
		int d, c;
		d = dollars + m.getDollars();
		c = cents + m.getCents();
		// Update instance variables
		dollars = d;
		cents = c;
	}// Adding to existing object
		// This function is class in main to add m to n

	// Comparison Methods
	public boolean isGreaterThan(Money m) {
		if (m.getDollars() > dollars)
			return true;
		else
			return false;
	} // Returns True if this object has a higher value than m. False otherwise.

	public boolean isLessThan(Money m) {
		if (m.getDollars() < dollars)
			return true;
		else
			return false;
	} // Returns True if this object has a lower value than m. False otherwise.

	public boolean isBigMoney(Money m) {
		if (m.getDollars() > 100)
			return true;
		else
			return false;
	} // Returns true if this money has a value greater than $100. Ex, $100 is
		// small money, $111.11 is big money.

	// Operation Methods
	public void add(Money m) {
		add1(m);
		if (cents > 99) {
			dollars += cents / 100;
		}
		cents %= 100;
	} // Adds m to total. Hint: What happens when you add 1.50 + 2.51? => ?.??

	public void sub(Money m) {
		dollars = Math.abs(m.getDollars() - dollars);
		cents = Math.abs(m.getCents() - cents);
	} // Subtracts m from total.

	public void mult(int multiplier) {
		dollars *= multiplier;
		cents *= multiplier;
		if (cents > 99) {
			dollars += cents / 100;
		}
		cents %= 100;

	} // Multiplies total by scalar factor multiplier.

	public Money changeFrom20() {
		Money returnVal = new Money();
		returnVal.dollars = Math.abs(19 - dollars);
		returnVal.cents = Math.abs(100 - cents);
		return returnVal;
	}

	// Output Methods
	public String toStr() {
		String returnVal = "$" + dollars;
		if (cents < 10)
			returnVal += "." + "0" + cents;
		else
			returnVal += "." + cents;
		return returnVal;
	}

	public String toEnglish() {
		String words[] = { "Zero", "", "One", "Ten", "Two", "Twenty", "Three", "Thirty", "Four", "Forty", "Five",
				"Fifty", "Six", "Sixty", "Seven", "Seventy", "Eight", "Eighty", "Nine", "Ninety", "Ten" };
		String amountInWords = "";
		String hundredsDollars = words[(dollars / 100) * 2];
		if (hundredsDollars.length() != 0) {
			amountInWords += hundredsDollars + " hundred and ";
		}
		String tensonesDollars = words[(((dollars / 10) % 10) * 2) + 1] + " " + words[(dollars % 10) * 2];
		if (tensonesDollars.length() > 1) {
			amountInWords += tensonesDollars;
		}
		String tensonesCents = words[((cents / 10) * 2) + 1] + " " + words[(cents % 10) * 2];
		if (tensonesCents.length() > 1) {
			amountInWords += " dollars and " + tensonesCents + " cents.";
		}
		return (amountInWords);
	}
}
