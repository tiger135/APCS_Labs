
public class Fraction {
	int numerator;
	int denominator;

	// Getters
	public int getNum() {
		return numerator;
	}

	public int getDenom() {
		return denominator;
	}

	// Setters

	public void setNum(int numVal) {
		numerator = numVal;
	}

	public void setDenom(int denomVal) {
		if (denomVal == 0)
			System.out.println("Can't divide by 0.");
		else
			denominator = denomVal;
	}

	// Constructors
	public Fraction() {

	}

	public Fraction(int numerator, int denominator) {
		setNum(numerator);
		setDenom(denominator);
	}

}
