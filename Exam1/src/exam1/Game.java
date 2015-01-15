/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Neele
 */
public class Game {

    /**
     * Constructor
     */
    public Game(){}  
    
    public String _name;
    int _money;
    
    /**
     * @return _name
     */
    public String getName(){
        return _name;
    } 
/**
 * calculations for after bet was made
 * @param bet 
 */
    public void afterBet(int bet){
        _money = _money + bet;
    }
    /**
     * sets money
     * @param money 
     */
    public void setMoney(int money){
        _money = money;
    }

    /**
     * @return _money
     */
    public int getMoney(){
        return _money;
    }

}

