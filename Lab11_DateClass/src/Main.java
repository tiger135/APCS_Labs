public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 23

		DateClass d = new DateClass(12, 30, 2001);
		for (int i = 0; i < 10000; i++) {
			System.out.println(d.toStr());
			d = d.nextDate();
		}

		// Task 24

		DateClass m = new DateClass(11, 4, 2018);
		while (!(m.getDay() == 29 && m.getMonth() == 9 && m.getYear() == 2003)) {
			System.out.println(m.toStr());
			m = m.prevDate();
		}

		// Task 25

		DateClass n = new DateClass(11, 4, 2018);
		while (!(n.getDay() == 29 && n.getMonth() == 9 && n.getYear() == 2003)) {
			System.out.println(n.toStr() + ": " + n.dayOfTheWeek());
			n = n.prevDate();
		}

		// Task 26
		DateClass start = new DateClass(1, 1, 0001);
		DateClass end = new DateClass(12, 31, 9999);
		System.out.println(end.daysApart(start));

		// Task 27
		DateClass[] calendarNov = new DateClass[30];
		for (int i = 1; i <= 30; i++)
			calendarNov[i - 1] = new DateClass(11, i, 2018);
		String[] eventsNov = new String[30];
		for (int j = 0; j < 30; j++) {
			String day = calendarNov[j].dayOfTheWeek();
			if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday")
				eventsNov[j] = "Study for APCS";
			else if (day == "Saturday" || day == "Sunday")
				eventsNov[j] = "R&R";
		}
		for (int k = 0; k < 30; k++)
			System.out.println(eventsNov[k]);

	}

}
