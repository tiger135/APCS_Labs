
public class Circle {
	double centerX;
	double centerY;
	double center;
	int radius;

	// Getters
	public double getCenterX() {
		return centerX;
	}

	public double getCenterY() {
		return centerY;
	}

	public double getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}

	// Setters
	public void setCenterX(double centerXVal) {
		centerX = centerXVal;
	}

	public void setCenterY(double centerYVal) {
		centerY = centerYVal;
	}

	public void setCenter(double centerVal) {
		center = centerVal;
	}

	public void setRadius(int radiusVal) {
		if (radiusVal <= 0)
			System.out.println("Can't have a negative radius.");
		else
			radius = radiusVal;

	}

	// Constructors
	public Circle() {

	}

	public Circle(double centerX, double centerY, double center, int radius) {
		setCenterX(centerX);
		setCenterY(centerY);
		setCenter(center);
		setRadius(radius);
	}
}
