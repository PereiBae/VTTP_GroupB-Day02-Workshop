package myapp;

public class profDeck {
    
    public static final String[] SUIT = {
        "Diamond","Spade","Hearts","Clubs"
    };
    public static final String[] NAME = {
        "Ace","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"
    };
    public static final int[] VALUES ={
        1,2,3,4,5,6,7,8,9,10,10,10,10
    };
    protected profCard[] cards;

    public profDeck(){
        int idx = 0;
        cards = new profCard[52];

        for (int s =0; s <SUIT.length; s++){
            String suit = SUIT[s];

            for (int n=0; n< NAME.length; n++){
                String name = NAME[n];
                int value = VALUES[n];

                profCard card = new profCard(suit, name, value);
                cards[idx] = card;
                idx++;
            }
        }


    }

    public profCard get(){
        return this.get();
    }

    public profCard get(int pos){
        return this.get(pos);
    }

    @Override
    public String toString(){
        return "number of cards: %d".formatted(cards.length);
    }

}
