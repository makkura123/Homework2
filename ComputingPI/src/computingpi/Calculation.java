/**
 * Calculation for pi
 * @author Neele
 */
package computingpi;


public class Calculation {
/**
 * Initialize values
 * x - denominator, sign - used to alternate between signs
 */
   public int x = 1;
   public double pi = 0;
   public int sign = 1;
       
   /**
    * Uses Leibniz Series to calculate pi and prints it in a table
    */
   public void CalculatePi(){
        for (int i = 1; i <= 200000; i++){
            pi += sign * 4.0 / x;
            sign *= -1;
            x += 2;
            System.out.printf("Term: %s, PI: %s\n", i, pi);
        }
   }
}
