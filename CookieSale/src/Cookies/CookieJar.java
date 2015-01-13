/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cookies;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Neele
 */
public class CookieJar {
    public CookieJar(){}
    int sales;
    Map<String, Cookie> cookiejar = new HashMap<String,Cookie>();
    
    public void addCookie(Cookie n){
        cookiejar.put("Cookie", n);
    }
    
    public int totalsales(){
        for (int j = 0; j < cookiejar.size(); j++){
             sales += cookiejar.get("Cookie").getCost();
              }
       return sales;
    }
    
    public int size(){
        return cookiejar.size();
    }
    
    
}
