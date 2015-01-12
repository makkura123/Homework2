/**
 * Create a map of Gerbils and use Iterator for the keySet()
 * Look up the Gerbil for each key and print out key
 * Gerbil should also hop
 * @author Neele
 */
package gerbilmap;
import java.util.*;
import java.util.Map.Entry;

public class GerbilMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Create map to store Gerbils
         */
        Map<String,Gerbil> Gerbils = new HashMap<String,Gerbil>();
        /**
         * Manually add several Gerbils to map (could not use for-loop, otherwise its always same name)
         */
        Gerbils.put("Pete", new Gerbil(1));
        Gerbils.put("Ed", new Gerbil(2));
        Gerbils.put("Kent", new Gerbil(3));
        Gerbils.put("Susan", new Gerbil(4));
        Gerbils.put("Anne", new Gerbil(5));
        Gerbils.put("Nathan", new Gerbil(6));
        Gerbils.put("Dori", new Gerbil(7));
        
        /**
         * Create iterator
         */
        Iterator<Entry<String,Gerbil>> it = Gerbils.entrySet().iterator();
        
        /**
         * Second iterator associated with map entries (need to use to use collection-view to obtain references)
         */
        do{
            Entry<String,Gerbil> iter = it.next();
            System.out.print("'"+ iter.getKey() + "' our ");
            iter.getValue().hop();
        } while(it.hasNext());
    }
    
}
