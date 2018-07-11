/*
 * Clair Inniger
 * PP 8.7 (page 402)
 * 07/10/2010
 */
package cardgame;

public class CardGame {

    public static void main(String[] args) {
        
        DeckOfCards cardDeck = new DeckOfCards();
        cardDeck.shuffle();
        
        for (int i = 0; i <= cardDeck.deck.length - 1; i++)
            System.out.println("Dealing " + cardDeck.deck[i].getRank() + " " + cardDeck.deck[i].getSuit());
 
    }
    
}
