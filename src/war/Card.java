package war;

public class Card {
	 String suits; //create our card properties
	 String ranks; 
	 int value; 

	
	public Card(String suits, String ranks, int value) { //create constructor for a card
		this.suits = suits;
		this.ranks = ranks;
		this.value = value;
	}	
	public void describe() { // describe method to print out our card with it's properties
		System.out.println(this.suits + " of " + this.ranks + ": " + value);
	}
	//getters and setters
	public String getSuits() {
		return suits;
	}
	public void setSuits(String suits) {
		this.suits = suits;
	}
	public String getRanks() {
		return ranks;
	}
	public void setRanks(String ranks) {
		this.ranks = ranks;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}


		
}
