/*
 * Clair Inniger
 * PP 8.7 (page 402)
 * 07/10/2010
 */
package cardgame;

public class Card {

    private String rank;
    private String suit;

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

}
