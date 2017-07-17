package com.capgemini.gameoflife;

import java.util.Scanner;

public class GameOfLifeMain {

	public static void main(String[] args) {
		Scanner step = new Scanner(System.in);
		int r = 0;
		int c = 0;
		boolean itsTheRightInput = false;
		
		while (!(itsTheRightInput)) {
			try {
				UserInterface rows = new UIBoardRow();
				r = DataValidation.dataVal(rows.inputBoardData());
				itsTheRightInput = true;
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());	
				System.out.println("Spróbuj ponownie.");
			}
		}
			
		itsTheRightInput = false;
		
		while (!(itsTheRightInput)) {
			try {
				UserInterface columns = new UIBoardColumn();
				c = DataValidation.dataVal(columns.inputBoardData());		
				itsTheRightInput = true;
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());	
				System.out.println("Spróbuj ponownie.");
			}			
		}
		
		Cell[][] board;
		
		byte randomOrInput = UserInterface.boardFulfillingWay();
		if (randomOrInput == 1) {
			board = GameState.gameState(r, c);
		} else {
			board = GameState.randomGameState(r, c);
		}
	
		System.out.println("\nKrok 1 - stan początkowy:");
		Print.print(board);
		System.out.println("\nNastępny krok gry - <<ENTER>>\nWyjście - Q + <<ENTER>>");
		int i = 1;
		String input = step.nextLine();
		boolean quit;
		if (input.toLowerCase().equals("q")) {
			quit = true;
		} else {
			quit = false;
		}
		while(!(quit)) {
			i++;
			System.out.println("Krok " + i + ":");
			Print.print(GameState.gameState(board));
			input = step.nextLine();
			if (input.toLowerCase().equals("q")) {
				quit = true;
			} else if (!(input.equals(""))) {
				System.out.println("Błędne wprowadzenie. Wpisz literę Q, aby wyjść.");
			}
		}
		step.close();
	}
	
}