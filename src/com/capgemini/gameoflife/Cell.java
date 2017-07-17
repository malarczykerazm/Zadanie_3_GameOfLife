package com.capgemini.gameoflife;

/**
 * stores info about a single board cell (a Cell object) - isAlive boolean
 * and int numberOfNeighboars on the board
 * @author EMALARCZ
 *
 */
public class Cell {
	
	boolean isAlive;
	int numberOfNeighbours;
	
	public Cell(boolean isAlive, int numberOfNeighbours) {
		this.isAlive = isAlive;
		this.numberOfNeighbours = numberOfNeighbours;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getNumberOfNeighbours() {
		return numberOfNeighbours;
	}

	public void setNumberOfNeighbours(int numberOfNeighbours) {
		this.numberOfNeighbours = numberOfNeighbours;
	}
	
}