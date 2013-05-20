/*
 * BlackJackView.java
 */

package blackjack;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.awt.ComponentOrientation;
import java.awt.BorderLayout;
//import javax.m



/**
 * The application's main frame.
 */
public class BlackJackView extends FrameView {
    private Game GameObject;
            
    public BlackJackView(SingleFrameApplication app) {
        super(app);

        initComponents();

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        
        //busyIconTimer = new Timer(busyAnimationRate, null);
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = null;// resourceMap.getIcon("StatusBar.idleIcon");
        //statusAnimationLabel.setIcon(idleIcon);
        /*progressBar.setVisible(false);*/
        
        //try {     
            /*ImageLabel label = new ImageLabel(new ImageIcon("/home/martins/NetBeansProjects/BlackJack/src/blackjack/resources/about.png"));
            mainPanel.setLocation(29, 37);
            mainPanel.add(label);*/
        
        // connecting action tasks to status bar via TaskMonitor
        /*TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });*/
        
        initGame();
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = BlackJackApp.getApplication().getMainFrame();
            aboutBox = new BlackJackAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        BlackJackApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jComputerCardsPanel = new javax.swing.JPanel();
        jUserCardsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        computerScore = new javax.swing.JTextField();
        userScore = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stopButton = new javax.swing.JButton();
        takeCardButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        mainPanel.setName("mainPanel"); // NOI18N

        jComputerCardsPanel.setName("jComputerCardsPanel"); // NOI18N

        javax.swing.GroupLayout jComputerCardsPanelLayout = new javax.swing.GroupLayout(jComputerCardsPanel);
        jComputerCardsPanel.setLayout(jComputerCardsPanelLayout);
        jComputerCardsPanelLayout.setHorizontalGroup(
            jComputerCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jComputerCardsPanelLayout.setVerticalGroup(
            jComputerCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jUserCardsPanel.setName("jUserCardsPanel"); // NOI18N

        javax.swing.GroupLayout jUserCardsPanelLayout = new javax.swing.GroupLayout(jUserCardsPanel);
        jUserCardsPanel.setLayout(jUserCardsPanelLayout);
        jUserCardsPanelLayout.setHorizontalGroup(
            jUserCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jUserCardsPanelLayout.setVerticalGroup(
            jUserCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(blackjack.BlackJackApp.class).getContext().getResourceMap(BlackJackView.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        computerScore.setFont(resourceMap.getFont("computerScore.font")); // NOI18N
        computerScore.setText(resourceMap.getString("computerScore.text")); // NOI18N
        computerScore.setEnabled(false);
        computerScore.setFocusable(false);
        computerScore.setName("computerScore"); // NOI18N

        userScore.setFont(resourceMap.getFont("userScore.font")); // NOI18N
        userScore.setText(resourceMap.getString("userScore.text")); // NOI18N
        userScore.setEnabled(false);
        userScore.setFocusable(false);
        userScore.setName("userScore"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(blackjack.BlackJackApp.class).getContext().getActionMap(BlackJackView.class, this);
        stopButton.setAction(actionMap.get("computersTurn")); // NOI18N
        stopButton.setText(resourceMap.getString("stopButton.text")); // NOI18N
        stopButton.setName("stopButton"); // NOI18N

        takeCardButton.setAction(actionMap.get("getNewCard")); // NOI18N
        takeCardButton.setText(resourceMap.getString("takeCardButton.text")); // NOI18N
        takeCardButton.setName("takeCardButton"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(computerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(stopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(takeCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(computerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComputerCardsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jUserCardsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUserCardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jComputerCardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        helpMenu.add(jMenuItem2);

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
    newGame();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    @Action
    public void initGame() {
        GameObject = new Game();
        System.out.print(GameObject);
        drawCards();
        updatePlayersResult();
        
        jUserCardsPanel.setLayout(new FlowLayout());
        jUserCardsPanel.setComponentOrientation(
            ComponentOrientation.LEFT_TO_RIGHT
        );
        
        jComputerCardsPanel.setLayout(new FlowLayout());
        jComputerCardsPanel.setComponentOrientation(
            ComponentOrientation.LEFT_TO_RIGHT
        );
    }
    
    @Action
    public void drawCards() {
        Player ComputerObject = GameObject.getComputer();
        Player HumanObject = GameObject.getHuman();
        
        paintCard(ComputerObject, ComputerObject.getPlayerCards().get(0));
        paintCard(HumanObject, HumanObject.getPlayerCards().get(0));
        
        if (HumanObject.getPlayerCards().get(0).isKnave()) {
            //Display dialog with two buttons (1, 11)
            showKnaveChoiceBox(HumanObject.getPlayerCards().get(0));
        }
        
        if (ComputerObject.getPlayerCards().get(0).isKnave()) {
            if (ComputerObject.getResult()+11 > GameObject.getMaxScore()) {
                ComputerObject.getPlayerCards().get(0).setValue(1);
            } else {
                ComputerObject.getPlayerCards().get(0).setValue(11);
            }
        }
    }
    
    /*@Action
    public void drawPlayerCards(Player p) {
        int length = p.getPlayerCards().size();
        
        for (int i=0; i<length; i++) {
            if (p.isHuman()) {
                jUserCardsPanel.setLocation(i+100, 0);
                jUserCardsPanel.add(p.getPlayerCards().get(i).getImage());
            } else {
                jComputerCardsPanel.setLocation(0, i*100);
                jComputerCardsPanel.add(p.getPlayerCards().get(i).getImage());
                
            }
        }
        
        mainPanel.repaint();
    }*/
    
    @Action 
    public void paintCard(Player p, Card c) {
        ImageLabel icon = c.getImage();
        
        if (p.isHuman()) {
            jUserCardsPanel.add(icon, BorderLayout.EAST);
            jUserCardsPanel.revalidate();
            //jUserCardsPanel.repaint();
        } else {   
            jComputerCardsPanel.add(icon, BorderLayout.EAST);
            jComputerCardsPanel.revalidate();
            //jComputerCardsPanel.repaint();
        }
    }
    
    @Action
    public void updatePlayersResult() {
        Player ComputerObject = GameObject.getComputer();
        Player HumanObject = GameObject.getHuman();
        
        updatePlayerScore(ComputerObject);
        updatePlayerScore(HumanObject);
    }
    
    @Action
    public void updatePlayerScore(Player p) {
        if (p.isHuman()) {
            userScore.setText(String.valueOf(p.getResult()));
        } else {
            computerScore.setText(String.valueOf(p.getResult()));
        }
    }
    
    @Action
    public void getNewCard() {
        Player HumanObject = GameObject.getHuman();
        Card card = null;
        
        card = GameObject.takeCard(HumanObject);
        paintCard(HumanObject, card);
        
        if (card.isKnave()) {
            //Display dialog with two buttons (1, 11)
            showKnaveChoiceBox(card);
        }
        
        //drawPlayerCards(HumanObject);
        updatePlayerScore(HumanObject);
        
        if(HumanObject.getResult() > GameObject.getMaxScore()) {
            //Display game over dialog with buttons Close, New game
            Object[] options = {"Close", "New game"};
            int OptionIndex = JOptionPane.showOptionDialog(
            
            BlackJackApp.getApplication().getMainFrame(),
                "Sorry, but this time you lose!",
                "Game over",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]
            );

            if (OptionIndex == 1) {
                //Initializing new game
                newGame();
            }
        }
    }
    
    @Action
    public void showGameOverBox() {
        if (gameOverBox == null) {
            JFrame mainFrame = BlackJackApp.getApplication().getMainFrame();
            gameOverBox = new GameOver(mainFrame);
            gameOverBox.setLocationRelativeTo(mainFrame);
        }
        BlackJackApp.getApplication().show(gameOverBox);
    }

    @Action
    public void showKnaveChoiceBox(Card c) {
        Object[] options = {"11", "1"};
        int n = JOptionPane.showOptionDialog(
            BlackJackApp.getApplication().getMainFrame(),
            "Please choose which value you would like to use!",
            "Choose value",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]
        ); //default button title
        
        if (n == 0) {
            c.setValue(11);
        } else {
            c.setValue(1);
        }
        
        /*if (knaveChoiceBox == null) {
            JFrame mainFrame = BlackJackApp.getApplication().getMainFrame();
            knaveChoiceBox = new KnaveChoice(mainFrame);
            knaveChoiceBox.setLocationRelativeTo(mainFrame);
        }
        BlackJackApp.getApplication().show(knaveChoiceBox);*/
    }

    @Action
    public void computersTurn() {
        
        Player ComputerObject = GameObject.getComputer();
        Player HumanObject = GameObject.getHuman();
        
        if (HumanObject.getResult() >= 17) {
            Object[] options = {"Close", "New game"};
            int OptionIndex = 0;

            Card card = null;

            stopButton.setEnabled(false);
            takeCardButton.setEnabled(false);

            do {
                card = GameObject.takeCard(ComputerObject);
                paintCard(ComputerObject, card);

                if (card.isKnave()) {
                    //some AI for computer player
                    if (ComputerObject.getResult()+11 > GameObject.getMaxScore()) {
                        card.setValue(1);
                    } else {
                        card.setValue(11);
                    }
                }

                //drawPlayerCards(HumanObject);
                

                if (ComputerObject.getResult() >= 17 && 
                    HumanObject.getResult() < ComputerObject.getResult() &&
                    ComputerObject.getResult() <= GameObject.getMaxScore()) {
                    //Computer is winer, show dialog
                    updatePlayerScore(ComputerObject);
                    
                    OptionIndex = JOptionPane.showOptionDialog(
                        BlackJackApp.getApplication().getMainFrame(),
                        "Sorry, but this time computer is winer!",
                        "Game over",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     //do not use a custom Icon
                        options,  //the titles of buttons
                        options[0]
                    );

                    break;

                } else if (ComputerObject.getResult() > GameObject.getMaxScore()) {
                    //Computer lose, show dialog that player is winer
                    updatePlayerScore(ComputerObject);    
                    OptionIndex = JOptionPane.showOptionDialog(
                        BlackJackApp.getApplication().getMainFrame(),
                        "Congratulation, you won!",
                        "Game over",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     //do not use a custom Icon
                        options,  //the titles of buttons
                        options[0]
                    );

                    break;
                }
            } while (true);

            if (OptionIndex == 1) {
                //Initializing new game
                newGame();
            }
        } else {
            //To stop taking cards score should be at least 17
            JOptionPane.showMessageDialog(
                BlackJackApp.getApplication().getMainFrame(),
                "To stop taking cards, score should be at least 17!");
        }
    }
    
    @Action 
    public void newGame() {
        stopButton.setEnabled(true);
        takeCardButton.setEnabled(true);
        
        jUserCardsPanel.removeAll();
        jComputerCardsPanel.removeAll();
        
        jUserCardsPanel.revalidate();
        jUserCardsPanel.repaint();
        
        jComputerCardsPanel.revalidate();
        jComputerCardsPanel.repaint();
        
        initGame();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField computerScore;
    private javax.swing.JPanel jComputerCardsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jUserCardsPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton takeCardButton;
    private javax.swing.JTextField userScore;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;
    private javax.swing.JLabel statusAnimationLabel;
    private JDialog aboutBox;
    private JDialog gameOverBox;
    private JDialog knaveChoiceBox;
}