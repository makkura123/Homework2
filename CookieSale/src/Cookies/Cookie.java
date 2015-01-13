/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cookies;

import java.util.ArrayList;

/**
 *
 * @author Neele
 */
public class Cookie{
    
    public int _cost;
    public String _type;
   
   
    public Cookie (String type, int cost){
       _type = type;
        _cost = cost;
    }
 
    
   public int getCost(){
       return _cost;
   }
}
