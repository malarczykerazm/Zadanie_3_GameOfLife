package com.capgemini.gameoflifeTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.gameoflife.Cell;
import com.capgemini.gameoflife.GameState;

public class GameStateTests {

	@Test
	public void shouldMiddleCellDieDueToOneNeighbour() {
		Cell[][] testBoard = new Cell[3][3];
		testBoard[0][0] = new Cell(false, 1);
		testBoard[0][1] = new Cell(false, 1);
		testBoard[0][2] = new Cell(false, 1);
		testBoard[1][0] = new Cell(false, 1);
		testBoard[1][1] = new Cell(true, 0);
		testBoard[1][2] = new Cell(false, 1);
		testBoard[2][0] = new Cell(false, 1);
		testBoard[2][1] = new Cell(false, 1);
		testBoard[2][2] = new Cell(false, 1);
		
		testBoard = GameState.gameState(testBoard);
		
		Cell[][] expectedBoard = new Cell[3][3];
		expectedBoard[0][0] = new Cell(false, 0);
		expectedBoard[0][1] = new Cell(false, 0);
		expectedBoard[0][2] = new Cell(false, 0);
		expectedBoard[1][0] = new Cell(false, 0);
		expectedBoard[1][1] = new Cell(false, 0);
		expectedBoard[1][2] = new Cell(false, 0);
		expectedBoard[2][0] = new Cell(false, 0);
		expectedBoard[2][1] = new Cell(false, 0);
		expectedBoard[2][2] = new Cell(false, 0);
		
		for (int i = 0; i < expectedBoard.length; i++) {
			for (int j = 0; j < expectedBoard[i].length; j++) {
				assertEquals(expectedBoard[i][j].isAlive(), testBoard[i][j].isAlive());
				assertEquals(expectedBoard[i][j].getNumberOfNeighbours(), testBoard[i][j].getNumberOfNeighbours());			}
		}
	}
	
	@Test
	public void shouldMiddleCellDieDueToFourNeighbours() {
		Cell[][] testBoard = new Cell[3][3];
		testBoard[0][0] = new Cell(false, 1);
		testBoard[0][1] = new Cell(false, 3);
		testBoard[0][2] = new Cell(true, 2);
		testBoard[1][0] = new Cell(false, 2);
		testBoard[1][1] = new Cell(true, 4);
		testBoard[1][2] = new Cell(true, 4);
		testBoard[2][0] = new Cell(false, 2);
		testBoard[2][1] = new Cell(true, 3);
		testBoard[2][2] = new Cell(true, 3);
		
		testBoard = GameState.gameState(testBoard);
		
		Cell[][] expectedBoard = new Cell[3][3];
		expectedBoard[0][0] = new Cell(false, 1);
		expectedBoard[0][1] = new Cell(true, 1);
		expectedBoard[0][2] = new Cell(true, 1);
		expectedBoard[1][0] = new Cell(false, 2);
		expectedBoard[1][1] = new Cell(false, 4);
		expectedBoard[1][2] = new Cell(false, 4);
		expectedBoard[2][0] = new Cell(false, 1);
		expectedBoard[2][1] = new Cell(true, 1);
		expectedBoard[2][2] = new Cell(true, 1);
		
		for (int i = 0; i < expectedBoard.length; i++) {
			for (int j = 0; j < expectedBoard[i].length; j++) {
				assertEquals(expectedBoard[i][j].isAlive(), testBoard[i][j].isAlive());
				assertEquals(expectedBoard[i][j].getNumberOfNeighbours(), testBoard[i][j].getNumberOfNeighbours());			}
		}
	}
	
	@Test
	public void shouldMiddleCellSurviveDueToTwoNeighbours() {
		Cell[][] testBoard = new Cell[3][3];
		testBoard[0][0] = new Cell(false, 1);
		testBoard[0][1] = new Cell(false, 2);
		testBoard[0][2] = new Cell(false, 2);
		testBoard[1][0] = new Cell(false, 1);
		testBoard[1][1] = new Cell(true, 2);
		testBoard[1][2] = new Cell(true, 2);
		testBoard[2][0] = new Cell(false, 1);
		testBoard[2][1] = new Cell(false, 3);
		testBoard[2][2] = new Cell(true, 2);
		
		testBoard = GameState.gameState(testBoard);
		
		Cell[][] expectedBoard = new Cell[3][3];
		expectedBoard[0][0] = new Cell(false, 1);
		expectedBoard[0][1] = new Cell(false, 2);
		expectedBoard[0][2] = new Cell(false, 2);
		expectedBoard[1][0] = new Cell(false, 2);
		expectedBoard[1][1] = new Cell(true, 3);
		expectedBoard[1][2] = new Cell(true, 3);
		expectedBoard[2][0] = new Cell(false, 2);
		expectedBoard[2][1] = new Cell(true, 3);
		expectedBoard[2][2] = new Cell(true, 3);
		
		for (int i = 0; i < expectedBoard.length; i++) {
			for (int j = 0; j < expectedBoard[i].length; j++) {
				assertEquals(expectedBoard[i][j].isAlive(), testBoard[i][j].isAlive());
				assertEquals(expectedBoard[i][j].getNumberOfNeighbours(), testBoard[i][j].getNumberOfNeighbours());			}
		}
	}
	
	@Test
	public void shouldMiddleCellSurviveDueToThreeNeighbours() {
		Cell[][] testBoard = new Cell[3][3];
		testBoard[0][0] = new Cell(false, 1);
		testBoard[0][1] = new Cell(false, 3);
		testBoard[0][2] = new Cell(true, 2);
		testBoard[1][0] = new Cell(false, 1);
		testBoard[1][1] = new Cell(true, 3);
		testBoard[1][2] = new Cell(true, 3);
		testBoard[2][0] = new Cell(false, 1);
		testBoard[2][1] = new Cell(false, 3);
		testBoard[2][2] = new Cell(true, 2);
		
		testBoard = GameState.gameState(testBoard);
		
		Cell[][] expectedBoard = new Cell[3][3];
		expectedBoard[0][0] = new Cell(false, 2);
		expectedBoard[0][1] = new Cell(true, 3);
		expectedBoard[0][2] = new Cell(true, 3);
		expectedBoard[1][0] = new Cell(false, 3);
		expectedBoard[1][1] = new Cell(true, 5);
		expectedBoard[1][2] = new Cell(true, 5);
		expectedBoard[2][0] = new Cell(false, 2);
		expectedBoard[2][1] = new Cell(true, 3);
		expectedBoard[2][2] = new Cell(true, 3);
		
		for (int i = 0; i < expectedBoard.length; i++) {
			for (int j = 0; j < expectedBoard[i].length; j++) {
				assertEquals(expectedBoard[i][j].isAlive(), testBoard[i][j].isAlive());
				assertEquals(expectedBoard[i][j].getNumberOfNeighbours(), testBoard[i][j].getNumberOfNeighbours());			}
		}
	}
	
	@Test
	public void shouldMiddleCellReviveDueToThreeNeighbours() {
		Cell[][] testBoard = new Cell[3][3];
		testBoard[0][0] = new Cell(false, 0);
		testBoard[0][1] = new Cell(false, 2);
		testBoard[0][2] = new Cell(true, 1);
		testBoard[1][0] = new Cell(false, 0);
		testBoard[1][1] = new Cell(false, 3);
		testBoard[1][2] = new Cell(true, 2);
		testBoard[2][0] = new Cell(false, 0);
		testBoard[2][1] = new Cell(false, 2);
		testBoard[2][2] = new Cell(true, 1);
		
		testBoard = GameState.gameState(testBoard);
		
		Cell[][] expectedBoard = new Cell[3][3];
		expectedBoard[0][0] = new Cell(false, 1);
		expectedBoard[0][1] = new Cell(false, 2);
		expectedBoard[0][2] = new Cell(false, 2);
		expectedBoard[1][0] = new Cell(false, 1);
		expectedBoard[1][1] = new Cell(true, 1);
		expectedBoard[1][2] = new Cell(true, 1);
		expectedBoard[2][0] = new Cell(false, 1);
		expectedBoard[2][1] = new Cell(false, 2);
		expectedBoard[2][2] = new Cell(false, 2);
		
		for (int i = 0; i < expectedBoard.length; i++) {
			for (int j = 0; j < expectedBoard[i].length; j++) {
				assertEquals(expectedBoard[i][j].isAlive(), testBoard[i][j].isAlive());
				assertEquals(expectedBoard[i][j].getNumberOfNeighbours(), testBoard[i][j].getNumberOfNeighbours());			}
		}
	}

}
