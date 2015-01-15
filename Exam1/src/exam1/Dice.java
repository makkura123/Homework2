/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.Random;

/**
 *
 * @author Neele
 */
public class Dice {
    /**
     * Constructor
     */
    public Dice(){}
    
    
    Random rnd = new Random();
    int diceroll1, diceroll2;
    
    /**
     * roll both dice
     */
    public void rollDice1(){
        diceroll1 = rnd.nextInt(6)+1;
        diceroll2 = rnd.nextInt(6)+1;
    }
   
    /**
     * Game function
     * @return integer
     */
    public int play(){
        if ((diceroll1+diceroll2) > 7)
            return 1;
        else if ((diceroll1+diceroll2) < 7)
            return 2;
        else 
            return 3;
    }
}
