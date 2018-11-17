
public class Card {
	String face;
	String suit;

	// Getters
	public String getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}

	// Setters
	public void setFace(String faceVal) {
		face = faceVal;
	}

	public void setSuit(String suitVal) {
		suit = suitVal;
	}

	// Constructors
	public Card() {

	}

	public Card(String face, String suit) {
		setFace(face);
		setSuit(suit);
	}

}
