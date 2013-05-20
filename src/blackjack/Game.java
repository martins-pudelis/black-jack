/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author root
 */
public class Game {
    private Player Human;
    private Player Computer;
    private Deck DeckObject;
    private final int MaxScore = 21;
    
    public Game() {
        DeckObject = new Deck();
        Human = new Player("human");
        Computer = new Player("computer");
        
        Card HumanFirstCard = new Card(DeckObject.nextCard());
        Card ComputerFirstCard = new Card(DeckObject.nextCard());
        
        Human.addCard(HumanFirstCard);
        Computer.addCard(ComputerFirstCard);
    }
    
    public Player getHuman() {
        return Human;
    }
    
    public Player getComputer() {
        return Computer;
    }
    
    public Card takeCard(Player p) {
        Card card = new Card(DeckObject.nextCard());
        p.addCard(card);
        
        return card;
    }
    
    public int getMaxScore() {
        return MaxScore;
    }
}
