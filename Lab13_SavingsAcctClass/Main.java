
public class Main {

	public static void main(String[] args) {
		BankAccount myBankAcc = new BankAccount("Vishakh","Arora","F",new Money(100,0),"Bank of America");
		SavingsAccount mySavingsAcc = new SavingsAccount("Vishakh","Arora","F",new Money(100,0),"Bank of America",0.02);
		System.out.println(myBankAcc.toStr());
		System.out.println(mySavingsAcc.toStr());
		
		Money startBalance = mySavingsAcc.getBalance();
		System.out.println("Starting Balance: " + startBalance.toStr());
		for (int i=0;i<12;i++) mySavingsAcc.accrueMonthlyInterest();
		Money interest = mySavingsAcc.getBalance();
		System.out.println("Ending Balance: " + mySavingsAcc.getBalance().toStr());
		interest.sub(startBalance);
		System.out.println("Interest Accrued: " + interest.toStr());
		
		BankAccount retirementNoInterest = new BankAccount();
		SavingsAccount retirementSavings = new SavingsAccount("Bank of America",0.02);
		System.out.println("Month number\tBankAccount balance\tSavingsAccount balance");
		for (int month=1;month<12*30;month++) {
			retirementNoInterest.deposit(new Money(100,0));
			retirementSavings.accrueMonthlyInterest();
			retirementSavings.deposit(new Money(100,0));
			System.out.println(month+"\t"+retirementNoInterest.getBalance().toStr()+"\t"+retirementSavings.getBalance().toStr());
		}
		
		
		

	}

}
