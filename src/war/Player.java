package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	 List<Card> hand = new ArrayList<Card>(); //create a list to hold our hand of dealt cards
	 int score;
	 String name;
	 
	public Player(){} // different constructors to create a player object in the main method
	
	public Player(String name) {
		this.name = name;
	}	 
	public Player(List<Card> hand, int score, String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
	}
	
	public void describe() { //use for loop to go through our hand of dealt cards and can print them using describe method
		for (Card hand : this.hand) {
			hand.describe();	
		}
	}
	public void descibePlayerScore() { //created to have different method to show player name and score
		System.out.println(this.name + "'s"  + " score is now: " + this.score);		
	
	}	
	public Card flip() { //during game play this removes the top card or first element of our hand list to play
		return hand.remove(0);
	}
//	public Card draw(List<Card> Deck) { //draw top card of deck 
//		Deck deck = new Deck();	
//		Card newCard = deck.drawCard();
//		return newCard;		
//	}
	public void incrementScore() { //adds one to players score
		this.score++;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
	
	
	

}
