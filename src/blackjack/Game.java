/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Martins
 */
public class Game {
    /**
     * Human player object
     */
    private Player Human;
    
    /**
     * Computer player object
     */
    private Player Computer;
    
    /**
     * Shuffled deck for this game
     */
    private Deck DeckObject;
    
    /**
     * Maximum allowed score
     */
    private final int MaxScore = 21;
    
    /**
     * Constructor sets up players, deck and takes first cards
     */
    public Game() {
        DeckObject = new Deck();
        Human = new Player("human");
        Computer = new Player("computer");
        
        Card HumanFirstCard = new Card(DeckObject.nextCard());
        Card ComputerFirstCard = new Card(DeckObject.nextCard());
        
        Human.addCard(HumanFirstCard);
        Computer.addCard(ComputerFirstCard);
    }
    
    /**
     * Gets human player object
     * 
     * @return 
     */
    public Player getHuman() {
        return Human;
    }
    
    /**
     * Gets computer player object
     * 
     * @return 
     */
    public Player getComputer() {
        return Computer;
    }
    
    /**
     * Takes card and to other players cards
     * 
     * @param p object of player
     * @return card object
     */
    public Card takeCard(Player p) {
        Card card = new Card(DeckObject.nextCard());
        p.addCard(card);
        
        return card;
    }
    
    /**
     * Getter for the games maximum score
     * 
     * @return 
     */
    public int getMaxScore() {
        return MaxScore;
    }
}
