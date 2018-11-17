public class Binary_Lab {

	public static void main(String[] args) throws java.lang.Exception {
		System.out.println(prettyPrint(createBinInt(10101010)));
		System.out.println(prettyPrint(createBinString("10101010")));
		System.out.println(intValue(createBinString("11010101")));
		System.out.println(prettyPrint(doubleValue(createBinString("11010101"))));
		System.out.println(prettyPrint(intToBinary(-43)));
	}

	public static String prettyPrint(int[] a) {
		if (a == null) {
			return null;
		}
		String returnVal = "{" + a[0];
		for (int i = 1; i < a.length; i++) {
			returnVal += "," + a[i];
		}
		returnVal += "}";
		return returnVal;
	}

	// Constructor Functions

	// The argument will be an integer in binary notation, so its digits will be
	// only 0's and 1's. Return an array that separates each digit.
	public static int[] createBinInt(int binaryNumber) {
		int len = String.valueOf(binaryNumber).length();
		int[] returnVal = new int[len];
		// same as conversion to binary, except use base 10
		for (int i = 0; i < 8; i++) {
			returnVal[len - 1 - i] = binaryNumber % 10;
			binaryNumber /= 10;
			// returnVal[i] %= 10;
		}
		return returnVal;
	}

	// The argument will be a String in binary notation, so its characters will
	// be only 0's and 1's, no spaces. You may assume the String will be 8
	// characters long. Return an array that separates each digit.

	public static int[] createBinString(String binaryNumber) {
		int len = binaryNumber.length();
		int[] returnVal = new int[len];
		for (int i = 0; i < len; i++) {
			returnVal[i] = Integer.parseInt(binaryNumber.substring(i, i + 1)); // %
		}
		return returnVal;
	}

	// Accessor Functions

	// Given a Binary number, evaluate its integer value using 2's complement.
	public static int intValue(int[] b) {
		double returnVal = 0;
		// 2's complement
		if (b[0] == 1) {
			returnVal = -1 * Math.pow(2, b.length - 1);
		}
		for (int i = 0; i < b.length; i++) {
			// if number is in 2's complement
			if (b[0] == 1) {
				i++;
			}
			// Keep adding powers of 2 to number to get final value
			if (b[i] == 1) {
				returnVal += Math.pow(2, b.length - i - 1);
			}

		}
		return (int) returnVal;
	}

	//// Given a Binary number, evaluate its double values using 2's complement.
	//// Return an int[] containing its {exponent , mantissa}.
	public static int[] doubleValue(int[] b) {
		int[] exp = new int[4];
		int[] mant = new int[4];
		int[] exp_mant = new int[2];
		// split binary into exp and mantissa
		for (int i = 0; i < b.length; i++) {
			if (i < 4)
				exp[i] = b[i];
			else
				mant[i - 4] = b[i];
		}
		int exponent = intValue(exp);
		int mantissa = intValue(mant);
		exp_mant[0] = exponent;
		exp_mant[1] = mantissa;
		return (exp_mant);
	}

	// Conversion Functions

	// Converts an integer to a binary number. Ex, intToBinary(7) =>
	// {0,0,0,0,0,1,1,1}.
	public static int[] intToBinary(int a) {
		int[] values = { 128, 64, 32, 16, 8, 4, 2, 1 };
		int[] returnVal = new int[8];
		if (a < 0)
			values[0] = -128;

		for (int i = 0; i < 8; i++) {
			// for any base, mod by base to get value then divide by base
			if (a > 0) {
				returnVal[7 - i] = a % 2;
				a /= 2;
			}
			// If a is negative, add 64,32,etc. to approach 0 - same as
			// subtracting
			// values if positive to apporach 0
			if (a < 0) {
				returnVal[0] = 1;
				int x = -128;
				for (int c = 1; c < 8; c++) {
					if (((x + values[c]) <= a)) {
						x += values[c];
						returnVal[c] = 1;
					}
				}
			}
		}
		return returnVal;
	}

}
