package war;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in); // initialize scanner
		Deck deck = new Deck(); // create deck of cards
		//deck.describe();
		
		Player player1 = new Player("Jim"); //create our player object and give them a name
		Player player2 = new Player("Bob"); //create our player object and give them a name
;
		System.out.println("-----------------------------"); //Formatting to introduce
		System.out.println("-----------------------------");
		System.out.println("LET'S PLAY WAR!!");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("Shuffling cards.....");
		System.out.println("-----------------------------");
		
		deck.shuffle(); //call our deck shuffling method to shuffle our deck before dealing
		//deck.describe();
		System.out.println("Dealer is dealing cards.....");
		for (int i = 1; i <= 52; i++) //deal the cards. Since there are only two players we can use a loop through even
			if(i % 2 == 0 ) {         //and odd numbers to deal the cards evenly.
				player1.hand.add(deck.drawCard());
			} else {
				player2.hand.add(deck.drawCard());
				}
//		System.out.println("-----------------------------");
//		System.out.println("-----------------------------"); //show card in each players hand to verify draw shuffled cards works
//		System.out.println(player1.name +"'s hand is:");     //commented out to make console cleaner during game play.
//		System.out.println("-----------------------------");
//		for (Card card : player1.hand) {
//			card.describe();
//		}
//		System.out.println("-----------------------------");	
//		System.out.println(player2.name +"'s hand is:");
//		System.out.println("-----------------------------");
//		for (Card card : player2.hand) {
//			card.describe();
//		}	
//		System.out.println("-----------------------------");
		
		//Show that dealing cards is done and verify that each player has equal number of cards in hand.
		//We will now use our getters to access the variables ie..getName, getScore etc..
		System.out.println(player1.getName() + " now has " + player1.getHand().size() + " cards in their hand");
		System.out.println(player2.getName() + " now has " + player2.getHand().size() + " cards in their hand");
		System.out.println("-----------------------------");
		
		//Game code 
		for (int i = 1; i <= 26; i++) { //loop through the 26 cards each player has in hand
			System.out.println("\n-----------------------------");
			Card card1 = player1.flip(); //each player flips their card to compare
			Card card2 = player2.flip();
			System.out.println(player1.getName() + " Played:"); //tells what card each player played.
			card1.describe();
			System.out.println(player2.getName() + " Played:");
			card2.describe();
			if(card1.getValue() > card2.getValue()) { //We need set if else statements for all outcomes and give score to appropriate player
				player1.incrementScore(); // if player 1 wins we increment their score by one.
				System.out.println("\n**************");
				System.out.println(player1.getName().toUpperCase() + " WINS THIS ROUND!");
				System.out.println("**************");
			} else if (card2.getValue() > card1.getValue()){ // if player 2 wins increment their score by one
				player2.incrementScore();
				System.out.println("**************");
				System.out.println(player2.getName().toUpperCase() + " WINS THIS ROUND!");
				System.out.println("**************");
			} else { // if the outcome is a draw each player goes to next card.
				System.out.println("**************");
				System.out.println("WAR!! draw next card!");
				System.out.println("**************");
			}
			player1.descibePlayerScore(); //print each players score after the round then loop through again.
			player2.descibePlayerScore();
			 //System.out.println("Press any key for next round...");
	         //scanner.nextLine(); //for more realistic game play you can use the scanner to hit a key between each round
			                          //or iteration of the loop. this requires user involvement to complete game.
		}// end for loop
		System.out.println("\n===========================");
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("\nFINAL SCORE!!!!");
		System.out.println(player1.getName() +"'s" + " final score is: " + player1.getScore()); // print players final game score
		System.out.println(player2.getName() +"'s" + " final score is: " + player2.getScore());
		System.out.println("\n===========================");
		if (player1.getScore() > player2.getScore()) { //if else statements to compare scores and announce winner or possibly a draw
			System.out.println(player1.getName().toUpperCase() + " IS THE WINNER!!!!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName().toUpperCase() + " IS THE WINNER!!!!");
		} else {
			System.out.println("WE HAVE A DRAW!!! PLAY ANOTHER ROUND!");
		}	
		//scanner.close(); // close scanner
	}// end main method
	
}// end class
