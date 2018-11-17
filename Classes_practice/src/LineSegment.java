
public class LineSegment {
	double x1, x2, y1, y2;

	// Getters
	public double getx1() {
		return x1;
	}

	public double getx2() {
		return x2;
	}

	public double gety1() {
		return y1;
	}

	public double gety2() {
		return y2;
	}

	// Setters
	public void setx1(double x1val) {
		x1 = x1val;
	}

	public void setx2(double x2val) {
		x2 = x2val;
	}

	public void sety1(double y1val) {
		y1 = y1val;
	}

	public void sety2(double y2val) {
		y2 = y2val;
	}

	// Constructors
	public LineSegment() {

	}

	public LineSegment(double x1, double y1, double x2, double y2) {
		setx1(x1);
		setx2(x2);
		sety1(y1);
		sety2(y2);
	}

}
