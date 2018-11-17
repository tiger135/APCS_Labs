
public class Double {
	int exp;
	int mantissa;

	// Getters
	public int getExp() {
		return exp;
	}

	public int getMantissa() {
		return mantissa;
	}

	// Setters
	public void setExp(int expVal) {
		if (expVal < -8 || expVal > 7)
			System.out.println("Exponent not in acceptable range.");
		else
			exp = expVal;
	}

	public void setMant(int mantVal) {
		if (mantVal < -8 || mantVal > 7)
			System.out.println("Mantissa not in acceptable range.");
		else
			mantissa = mantVal;
	}

	// Constructors
	public Double() {

	}

	public Double(int exp, int mantissa) {
		setExp(exp);
		setMant(mantissa);
	}

}
