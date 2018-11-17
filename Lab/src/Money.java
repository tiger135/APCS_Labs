public class Money {
	public static void main(String[] args) {
		System.out.println(prettyPrint(createMoney(0, 2)));
		System.out.println(isGreaterThan(createMoney(3, 189), createMoney(3, 176)));
		System.out.println(isEqual(createMoney(3, 101), createMoney(3, 101)));
		System.out.println(prettyPrint(add(createMoney(3, 99), createMoney(3, 102))));
		System.out.println(moneyToText(createMoney(998, 165)));
		System.out.println(prettyPrint(payWith20(createMoney(5, 12))));
		System.out.println(prettyPrint(payWith20(createMoney(3, 91))));

	}

	/*
	 * 
	 * 1. CONSTRUCTOR FUNCTION
	 * 
	 */

	public static int[] createMoney(int dollars, int cents) {
		int money[] = new int[2];
		if (cents > 99) {
			dollars += cents / 100;
		}
		money[1] = cents % 100;
		money[0] = dollars;
		return (money);
	} // end createMoney

	/*
	 * 
	 * 2. ACCESSOR FUNCTIONS
	 * 
	 */

	public static int dollars(int[] money) {
		return money[0];
	} // end dollars

	public static int cents(int[] money) {
		return money[1];
	} // end cents

	public static String prettyPrint(int[] money) {
		String cents = "" + cents(money);
		if (cents(money) < 10) {
			cents = "0" + String.valueOf(cents(money));
		}
		return ("$" + dollars(money) + "." + cents);
	} // end prettyPrint

	public static String moneyToText(int[] money) {
		String words[] = { "Zero", "", "One", "Ten", "Two", "Twenty", "Three", "Thirty", "Four", "Forty", "Five",
				"Fifty", "Six", "Sixty", "Seven", "Seventy", "Eight", "Eighty", "Nine", "Ninety", "Ten" };
		String amountInWords = "";
		String hundredsDollars = words[(dollars(money) / 100) * 2];
		if (hundredsDollars.length() != 0) {
			amountInWords += hundredsDollars + " hundred and ";
		}
		String tensonesDollars = words[(((dollars(money) / 10) % 10) * 2) + 1] + " " + words[(dollars(money) % 10) * 2];
		if (tensonesDollars.length() > 1) {
			amountInWords += tensonesDollars;
		}
		String tensonesCents = words[((cents(money) / 10) * 2) + 1] + " " + words[(cents(money) % 10) * 2];
		if (tensonesCents.length() > 1) {
			amountInWords += " dollars and " + tensonesCents + " cents.";
		}
		return (amountInWords);
	} // end moneyToText

	/*
	 * 
	 * 3. CHECKING FUNCTIONS
	 * 
	 */

	public static boolean isGreaterThan(int[] m1, int[] m2) {
		boolean returnVal = true;
		if (dollars(m1) > dollars(m2)) {
			returnVal = true;
		} else if (dollars(m1) == dollars(m2)) {
			if (cents(m1) > cents(m2)) {
				returnVal = true;
			} else {
				returnVal = false;
			}
		} else {
			returnVal = false;
		}
		return (returnVal);
	} // end isGreaterThan

	public static boolean isEqual(int[] m1, int[] m2) {
		if ((dollars(m1) == dollars(m2)) && (cents(m1) == cents(m2))) {
			return true;
		} else {
			return false;
		}
	} // end isEqual

	/*
	 * 
	 * 4. ADDING FUNCTIONS
	 * 
	 */

	public static int[] add(int[] m1, int[] m2) {
		int sum[] = createMoney(dollars(m1) + dollars(m2), cents(m1) + cents(m2));
		return (sum);
	} // end add

	public static void adder(int[] m1, int[] m2) {
		int sum[] = add(m1, m2);
		m1[0] = sum[0];
		m1[1] = sum[1];
	} // end adder

	/*
	 * 
	 * 5. CALCULATION FUNCTION
	 * 
	 */

	public static int[] payWith20(int[] owe) {
		int diff[] = createMoney(20 - (dollars(owe) + 1), 100 - cents(owe));
		return (diff);
	} // end payWith20

}