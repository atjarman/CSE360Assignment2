package cse360assign2;

/**
 * Author: Andrew Jarman
 * <p>
 * Class ID: 420
 * <p>
 * Assignment Number: 2
 * 
 * <p>
 * 
 * Description:
 * 
 * Calculator utility for performing basic arithmetic on an integer.
 * <p>
 * Creates a Calculator constructor along with getTotal(), add(), subtract(),
 * multiply(), divide(), getHistory() methods for modifying and displaying
 * a Calculator object.
 * 
 *@author Andrew Jarman
 */

public class Calculator {

	private int total;
	
	/**
	 * Constructor that creates a calculator with the starting total value at 0.
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** 
	 * Returns the current total value that is stored in the calculator.
	 * 
	 * @return the current total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the current total with the argument value.
	 * 
	 * @param value	The amount to be added to the total.
	 */
	
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts the argument value from the current total.
	 * 
	 * @param value	The amount to be subtracted to the total.
	 */
	
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the argument value and the current total.
	 * 
	 * @param value	The amount to be multiplied with the total.
	 */
	
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides the current total by the argument value. an input of 0
	 * resets the total to 0. No divide by 0 error is thrown.
	 * 
	 * @param value	The amount to be divided from the total.
	 */
	
	public void divide (int value) {
		if(value == 0){
			total = 0;
		} else {
			total = total / value;
		}
	}
	
	/** 
	 * Returns all changes made to the total value and prints them in insertion order. 
	 * 
	 * @return All historic changes made to the total.
	 */
	
	public String getHistory () {
		return "";
	}
}