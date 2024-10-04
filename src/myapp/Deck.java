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

    public void shuffle(){
        Random rand = new Random();

        for (int i = 0; i < cards.length; i++ ){
            int randomIndex = rand.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }

        currentCard = 0;

    }

    public Card drawCard(){
        if (currentCard < cards.length){
            return cards[currentCard++];
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        return currentCard >= cards.length;
    }

}
