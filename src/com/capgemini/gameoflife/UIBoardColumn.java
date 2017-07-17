package com.capgemini.gameoflife;

import java.util.Scanner;

/**
 * user interface
 * @author EMALARCZ
 *
 */
public class UIBoardColumn implements UserInterface {

	/**
	 * gets the number of columns from the user (returns the input as a String value)
	 */
	public String inputBoardData() {
		Scanner inputR = new Scanner(System.in);
		System.out.print("Podaj liczbę kolumn tablicy: ");
		String c = inputR.nextLine();
		return c;
	}
	
}
