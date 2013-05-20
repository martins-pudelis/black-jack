/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Player {
    //private Card[] PlayerCards;
    private ArrayList<Card> PlayerCards = new ArrayList<Card>(); 
    private String PlayerType;
    
    public Player(String type) {
        PlayerType = type;
    }
    
    public void addCard(Card c) {
        PlayerCards.add(c);
    }
    
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
    
    public ArrayList<Card> getPlayerCards() {
        return PlayerCards;
    }
    
    public boolean isHuman() {
        return PlayerType.equals("human");
    }
    
    public boolean isComputer() {
        return PlayerType.equals("computer");
    }
}
