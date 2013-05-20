/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import javax.swing.ImageIcon;
/**
 *
 * @author martins
 */
public class Card {
    private String CardName;
    
    private int CardValue;
    
    public Card(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        CardName = name;
    }
    
    public String getName() {
        return CardName;
    }
    
    public String getImageName() {
        return CardName.concat(".png");
    }
    
    public ImageLabel getImage() {
        String initialPath = "resources/cards/";
        String url = getClass().getResource(".").getPath().concat(initialPath).concat(getImageName());

        ImageLabel label = new ImageLabel(
            new ImageIcon(url)
        );
        
        return label;
    }
    
    public void setValue(int v) {
        CardValue = v;
    }
    
    public int getValue() {
        int value = 0;
        
        if (CardName.equals("2_club") || CardName.equals("2_diamond") || 
            CardName.equals("2_heart") || CardName.equals("2_spade")) {
            value = 2;
        } else if (CardName.equals("3_club") || CardName.equals("3_diamond") || 
            CardName.equals("3_heart") || CardName.equals("3_spade")) {
            value = 3;
        } else if (CardName.equals("4_club") || CardName.equals("4_diamond") || 
            CardName.equals("4_heart") || CardName.equals("4_spade")) {
            value = 4;
        } else if (CardName.equals("5_club") || CardName.equals("5_diamond") || 
            CardName.equals("5_heart") || CardName.equals("5_spade")) {
            value = 5;
        } else if (CardName.equals("6_club") || CardName.equals("6_diamond") || 
            CardName.equals("6_heart") || CardName.equals("6_spade")) {
            value = 6;
        } else if (CardName.equals("7_club") || CardName.equals("7_diamond") || 
            CardName.equals("7_heart") || CardName.equals("7_spade")) {
            value = 7;
        } else if (CardName.equals("8_club") || CardName.equals("8_diamond") || 
            CardName.equals("8_heart") || CardName.equals("8_spade")) {
            value = 8;
        } else if (CardName.equals("9_club") || CardName.equals("9_diamond") || 
            CardName.equals("9_heart") || CardName.equals("9_spade")) {
            value = 9;
        } else if (CardName.equals("10_club") || CardName.equals("10_diamond") || 
            CardName.equals("10_heart") || CardName.equals("10_spade")) {
            value = 10;
        } else if (CardName.equals("jack_club") || CardName.equals("jack_diamond") || 
            CardName.equals("jack_heart") || CardName.equals("jack_spade") || 
            CardName.equals("queen_club") || CardName.equals("queen_diamond") ||
            CardName.equals("queen_heart") || CardName.equals("queen_spade") ||
            CardName.equals("king_club") || CardName.equals("king_diamond") ||
            CardName.equals("king_heart") || CardName.equals("king_spade")) {
            
            value = 10;
        } else if (CardName.equals("1_club") || CardName.equals("1_diamond") || 
            CardName.equals("1_heart") || CardName.equals("1_spade")) {
            value = CardValue;
        } else {
            //throw exception
        }
        
        return value;
    }
    
    public boolean isKnave() {
        boolean result = false;
        
        if (CardName.equals("1_club") || CardName.equals("1_diamond") || 
            CardName.equals("1_heart") || CardName.equals("1_spade")) {
            result = true;
        }
        
        return result;
    }
}
