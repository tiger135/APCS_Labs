
public class Deck {
	int numCards;

	// Getters
	public int getnumCards() {
		return numCards;
	}

	// Setters
	public void setNumCards(int numCardsVal) {
		if (numCardsVal < 0 || numCardsVal > 52)
			System.out.println("Can't have a negative number of cards.");
		else
			numCards = numCardsVal;
	}

	// Constructors
	public Deck() {

	}

	public Deck(int numCards) {
		setNumCards(numCards);
	}

}
