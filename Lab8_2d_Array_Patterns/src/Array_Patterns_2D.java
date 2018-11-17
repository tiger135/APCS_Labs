public class Array_Patterns_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] i = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		double[][] d = { { 1.1, 2.1, 3.1 }, { 4.1, 5.1 }, { 6.1, 7.1, 8.1 } };
		String[][] s = { { "1a", "2a", "3a" }, { "4a", "5a" }, { "6a", "7a", "8a" } };
		System.out.println(pp2dInt(i));
		System.out.println(pp2dDouble(d));
		System.out.println(pp2dString(s));
		int[][] e = new int[10][10];
		System.out.println(pp2dInt(tenXten(e)));
		int[][] q = new int[10][10];
		System.out.println(pp2dString(dashtenXten(q)));
		int[][] m = new int[10][10];
		System.out.println(pp2dInt(tenXtenBin(m)));
		String[][] n = new String[5][5];
		System.out.println(pp2dString(Pyramid_char(n)));

	}

	// *******
	// Task 1
	// *******

	public static String pp2dInt(int[][] a) {
		String returnVal = "{";
		int j;
		for (int i = 0; i < a.length - 1; i++) {
			returnVal += "{";
			for (j = 0; j < a[i].length - 1; j++) {
				returnVal += a[i][j] + ",";
			}
			returnVal += a[i][a[i].length - 1] + "},\\n";
		}
		returnVal += "{";
		for (int k = 0; k < a[a.length - 1].length - 1; k++) {
			returnVal += a[a.length - 1][k] + ",";
		}
		returnVal += a[a.length - 1][a[a.length - 1].length - 1] + "}}";
		return returnVal;
	}

	// *******
	// Task 2
	// *******

	public static String pp2dDouble(double[][] a) {
		String returnVal = "{";
		int j;
		for (int i = 0; i < a.length - 1; i++) {
			returnVal += "{";
			for (j = 0; j < a[i].length - 1; j++) {
				returnVal += a[i][j] + ",";
			}
			returnVal += a[i][a[i].length - 1] + "},\\n";
		}
		returnVal += "{";
		for (int k = 0; k < a[a.length - 1].length - 1; k++) {
			returnVal += a[a.length - 1][k] + ",";
		}
		returnVal += a[a.length - 1][a[a.length - 1].length - 1] + "}}";
		return returnVal;
	}

	// *******
	// Task 3
	// *******

	public static String pp2dString(String[][] a) {
		String returnVal = "{";
		int j;
		for (int i = 0; i < a.length - 1; i++) {
			returnVal += "{";
			for (j = 0; j < a[i].length - 1; j++) {
				returnVal += a[i][j] + ",";
			}
			returnVal += a[i][a[i].length - 1] + "},\\n";
		}
		returnVal += "{";
		for (int k = 0; k < a[a.length - 1].length - 1; k++) {
			returnVal += a[a.length - 1][k] + ",";
		}
		returnVal += a[a.length - 1][a[a.length - 1].length - 1] + "}}";
		return returnVal;
	}

	// *******
	// Task 4
	// *******

	public static int[][] tenXten(int[][] a) {
		for (int r = 0; r < 10; r++) {
			for (int t = 0; t < 10; t++) {
				a[r][t] = 10 * r + t;

			}
		}
		return a;
	}

	// *******
	// Task 5
	// *******

	public static String[][] dashtenXten(int[][] a) {
		String[][] returnVal = new String[10][10];
		for (int y = 0; y < 10; y++) {
			for (int c = 0; c < 10; c++) {
				returnVal[y][c] = String.valueOf(y) + "-" + String.valueOf(c);
			}
		}
		return returnVal;
	}

	// *******
	// Task 6
	// *******

	public static int[][] tenXtenBin(int[][] a) {
		int val;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0 && j % 2 == 0)
					val = 1;
				else if (i % 2 == 1 && j % 2 == 1)
					val = 1;
				else
					val = 0;
				a[i][j] = val;
			}
		}
		return a;
	}

	// *******
	// Task 7
	// *******

	public static String Letter(int a) {
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		return alphabet[a];
	}

	public static String[][] Pyramid_char(String[][] a) {
		int index = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = Letter(index);
				index++;
			}
		}
		return a;
	}

}
