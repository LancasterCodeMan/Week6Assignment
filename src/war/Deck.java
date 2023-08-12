package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
		List<Card> cards = new ArrayList<Card>(); // create empty list to hold our deck of cards
		
		public Deck () { //Create constructor to build our deck of cards
			String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Arrays to represent our ranks and suits of the cards
			String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			
			
			for (String suit : suits) { //nested for loop to create each card in the deck by combining rank and suit and using counter to give them a value
				int count = 2;
				for (String rank : ranks) {
					cards.add(new Card(rank, suit, count));	
					count++;			
				}
			}
		}
		public void describe() { //describe method to print out our deck using card method from Card class.
			for(Card card : this.cards) { //use loop to go through our deck and then card describe method to print to console
				card.describe();
			}
		}		
		public void shuffle() { //use the pre-built shuffle method from collections
			Collections.shuffle(cards);
		}		
		public Card drawCard() { //this "draws a card" by removing the top element (or top card) from the list
			return cards.remove(0);			
		}			
		// getters and setters
		public List<Card> getCards() {
			return cards;
		}
		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
}
