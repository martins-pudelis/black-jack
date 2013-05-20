/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Martins
 */
public class ImageLabel extends JLabel {

  public ImageLabel(String img) {
    this(new ImageIcon(img));
  }

  public ImageLabel(ImageIcon icon) {
    setIcon(icon);
    // setMargin(new Insets(0,0,0,0));
    setIconTextGap(0);
    // setBorderPainted(false);
    setBorder(null);
    setText(null);
    setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
  }

}