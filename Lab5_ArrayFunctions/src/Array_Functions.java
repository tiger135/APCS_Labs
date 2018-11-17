
public class Array_Functions {

	public static void main(String[] args) {
		System.out.println("min(3,4)\t3\t" + min(3, 4));
		System.out.println("min(4,3)\t3\t" + min(4, 3));
		int[] a = { 1, 5, 3, 7, 2, 65, 8 };
		int[] b = { 9, 6, 34, 23, 8, 6, 5, 3, 2 };
		System.out.println("min(a)\t\t1\t" + min(a));
		System.out.println("min(b)\t\t2\t" + min(b));
		System.out.println("add(a,b)\t{10,11,37,30,10,71,13,3,2}\t" + prettyPrint(add(a, b)));
		System.out.println("add(a,b)\t{10,11,37,30,10,71,13,3,2}\t" + prettyPrint(add(a, b)));
		int[] c = a;
		// c[0] = 5;
		System.out.println("copy(a)\t\t1\t" + a[0]);
		System.out.println("resize(a,3)\t{1,5,3}\t" + prettyPrint(resize(a, 3)));
		System.out.println("resize(a,3)\t7\t" + a.length);
		System.out.println("resize(a,9)\t{1,5,3,7,2,65,8,0,0}\t" + prettyPrint(resize(a, 9)));
		System.out.println("resize(a,9)\t7\t" + a.length);
		int[] d = { 1, 2, 3, 4 };
		int[] e = { 5, 6, 7 };

		System.out.println("append(d,e)\t{1,2,3,4,5,6,7}\t" + prettyPrint(append(d, e)));
		System.out.println("append(d,e)\t4\t" + d.length);
		System.out.println("append(d,e)\t3\t" + e.length);
		System.out.println("append(null,e)\t{5,6,7}\t\t" + prettyPrint(append(null, e)));
		System.out.println("append(d,null)\t{1,2,3,4}\t" + prettyPrint(append(d, null)));

		System.out.println("subArray(a,3,5)\t{7,2}\t" + prettyPrint(subArray(a, 3, 5)));
		System.out.println("subArray()\t7\t" + a.length);
		System.out.println("subArray(a,4,7)\t{2,65,8}\t" + prettyPrint(subArray(a, 4, 7)));
		System.out.println("subArray(a,3,3)\tnull\t" + prettyPrint(subArray(a, 3, 3)));
		System.out.println("subArray(a,5,3)\tnull\t" + prettyPrint(subArray(a, 5, 3)));

		makeSorted(a);
		System.out.println("makeSorted(a)\t{1,2,3,5,7,8,65}\t" + prettyPrint(a));
		System.out.println("sort(b)\t{2,3,5,6,6,8,9,23,34}\t" + prettyPrint(sort(b)));

		System.out.println("merge(a,d)\t{1,1,2,2,3,3,4,5,7,8,65}\t" + prettyPrint(merge(a, d)));

	}

	// Math Functions
	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static int min(int[] a) { // NULL CHECK
		if (a == null) {
			return 0;
		}
		int minVal = a[0];
		int currentVal = 0;
		for (int i = 0; i < a.length; i++) {
			currentVal = a[i];
			if (currentVal < minVal) {
				minVal = currentVal;
			}
		}
		return minVal;
	}

	public static int[] add(int[] a, int[] b) { // NULL CHECK
		int[] added_list;
		if (a.length > b.length) {
			added_list = new int[a.length];
			for (int i = 0; i < b.length; i++) {
				added_list[i] += a[i] + b[i];
				if (i > b.length) {
					added_list[i] += a[i];
				}
			}

		} else {
			added_list = new int[b.length];
			for (int i = 0; i < b.length; i++) {
				if (i >= a.length) {
					added_list[i] += b[i];
				} else
					added_list[i] += a[i] + b[i];

			}

		}
		return added_list;
	}

	// General Functions
	public static String prettyPrint(int[] a) { // NULL CHECK
		// print first value
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

	public static int[] copy(int[] a) { // NULL CHECK
		int[] returnVal = a;
		return returnVal;
	}

	public static int[] resize(int[] a, int newLength) {
		int[] resized_list;
		if (a.length >= newLength) {
			resized_list = new int[newLength];
			for (int i = 0; i < newLength; i++) {
				resized_list[i] = a[i];
			}

		} else {
			resized_list = new int[newLength];
			for (int i = 0; i < newLength; i++) {
				if (i >= a.length) {
					resized_list[i] = 0;
				} else
					resized_list[i] = a[i];

			}

		}
		return resized_list;
	}

	public static int[] append(int[] a, int[] b) {
		if (a == null || a.length == 0) {
			return copy(b);
		} else if (b == null || b.length == 0) {
			return copy(a);
		} else {
			int[] appended_list = new int[a.length + b.length];
			for (int i = 0; i < a.length; i++) {
				appended_list[i] = a[i];
			}
			for (int i = 0; i < b.length; i++) {
				appended_list[i + a.length] = b[i];
			}
			return appended_list;
		}

	}

	public static int[] subArray(int[] a, int firstIncluded, int firstExcluded) {
		if (a == null || firstExcluded <= firstIncluded || firstExcluded > a.length || firstIncluded < 0) {
			return null;
		} else {
			int[] subList = new int[firstExcluded - firstIncluded];
			for (int i = firstIncluded; i < firstExcluded; i++) {
				subList[i - firstIncluded] = a[i];
			}
			return subList;
		}

	}

	// Sorting Functions
	public static int[] sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int c = 0; c < n - i - 1; c++)
				if (a[c] > a[c + 1]) {
					// swap b and a[c]
					int b = a[c];
					a[c] = a[c + 1];
					a[c + 1] = b;
				}
		return a;
	}

	public static void makeSorted(int[] a) {
		a = sort(a);
	}

	public static int[] merge(int[] a, int[] b) {
		int[] mergedList = new int[a.length + b.length];
		int m = 0;
		int ia = 0;
		int ib = 0;
		while (ia < a.length) {
			while (ib < b.length && a[ia] > b[ib]) {
				mergedList[m++] = b[ib];
				ib++;
			}
			mergedList[m++] = a[ia];
			ia++;
		}
		while (ib < b.length) {
			mergedList[m++] = b[ib];
			ib++;
		}
		return mergedList;
	}

}
