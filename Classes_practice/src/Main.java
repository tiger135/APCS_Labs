
public class Main {

	public static void main(String[] args) {
		Money m = new Money(), n = new Money();
		m.setDollars(5);// 5.10
		m.setCents(10);
		n.setDollars(6);// 6.11
		n.setCents(11);
		m.add(n);// 6.11+5.10 updates m's value
		// m += n;
		System.out.println("$" + m.getDollars() + "." + m.getCents());
		Money myMoney = new Money();
		Money yourMoney = new Money();
		Money cliffordMoney = new Money();
		CreditCardAccount myAccount = new CreditCardAccount();
		Fraction frac = new Fraction();
		Double decimal = new Double();
		Point myCoordinate = new Point();
		StudentRecord myStudentRecord = new StudentRecord();
		Date myDate = new Date();
		Circle myCircle = new Circle();
		Point circleCenter = new Point();
		Card myCard = new Card();
		Deck myDeck = new Deck();
		LineSegment myLine = new LineSegment();
		Point point1 = new Point();
		Point point2 = new Point();

		CreditCardAccount yourAccount = new CreditCardAccount();
		Fraction fract = new Fraction();
		Double dec = new Double();
		Point yourCoordinate = new Point();
		StudentRecord yourStudentRecord = new StudentRecord();
		Date yourDate = new Date();
		Circle yourCircle = new Circle();
		Point circleCenter2 = new Point();
		Card yourCard = new Card();
		Deck yourDeck = new Deck();
		LineSegment yourLine = new LineSegment();
		Point point3 = new Point();
		Point point4 = new Point();

		myMoney.dollars = 10000;
		yourMoney.dollars = 5;
		cliffordMoney.dollars = 2;
		m.dollars = 5;
		m.cents = 6;
		m.currency = "Canadian dollars";
		System.out.println("I have " + m.dollars + " " + m.currency + ".");

		ComplexNumber c = new ComplexNumber();
		c.a = 5;
		c.b = 3;
		System.out.println(c.a + " + " + c.b + "i");

		myAccount.accountNumber = 1234;
		myAccount.amtDollars = 45;
		myAccount.bankName = "Wells Fargo";
		myAccount.CVC = 123;
		myAccount.expDate = 111111;
		myAccount.firstName = "Vishakh";
		myAccount.lastName = "Arora";
		myAccount.minDollars = 68;
		myAccount.type = "visa";

		yourAccount.accountNumber = 12345;
		yourAccount.amtDollars = 451;
		yourAccount.bankName = "Bank of America";
		yourAccount.CVC = 133;
		yourAccount.expDate = 111211;
		yourAccount.firstName = "Bob";
		yourAccount.lastName = "Joe";
		yourAccount.minDollars = 684;
		yourAccount.type = "ms";

		myCircle.centerX = 5.0;
		myCircle.centerY = 2.0;
		circleCenter.x = myCircle.centerX;
		circleCenter.y = myCircle.centerY;
		myCircle.radius = 4;

		yourCircle.centerX = 4.0;
		yourCircle.centerY = 1.0;
		circleCenter2.x = myCircle.centerX;
		circleCenter2.y = myCircle.centerY;
		yourCircle.radius = 6;

		frac.numerator = 4;
		frac.denominator = 5;

		fract.numerator = 2;
		fract.denominator = 6;

		decimal.exp = 2;
		decimal.mantissa = 4;

		dec.exp = 5;
		dec.mantissa = 1;

		myCoordinate.x = 1.0;
		myCoordinate.y = 2.0;

		yourCoordinate.x = 5.0;
		yourCoordinate.y = 2.0;

		myStudentRecord.DOB = 010102;
		myStudentRecord.GPAunweighted = 4.0;
		myStudentRecord.GPAweighted = 4.31;
		myStudentRecord.IDNum = 123456;

		yourStudentRecord.DOB = 010402;
		yourStudentRecord.GPAunweighted = 3.0;
		yourStudentRecord.GPAweighted = 3.31;
		yourStudentRecord.IDNum = 123426;

		myDate.day = 3;
		myDate.month = 5;
		myDate.year = 2018;

		yourDate.day = 12;
		yourDate.month = 4;
		yourDate.year = 12;

		myCard.face = "King";
		myCard.suit = "Clubs";

		yourCard.face = "Queen";
		yourCard.suit = "Spades";

		myDeck.numCards = 52;

		yourDeck.numCards = 52;

		point1.x = 2.0;
		point1.y = 3.0;
		myLine.x1 = point1.x;
		myLine.y1 = point1.y;
		point2.x = 4.0;
		point2.y = 5.0;
		myLine.x2 = point2.x;
		myLine.y2 = point2.y;

		point3.x = 2.0;
		point3.y = 3.0;
		yourLine.x1 = point3.x;
		yourLine.y1 = point3.y;
		point4.x = 4.0;
		point4.y = 5.0;
		yourLine.x2 = point4.x;
		yourLine.y2 = point4.y;

		lab10TestCode();

	}

	public static void lab10TestCode() {
		// Task 1
		Money a = new Money();
		a.dollars = 5;
		a.cents = 25;

		Money d = a.changeFrom20();
		System.out.println(d.toStr());
		Money b = new Money();
		b.dollars = 51;
		b.cents = 99;
		Money c = new Money();
		c.dollars = 0;
		c.cents = 1;
		// Task 2
		Money sum = new Money();
		sum.add(a);
		sum.add(b);
		sum.add(c);

		// Task 3/4
		Money money9 = new Money();
		for (int i = 1; i <= 9; i++) {
			Money money1 = new Money();
			money1.dollars = i * 10;
			money1.cents = i * 10 + i;
			money9.add(money1);
		}
		System.out.println(money9.toStr());
		// Task 5
		Money piggyBank = new Money();
		Money addFactor = new Money();
		addFactor.cents = 1;
		piggyBank.dollars = 0;
		piggyBank.cents = 99;
		piggyBank.mult(2);
		System.out.println(piggyBank.toStr());
		for (int i = 1; i < 30; i++) {
			piggyBank.add(addFactor);
			addFactor.mult(2);
			System.out.println(addFactor.toStr());
		}

		System.out.println("After 30 days, the piggy bank will have " + piggyBank.toStr() + " inside.");

	}

}
