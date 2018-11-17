
public class StudentRecord {
	String name;
	int IDNum;
	int DOB;
	double GPAunweighted;
	double GPAweighted;

	// Getters
	public String getName() {
		return name;
	}

	public int getIDNum() {
		return IDNum;
	}

	// Setters

	public void setIDNum(int DOBval) {
		if (DOBval <= 0)
			System.out.println("Can't have a negative date of birth.");
	}

	public void setName(String nameVal) {
		name = nameVal;
	}

	// Constructors
	public StudentRecord() {

	}

	public StudentRecord(String name, int IDNum) {
		setIDNum(IDNum);
		setName(name);
	}

}
