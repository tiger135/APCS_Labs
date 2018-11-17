
public class DateClass {
	// Instance Variables
	private int month, day, year;
	private String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	private int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// Getters/Setters
	public void setDay(int dayVal) {

		day = dayVal;
	}// end setDay

	public void setMonth(int monthVal) {
		if (monthVal > 0 && monthVal <= 12)
			month = monthVal;
		else {
			month = 0;
			System.out.println("Error: Invalid DateClass " + monthVal + "/" + day + "/" + year);
		}
	}// end setMonth

	public void setYear(int yearVal) {
		if (year >= 0)
			year = yearVal;
	}// setYear

	public int getDay() {
		return day;
	} // getDay

	public int getMonth() {
		return month;
	}// getMonth

	public int getYear() {
		return year;
	}// end getYear

	public String monthName() {
		// Do minus 1 to account for zero indexing
		return monthNames[month - 1];
	}// end monthName

	// Constructors
	public DateClass() {
		day = 1;
		month = 1;
		year = 0;
	}

	public DateClass(int m, int d, int y) {
		setDay(d);
		setMonth(m);
		setYear(y);
	}

	public DateClass(int date) {
		int monthVal = (int) (date / (Math.pow(10.0, 6.0)));
		setMonth(monthVal);
		int dayVal = (int) ((date % (Math.pow(10.0, 6.0)) / 4));
		setDay(dayVal);
		int yearVal = (int) (date % (Math.pow(10.0, 4.0)));
		setYear(yearVal);
	}

	// Other Methods
	private int numDaysInMonth(int m) {
		if (isLeapYear() && m == 2)
			return 29;
		return monthDays[m - 1];
	}// end numDaysInMonth

	public String toStr() {
		if (!isLeapYear() && month == 2 && day > 28)
			return "Error: Invalid DateClass " + month + "/" + day + "/" + year;
		else if (isLeapYear() && month == 2 && day > 29)
			return ("Error: Invalid DateClass " + month + "/" + day + "/" + year);
		else
			return (monthName() + " " + day + ", " + year);
	}// end toStr

	public boolean isLastDayOfMonth() {
		if (numDaysInMonth(month) == day)
			return true;
		return false;
	}// end isLastDayofMonth

	public boolean isBefore(DateClass d) {
		if (year < d.getYear())
			return true;
		else if (year == d.getYear() && month < d.getMonth())
			return true;
		else if (year == d.getYear() && month == d.getMonth() && day < d.getDay())
			return true;
		else
			return false;
	}// end isBefore

	public boolean isAfter(DateClass d) {
		if (year > d.getYear())
			return true;
		else if (year == d.getYear() && month > d.getMonth())
			return true;
		else if (year == d.getYear() && month == d.getMonth() && day > d.getDay())
			return true;
		else
			return false;
	} // end isAfter

	public boolean isSameDate(DateClass d) {
		if (year == d.getYear() && month == d.getMonth() && day == d.getDay())
			return true;
		return false;
	} // end isSameDate

	public boolean isLeapYear() {
		return isYearLeap(year);
	} // end isLeapYear

	private boolean isYearLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		return false;
	} // end isYearLeap

	public DateClass nextDate() {
		DateClass d = new DateClass(month, day, year);
		if (month == 12 && isLastDayOfMonth()) {
			d.setYear(year + 1);
			d.setMonth(1);
			d.setDay(1);
		} else if (isLastDayOfMonth()) {
			d.setMonth(month + 1);
			d.setDay(1);

		} else
			d.setDay(day + 1);

		return d;
	} // end nextDate

	public DateClass prevDate() {
		DateClass d = new DateClass(month, day, year);
		if (day == 1) {
			if (month == 1) {
				d.setMonth(12);
				d.setDay(31);
				d.setYear(year - 1);
			} else {
				d.setDay(numDaysInMonth(month - 1));
				d.setMonth(month - 1);
			}
		} else
			d.setDay(day - 1);
		return d;
	} // end prevDate

	public int daysApart(DateClass d) {
		DateClass m = new DateClass(month, day, year);
		DateClass maxDate = d, minDate = m;
		int numDays = 2;
		if (m.isAfter(d))
			maxDate = m;
		if (d.isBefore(m))
			minDate = d;
		while (!(minDate.getDay() == maxDate.getDay() && minDate.getMonth() == maxDate.getMonth()
				&& minDate.getYear() == maxDate.getYear())) {
			maxDate = maxDate.prevDate();
			numDays++;
		}
		return numDays;
	} // end daysApart

	public int dayOfYear() {
		DateClass d = new DateClass();
		d.setDay(1);
		d.setMonth(1);
		d.setYear(year);
		return daysApart(d);
	} // end dayOfYear

	public int daysLeftInMonth() {
		return numDaysInMonth(month) - day;
	} // end days:eftInMonth

	private int numDaysinYear() {
		int yearDays;
		if (isLeapYear())
			yearDays = 366;
		else
			yearDays = 365;
		return yearDays;
	} // end numDaysinYear

	public int daysLeftInYear() {
		return (numDaysinYear() - dayOfYear());
	}

	public int daysLeftInDecade() {
		return daysLeftInYear() + (numDaysinYear() * (10 - (year % 100)));
	} // end daysLeftInDecade

	public int daysLeftInCentury() {
		return daysLeftInDecade() + ((numDaysinYear() * 100) * (100 - (year % 100)));
	} // end daysLeftInCentury

	public DateClass earlierDate(DateClass d) {
		DateClass date = new DateClass();
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		if (isBefore(d))
			return date;
		else
			return d;
	} // end earlierDate

	public DateClass laterDate(DateClass d) {
		DateClass date = new DateClass();
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		if (isAfter(d))
			return date;
		else
			return d;
	} // end laterDate

	// Advanced
	public String dayOfTheWeek() {
		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		int[] keyVal = { 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };
		int thing = keyVal[month - 1] + day + ((int) (year % 100) / 4);
		if (isLeapYear() && (month == 1 || month == 2))
			thing--;
		if (year / 100 > 20) {
			while (year / 100 > 20)
				year -= 400;
		} else if (year / 100 < 17) {
			while (year / 100 < 17)
				year += 400;
		}

		if (year / 100 == 17)
			thing += 4;
		else if (year / 100 == 18)
			thing += 2;
		else if (year / 100 == 20)
			thing += 6;

		thing = (thing + year % 100) % 7;
		return days[thing];
	} // end dayOfTheWeek

}
