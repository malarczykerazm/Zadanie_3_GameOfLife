package com.capgemini.gameoflife;

/**
 * sets the state of the game
 * @author EMALARCZ
 *
 */
public class GameState {
	
	/**
	 * sets the current state of the game on the basis of previous one
	 * @param board previous game state
	 * @return a board with the current game state
	 */
	public static Cell[][] gameState(Cell[][] board) {
		int r = board.length;
		int c = board[r-1].length;
		Enum.cellEnum stateOfASingleCell;
		int numberOfNeighbours;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				numberOfNeighbours = board[i][j].getNumberOfNeighbours();
				if (board[i][j].isAlive() == true) {
					stateOfASingleCell = Enum.cellEnum.ALIVE;
				} else {
					stateOfASingleCell = Enum.cellEnum.DEAD;
				}
				
				switch (stateOfASingleCell) {
				
				case ALIVE:	if (numberOfNeighbours > 3 || numberOfNeighbours < 2) { board[i][j].setIsAlive(false); }
				break;
				
				case DEAD:	if (numberOfNeighbours == 3) { board[i][j].setIsAlive(true); }
				break;
				}
			}
		}
		board = countNeighbours(board);
		return board;		
	}
	
	/**
	 * sets a chosen by the user start state of the game
	 * @param r number of rows of the board
	 * @param c number of columns of the board
	 * @return the board with the game state
	 */
	public static Cell[][] gameState(int r, int c) {
		Cell[][] board = new Cell[r][c];
		int numberOfNeighbours = 0;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("Podaj wartość dla komórki " + (i+1) + " " + (j+1) + " (X - komórka żywa, inne wartości - komórka martwa): ");
				if (UserInterface.isCellAlive()) {
					board[i][j] = new Cell(true, numberOfNeighbours);
				} else {
					board[i][j] = new Cell(false, numberOfNeighbours);
				}
			}
		}
		board = countNeighbours(board);
		return board;
	}
	
	/**
	 * sets a random start state of the game
	 * @param r number of rows of the board
	 * @param c number of columns of the board
	 * @return the board with the game state
	 */
	public static Cell[][] randomGameState(int r, int c) {
		Cell[][] board = new Cell[r][c];
		int numberOfNeighbours = 0;
		int maxValue = 10;
		int threshold = 7;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if ((Math.random() * maxValue) >= threshold) {
					board[i][j] = new Cell(true, numberOfNeighbours);
				} else {
					board[i][j] = new Cell(false, numberOfNeighbours);
				}
			}
		}
		board = countNeighbours(board);
		return board;
	}
	
	private static Cell[][] countNeighbours(Cell[][] board) {
		int r = board.length;
		int c = board[r-1].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
			
				int numberOfNeighbours = 0;
				
				for (int x = -1; x < 2; x++) {
					for (int y = -1; y < 2; y++) {
						if (x == 0 && y == 0) {
						} else {
							try {
								if (board[i+x][j+y].isAlive() == true) { numberOfNeighbours++; }
							} catch (ArrayIndexOutOfBoundsException e) { }
						}
					}
				}
			board[i][j].setNumberOfNeighbours(numberOfNeighbours);
			}
		}
		return board;
	}
	
}
