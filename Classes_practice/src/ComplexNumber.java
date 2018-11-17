
public class ComplexNumber {
	// a,b
	double a;
	double b;

	// Getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	// Setters
	public void setA(double aVal) {
		a = aVal;
	}

	public void setB(double bVal) {
		b = bVal;
	}

	// Constructors
	public ComplexNumber() {

	}

	public ComplexNumber(double a, double b) {
		setA(a);
		setB(b);
	}

}
