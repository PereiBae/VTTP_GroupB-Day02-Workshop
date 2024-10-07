package myapp;

import java.util.Random;


public class Deck {
    
    private Card[] cards;
    private int currentCard;

    // Constructor to initialise the Deck
    public Deck(){
        cards = new Card[52];
        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};


        int index = 0;
        for( String suite: suites){
            for (String rank: ranks){
                cards[index++] = new Card(rank,suite);
            }
        }
    }

    // Shuffle method that ensures equal probability of each card ending up in any position in the array
    public void shuffle(){
        Random rand = new Random();

        for (int i = 0; i < cards.length; i++ ){
            int randomIndex = rand.nextInt(cards.length); // Generate a random index from 0 to 51
            Card temp = cards[i]; // Store the current card in a TEMPORARY variable
            cards[i] = cards[randomIndex]; // card at random Index goes to the position of where the current card is
            cards[randomIndex] = temp; // Put the original card at the position of the aforementioned random Index
        }

        currentCard = 0;

    }

    public Card drawCard(){
        if (currentCard < cards.length){ // means when currentCard = 51, there will be no more cards left to draw
            return cards[currentCard++]; //Return the current card and increment the index. so you would draw cards[0] then cards[1] if u decide to draw again
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        return currentCard >= cards.length;
    }

}
