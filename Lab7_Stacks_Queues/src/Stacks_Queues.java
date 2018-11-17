/* package whatever; // don't place package name! */

/* Name of the class has to be "Main" only if the class is public. */
class Stacks_Queues {
	public static void main(String[] args) throws java.lang.Exception {
		// Test Code: Paste this in main() to test your code.
		int[] myStack = createStack(101);
		for (int i = 10; i > 0; i--)
			push(myStack, i);
		System.out.println("You should print [10,9,8,7,6,5,4,3,2,1]");
		System.out.println(prettyPrintStack(myStack));
		System.out.println("This should print \n1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
		for (int i = 10; i > 0; i--) {
			System.out.println(pop(myStack));
		}

		// Task 1
		int[] a = createStack(101);
		for (int i = 9; i >= 3; i--)
			push(a, i);
		pop(a);
		pop(a);
		System.out.println("The value of the third pop is: " + pop(a));

		for (int b = 1; b <= 4; b++)
			push(a, b);

		for (int j = 0; j < 5; j++) {
			if (j == 4)
				System.out.println("The value of the fifth pop is " + pop(a));
			else
				pop(a);
		}
		System.out.println(prettyPrintStack(a));

		// Task 2
		int[] restroomList = createStack(101);
		for (int k = 1; k <= 4; k++)
			push(restroomList, k);
		System.out.println(prettyPrintStack(restroomList));
		System.out.println("A stack is not a good data structure for this type of situation "
				+ "because a restroom list is based on a FIFO basis (first in, first out), "
				+ "since whoever signs up first goes to the restroom first, while a stack"
				+ " operates on a FILO basis (first in, last out). For example, in the stack above, "
				+ "person 4 would exit the stack first, (go to the restroom first), while person 1 "
				+ "would exit last (go to the restroom last), which is contradictory to the real "
				+ "life situation. A better data structure to use is a queue.");

		// Task 3
		int[] c = createQueue(101);
		for (int i = 9; i >= 3; i--)
			enqueue(c, i);
		dequeue(c);
		dequeue(c);
		System.out.println("The value of the third pop is " + dequeue(c));

		for (int b = 1; b <= 4; b++)
			enqueue(c, b);

		for (int j = 0; j < 5; j++) {
			if (j == 4)
				System.out.println("The value of the fifth pop is " + dequeue(c));
			else
				dequeue(c);
		}
		System.out.println(prettyPrintQueue(c));

		// Task 4
		int[] parkingLot = createQueue(101);
		for (int k = 1; k <= 4; k++)
			enqueue(parkingLot, k);
		System.out.println(prettyPrintQueue(restroomList));
		System.out.println("A queue is not a good data structure for this type of situation "
				+ "because the parking lot is based on a FILO basis (first in, last out), "
				+ "since whoever gets the ticket first is parked in the back of the alley, while a queue"
				+ " operates on a FIFO basis (first in, first out). For example, in the queue above, "
				+ "person 1 would exit the queue first, leave the parking lot first, while person 4 "
				+ "would exit last (leave the parking lot last), which is contradictory to the real "
				+ "life situation. A better data structure to use is a stack." + "\n");

		// Task 5
		System.out.println("One real life example of a stack is a stack of dinner plates; "
				+ "whichever one is added first is taken last" + "\n");
		int[] dinnerPlates = createStack(101);
		for (int l = 1; l <= 5; l++)
			push(dinnerPlates, l);
		System.out.println(prettyPrintStack(dinnerPlates));
		System.out.println("In the example above, dinner plates numbered 1-5 are pushed"
				+ " onto the stack. Therefore, plate 5 will be taken first and plate 1 will be taken last" + "\n");

		// Task 6
		System.out.println("One real life example of a queue in real life is a line of people in "
				+ "a ticket window. The first person to come in the line will receive a ticket first, showing "
				+ " the FIFO (first in, first out) receiving method of a queue." + "\n");
		int[] ticketQueue = createQueue(101);
		for (int p = 1; p <= 5; p++)
			// Add people to the ticket line
			enqueue(ticketQueue, p);
		System.out.println("In the example above, person 1 comes into the line first and would"
				+ "therefore receive a ticket first, while person 5 would receive a ticket last "
				+ "because they entered last." + "\n");

		System.out.println("If you add too many elements into the stack, you should print out an error.");
		for (int i = 0; i < 110; i++)
			push(myStack, i);
	}

	// ***************
	// Stack Functions
	// ***************

	// Creation Functions

	public static int[] createStack(int size) {
		int[] st = new int[size];
		return st;
	}

	// Create push and pop functions

	public static void push(int[] stack, int data) {
		// first element of list is number of elements in stack
		// if there are more elements than the ones dictated by the first
		// element in stack[]
		if (stack[0] == stack.length - 1)
			System.out.println("Index out of bounds error");
		stack[0]++;
		stack[stack[0]] = data;

	}

	public static int pop(int[] stack) {
		int returnVal = stack[stack[0]];
		// stack[stack[0]] = 0;
		stack[0]--;
		return returnVal;
	}

	// Accessor Functions

	public static String prettyPrintStack(int[] stack) {
		String returnVal = "[";
		for (int i = 0; i < stack[0] - 1; i++) {
			returnVal += stack[i + 1] + ",";
		}
		returnVal += stack[stack[0]] + "]";
		return returnVal;
	}

	public static String dumpStack(int[] stack) {
		String returnVal = "[";
		for (int i = 0; i < stack.length - 1; i++) {
			returnVal += stack[i] + ",";
		}
		returnVal += stack[stack.length - 1] + "]";
		return returnVal;
	}

	// ****************
	// Queue Functions
	// ****************

	// Creation Functions
	public static int[] createQueue(int size) {
		int[] qu = new int[size];
		return qu;
	}

	// Create enqueue and dequeue functions
	public static void enqueue(int[] queue, int data) {
		if (queue[0] == queue.length - 1)
			System.out.println("Index out of bounds error");
		queue[0]++;
		queue[queue[0]] = data;
	}

	public static int dequeue(int[] queue) {
		int returnVal = queue[1];
		for (int q = 1; q <= queue[0]; q++) {
			queue[q] = queue[q + 1];
		}
		queue[0]--;
		return returnVal;
	}

	// Accessor Functions

	public static String prettyPrintQueue(int[] queue) {
		String returnVal = "[";
		for (int i = 0; i < queue[0] - 1; i++) {
			returnVal += queue[i + 1] + ",";
		}
		returnVal += queue[queue[0]] + "]";
		return returnVal;
	}

	public static String dumpQueue(int[] queue) {
		String returnVal = "{";
		for (int i = 0; i < queue.length - 1; i++) {
			returnVal += queue[i] + ",";
		}
		returnVal += queue[queue.length - 1] + "}";
		return returnVal;
	}

}
