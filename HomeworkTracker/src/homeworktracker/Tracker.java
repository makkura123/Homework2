/**
 * Class to handle ArrayList, and average, smallest and largest function
 * @author Neele
 */
package homeworktracker;

import java.util.ArrayList;


public class Tracker {
    /**
     * initialize smallest and largest
     */
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    
   ArrayList<Integer> homework = new ArrayList<Integer>();
   
    public Tracker(){};
    
    /**
     * Adds score to ArrayList homework
     * @param score used for ArrayList
     */
    public void AddToColl(int score){
        homework.add(score);
    }
    
    /**
     * Calculates the average
     * @return average
     */
    
    public double average(){
         double sum = 0;
         for (int i = 0; i < homework.size(); i++){
           sum =+ sum + homework.get(i);
             }
         return sum/homework.size();
     }
    
    /**
     * Looks for the largest number in ArrayList
     * @return largest
     */
    public int largest(){
    for (int i = 0; i < homework.size(); i++){
          if (largest < homework.get(i))
              largest = homework.get(i);
        }
    return largest;
    }
    
    /**
     * Looks for the smallest number in ArrayList
     * @return smallest
     */
    public int smallest(){
        for (int i = 0; i < homework.size(); i++){
          if (smallest > homework.get(i))
              smallest = homework.get(i);
        }
        return smallest;
    }
    
}
