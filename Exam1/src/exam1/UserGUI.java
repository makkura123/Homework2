/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Neele
 */
public class UserGUI extends javax.swing.JFrame {

    /**
     * Creates new form UserGUI
     */
    public UserGUI() {
        initComponents();
    }
    Game game = new Game();
    Dice dice = new Dice();
    ArrayList<String> Playerlist = new ArrayList<String>();
    File f = new File("c:\\users\\neele\\documents\\github\\Homework2\\Exam1\\gamefile.scr");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Dicegame");

        jLabel2.setText("Username:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Win or Lose?");

        jLabel4.setText("Bet:");

        jButton2.setText("Play");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Money available");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("7");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Over 7");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Under 7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel1))
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton3)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Checks if user played before
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextField1.getText();
        game.setMoney(500); // used because I could not make the save and load option work correctly
        /**
         * If loop for case use did not play before
         */
        
         for (int i = 0; i < Playerlist.size(); i++){ 
           if (!Playerlist.get(i).equals(username)){
            Playerlist.add(0, jTextField1.getText());
            game.setMoney(500);
           }
         
        else{
            try{
                /**
                 * if user played before, read money out of the textfile
                 */
                BufferedReader rdr = new BufferedReader(new FileReader(f));
                String line ;
                while ((line = rdr.readLine()) != null)
                    game.setMoney(Integer.parseInt(line));
                 rdr.close();
        }
            catch (IOException | NumberFormatException ex) {
             System.out.println("I was hoping that we wouldn't get here.");
                }
        }     
        }
         /**
          * Prints out Money
          */
         String f = String.format("Money: %s", game.getMoney());
         jLabel3.setText(f);
      
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Play-Button
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
           /**
            * User input for bet
            * if the bet > than the money available, play game
            * Exception handling for bad input
            */
        int takebet = Integer.parseInt(jTextField2.getText());
        if (game.getMoney() >= takebet){
        dice.rollDice1();
        int play = dice.play();
        
        /**
         * Buttongroup for 3 options, different calculations for different selections
         * 
         */
        if (jRadioButton1.isSelected()){
            if (play == 1){
                game.afterBet(takebet);
                String f = String.format("You guessed right. %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            }
            else {
                game.afterBet(-takebet);
                String f = String.format("Wrong! %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            }
        }
        else if(jRadioButton2.isSelected()){
            if (play == 2){
                game.afterBet(takebet);
                String f = String.format("You guessed right. %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            }
            else {
                game.afterBet(-takebet);
                String f = String.format("Wrong! %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            }
        }
        else if (jRadioButton3.isSelected()) {
            if (play == 3){
                game.afterBet(takebet*4);
                String f = String.format("You guessed right. %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            } 
            else {
                game.afterBet((-takebet)*4);
                String f = String.format("Wrong! %s, %s", dice.diceroll1, dice.diceroll2);
                jLabel3.setText(f); 
            }
        }
        /**
         * output if no button is selected
         */
        else{
        String f2 = String.format("Please select a button");
        jLabel3.setText(f2);
        }
        
        String f2 = String.format("Your money: %s", game.getMoney());
        jLabel5.setText(f2); 
        
        /**
         * Changes money into string and writes it into file
         */
            try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            String m = String.format("%s", game.getMoney());
            wrtr.write(m);
            wrtr.close();
            }
            catch (Exception ex) {
               System.out.println("I was hoping that we wouldn't get here.");
            }
        }
        else{
            String f = String.format("Sorry, you only have %s available", game.getMoney());
            jLabel3.setText(f); 
        }
       }
       catch (ArithmeticException ex) {
           String f = String.format("Oops, a math error: %s",  ex.getMessage());
            jLabel3.setText(f);
       }
       catch (IndexOutOfBoundsException ex) {
            String f = String.format("We went too far: %s", ex.getMessage());
            jLabel3.setText(f);
       }
       catch (IllegalArgumentException ex){
           String f = String.format("%s", ex.getMessage());
            jLabel3.setText(f);
       }
       catch (Exception ex) {
           String f = String.format("We don't know what happened: %s", ex.getMessage());
            jLabel3.setText(f);
}
         
    }//GEN-LAST:event_jButton2ActionPerformed
/**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
