
public class Date {
	int day;
	int month;
	int year;

	// Getters
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// Setters
	public void setDay(int dayVal) {
		if (dayVal <= 0 || day > 31)
			System.out.println("Can't have a negative day.");
		else
			day = dayVal;
	}

	public void setMonth(int monthVal) {
		if (monthVal < 0 || monthVal > 12)
			System.out.println("Can't have a negative month/month greater than 12.");
		else
			month = monthVal;
	}

	public void setYear(int yearVal) {
		if (yearVal < 0)
			System.out.println("Can't have a negative year.");
		else
			year = yearVal;
	}

	// Constructors
	public Date() {

	}

	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
}
