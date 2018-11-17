
public class Point {
	double x;
	double y;

	// Getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// Setters
	public void setX(double xVal) {
		if (xVal < 0)
			System.out.println("Point not in quadrant 1.");
		else
			x = xVal;
	}

	public void setY(double yVal) {
		if (yVal < 0)
			System.out.println("Point not in quadrant 1.");
		else
			y = yVal;
	}

	// Constructors
	public Point() {

	}

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

}
