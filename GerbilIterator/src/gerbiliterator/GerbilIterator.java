/**
 * Modified GerbilArrayList and added Iterator to go through the list
 * @author Neele
 */
package gerbiliterator;
import java.util.ArrayList;
import java.util.Iterator;


public class GerbilIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Gerbil> Gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 25; i++)
            Gerbils.add(new Gerbil(i));
        
        /**
         * Create iterator and use next() to move through the list
         */
        Iterator<Gerbil> it = Gerbils.iterator();
        for (int i = 0; i < Gerbils.size(); i++)
            it.next().hop();
    }
    
}
