/**
 * Calculation for pi
 * @author Neele
 */
package guipi;

//PT -- this can again be reused
public class Calculation {
/**
 * Initialize values
 * x - denominator, sign - used to alternate between signs
 */
   public int x = 1;
   public float pi = 0;
   public int sign = 1;
       
   /**
    * Uses Leibniz Series to calculate pi
    *@param n for integer of iterations
    *@return pi
    */
   public float CalculatePi(int n){
        for (int i = 1; i <= n; i++){
            pi += sign * 4.0 / x;
            sign *= -1;
            x += 2;
           
        }
        return pi;
   }
}
