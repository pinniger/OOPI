/*
 * Clair Inniger
 * PP 8.7 (page 402)
 * 07/10/2010
 */
package cardgame;

public class DeckOfCards {

    Card[] deck;
    int numOfCards = 52;
    private static final String[] Suit = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private static final String[] Rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public DeckOfCards() {
        deck = new Card[numOfCards];
        populateCards();
    }

    private void populateCards() {
        int k = 0;
        for (int i = 0; i <= Suit.length - 1; i++) 
            for (int j = 0; j <= Rank.length - 1; j++) {
                this.deck[k++] = new Card(Rank[j], Suit[i]);
            }
        
    }

    public void shuffle() {
        int card2, card1, i;
        for (i = 0; i < 100; i++) {
            card2 = (int) (numOfCards * Math.random()); 
            card1 = (int) (numOfCards * Math.random());  

            Card temp = deck[card2];
            deck[card2] = deck[card1];
            deck[card1] = temp;
        }
    }
}
