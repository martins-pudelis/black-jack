/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.ArrayList;

/**
 *
 * @author Martins
 */
public class Player {
    /**
     * Array list with players cards
     */
    private ArrayList<Card> PlayerCards = new ArrayList<Card>(); 
    
    /**
     * Type of the player
     */
    private String PlayerType;
    
    /**
     * Constructor for player class
     * 
     * @param type 
     */
    public Player(String type) {
        PlayerType = type;
    }
    
    /**
     * Adds card to the list
     * 
     * @param c with card object
     */
    public void addCard(Card c) {
        PlayerCards.add(c);
    }
    
    
    /**
     * Gets player score from cards
     * 
     * @return 
     */
    public int getResult() {
        int result = 0;
        int cardsTaken = PlayerCards.size();
                
        if (cardsTaken > 0) {
            for (int i = 0; i < cardsTaken; i++) {
                result += PlayerCards.get(i).getValue();
            }
        }
        
        return result;
    }
    
    /**
     * Getter for cards
     * 
     * @return 
     */
    public ArrayList<Card> getPlayerCards() {
        return PlayerCards;
    }
    
    /**
     * Function to check does player is human
     * 
     * @return 
     */
    public boolean isHuman() {
        return PlayerType.equals("human");
    }
    
    /**
     * Function to check does player is computer
     * 
     * @return 
     */
    public boolean isComputer() {
        return PlayerType.equals("computer");
    }
}
