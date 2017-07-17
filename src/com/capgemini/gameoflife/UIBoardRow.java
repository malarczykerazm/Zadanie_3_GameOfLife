package com.capgemini.gameoflife;

import java.util.Scanner;

/**
 * user interface
 * @author EMALARCZ
 *
 */
public class UIBoardRow implements UserInterface {

	/**
	 * gets the number of rows from the user (returns the input as a String value)
	 */
	public String inputBoardData() {
		Scanner inputR = new Scanner(System.in);
		System.out.print("Podaj liczbę wierszy tablicy: ");
		String r = inputR.nextLine();
		return r;
	}
	
}
