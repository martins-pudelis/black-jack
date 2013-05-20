/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;
import java.util.Random;

/**
 *
 * @author Martins
 */
public class Deck {
    /**
     * 
     */
    private String[] Cards;
    
    /**
     * 
     */
    private int Position = 0;

    /**
     * 
     */
    public Deck() {
        init();
        shuffleDeck();
    }

    /**
     * Inicialize deck
     */
    private void init() {
        Cards = new String[]{
            "2_club", "2_diamond", "2_heart", "2_spade", 
            "3_club", "3_diamond", "3_heart", "3_spade",
            "4_club", "4_diamond", "4_heart", "4_spade",
            "5_club", "5_diamond", "5_heart", "5_spade",
            "6_club", "6_diamond", "6_heart", "6_spade",
            "7_club", "7_diamond", "7_heart", "7_spade",
            "8_club", "8_diamond", "8_heart", "8_spade",
            "9_club", "9_diamond", "9_heart", "9_spade",
            "10_club", "10_diamond", "10_heart", "10_spade",
            "jack_club", "jack_diamond", "jack_heart", "jack_spade",
            "queen_club", "queen_diamond", "queen_heart", "queen_spade",
            "king_club", "king_diamond", "king_heart", "king_spade",
            "1_club", "1_diamond", "1_heart", "1_spade"
        };
    }

    /**
     * Shuffles array using Fisher-Yates algorythm
     */
    private void shuffleDeck() {
        Random r = new Random();
        int n = Cards.length;

        while (n > 1) {
            int k = r.nextInt(n);
            n--;
            swap(n, k);
        }
    }

    /**
     * Gets next card from cards deck
     * 
     * @return String with card
     */
    public String nextCard() {
        String t = Cards[Position];
        Position++;

        return t;
    }
    
    /**
     * Swaps array elements in places
     * 
     * @param i
     * @param j 
     */
    private void swap(int i, int j){
        String temp = Cards[i];
        Cards[i] = Cards[j];
        Cards[j] = temp;
    }
}
