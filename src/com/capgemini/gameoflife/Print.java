package com.capgemini.gameoflife;

/**
 * data print
 * @author EMALARCZ
 *
 */
public class Print {
	
	/**
	 * prints the board to the console
	 * @param board with the game state
	 */
	public static void print(Cell[][] board) {
		int r = board.length;
		int c = board[r-1].length;
				
		for (int i = 0; i < r; i++) {
			System.out.print("|");
			for (int j = 0; j < c; j++) {
				if (board[i][j].isAlive() == true) {
					System.out.print("X");
					System.out.print("|");
				} else {
					System.out.print(" ");
					System.out.print("|");
				}
			}	
			System.out.println();
		}	
	}
	
}