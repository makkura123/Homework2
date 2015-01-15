/**
 * Class that uses an integer for number of gerbils and a void function hop that only returns a print out 
 * @author Neele
 */
package gerbilmap;

//PT -- reuse, don't copy/paste. -2
public class Gerbil {
    private final int _GerbilNumber;
    /**
     * Constructor
     * @param GerbilNumber 
     */
    Gerbil(int GerbilNumber){
        _GerbilNumber = GerbilNumber;
    }
    
    /**
     * Hop function that prints which gerbil is hopping:
     * 
     * <code> System.out.printf("Gerbil %d is hopping", _GerbilNumber); </code>
     */
    public void hop(){
        System.out.printf("Gerbil %d is hopping", _GerbilNumber);
        System.out.println();
    }
}
