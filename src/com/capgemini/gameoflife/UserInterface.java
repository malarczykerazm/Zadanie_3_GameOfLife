package com.capgemini.gameoflife;

import java.util.Scanner;

public interface UserInterface {
			
	public String inputBoardData();
	
	public static boolean isCellAlive() {
		boolean isAlive;
		Scanner input = new Scanner(System.in);

		if (input.nextLine().toLowerCase().equals("x")) {
			isAlive = true;
		} else {
			isAlive = false;
		}
		return isAlive;
	}
	
	static byte boardFulfillingWay() {
		byte randomOrInput = 0;
		Scanner input = new Scanner(System.in);
		String userChoice;

		System.out.println("\nWpisz 1 + <<ENTER>> - ręczne wypełnienie tablicy, 2 + <<ENTER>> - wylosowanie życia z prawdopodobieństwem 30%:");
		
		do {
			userChoice = input.nextLine();
			if (userChoice.equals("1")) {
				randomOrInput = 1;
			} else if (userChoice.equals("2")) {
				randomOrInput = 2;
			} else {
				System.out.println("Błędne wprowadzenie. Spróbuj ponownie.");
			}
		} while (!(userChoice.equals("1")) && !(userChoice.equals("2")));
		return randomOrInput;
	}
	
}
