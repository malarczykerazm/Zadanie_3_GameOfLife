package com.capgemini.gameoflife;

/**
 * validates the data
 * @author EMALARCZ
 *
 */
public class DataValidation {
		
	/**
	 * checks if the input is a number
	 * @param input String input
	 * @return the int number of throws a WrongInputException
	 */
	public static int dataVal(String input) {
		if (input.matches("[\\d]+")) {
			int numericInput = Integer.parseInt(input);
			return Integer.parseInt(input);		
		} else {
			throw new WrongInputException("Dozwolone jest jedynie wprowadzanie dodatnich liczb całkowitych.");
		}
	}
	
}
