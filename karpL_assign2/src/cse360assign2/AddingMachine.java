
/**
 * @author Laura Karp
 * Class ID: 70642
 * Description: program that includes several functions simulating adding and substracting 
 * @version 3.0
 * @date 10/9/19
 */

package cse360assign2;

public class AddingMachine {

	
	/**
	 * Global variables
	 */
	private int total;
	
	// string starts with 0 since 0 is the initial value 
	private String str = "0"; 
	
	/**
     * A constructor for the AddingMachine class
     * @param no parameter necessary
     */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
     * method to determine the total
     * @return total total is the current overall total
     */
	public int getTotal () {
		return total;
	}
	
	/**
     * method that adds values
     * @param value value is an int that will be added to the total
     */
	public void add (int value) {
		
		// adding the parameter to the global total variable
		total = total + value;
		
		// keeping track of subtract transactions
		str = str + " + " + value; 
	}
	
	/**
     * method that subtracts values
     * @param value value is an int that will be subtracted from total
     */
	public void subtract (int value) {
		
		// subtracting the value parameter from the global total variable
		total = total - value;
		
		// keeping track of subtract transactions
		str = str + " - " + value; 
	}
		
	/**
     * method that changes input to a string type
     * @return str str is a string that holds all history transactions from the program
     */
	public String toString () {
		return str;
	}

	/**
     * method that clears input, simulates a clear button on a calculator
     */
	public void clear() {  
		// setting the string to empty and total to 0 to clear out previous input values
		str = "";
		total = 0;
	}

	
	/**
     * main method created for testing purposes
     * @param String[] args default parameter for main method
     */
	public static void main(String[] args) {
		
		// creating object of AddingMachine class
		AddingMachine myCalculator = new AddingMachine();
		
		// using examples from guideline document to use add and subtract methods
		myCalculator.add (4); 
		myCalculator.subtract(2); 
		myCalculator.add(5);
		
		// testing the toString method to match example output given in guidelines	
        System.out.println(myCalculator.toString());
        
        // testing the getTotal method
        System.out.println(myCalculator.getTotal());
        
        // testing clear method
        myCalculator.clear();
        System.out.print(myCalculator);
        System.out.print(myCalculator.getTotal());
        
    }
}
