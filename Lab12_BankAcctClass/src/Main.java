
public class Main {

	public static void main(String[] args) {
		// Task 1
		BankAccount myAcct = new BankAccount();
		BankAccount mrKimAcct = new BankAccount();
		BankAccount kevinAcct = new BankAccount();

		// Task 2
		Money depositAmt = new Money(0, 0);
		while (depositAmt.dollars <= 100) {
			depositAmt.dollars++;
			myAcct.deposit(depositAmt);
			depositAmt.dollars++;
			mrKimAcct.deposit(depositAmt);
			depositAmt.dollars++;
			kevinAcct.deposit(depositAmt);
		}

		// Task 3
		Money withdraw = new Money(20, 0);
		myAcct.withdraw(withdraw);
		Money deposit = new Money(10, 0);
		mrKimAcct.deposit(deposit);
		kevinAcct.deposit(deposit);

		// Task 4
		BankAccount[] bankAccts = new BankAccount[26];
		Money dep = new Money(100, 0);
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (int j = 0; j < 26; j++) {
			Money initialAmt = new Money(10, 0);
			bankAccts[j] = new BankAccount("Jane", "Smith", letters[j], initialAmt, "Bank of America");

			if (j == 22)
				bankAccts[j].deposit(dep);
		}
		for (int k = 0; k < 26; k++) {
			System.out.println(bankAccts[k].toStr());
		}

	}

}
