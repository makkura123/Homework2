/**
 * Adding gerbils to an ArrayList and use a new class to make the gerbils hop (and print this out)
 * @author Neele
 */
package gerbilarraylist;
import java.util.ArrayList;

public class GerbilArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> Gerbils = new ArrayList<Gerbil>();
        /**
         * @ for loop for adding gerbils to ArrayList
         */
        for (int i = 0; i < 25; i++){
            Gerbils.add(new Gerbil(i));
            Gerbils.get(i).hop();
        }
    }
    
}
