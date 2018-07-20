package org.ccsu.cs.md;

/**
 * Object used for vertices in chess board graph.
 * 
 * @author Cameron
 */
public class ChessVertice {
	private int adjVert;
	private int row;
	private int col;

	/**
	 * Empty constructor
	 */
	public ChessVertice() {
		// empty constructor
	}

	/**
	 * 
	 * @param a
	 * @param b
	 */
	public ChessVertice(int a, int b) {
		this.col = a;
		this.row = b;
		this.adjVert = findAdjVerts();
	}

	/**
	 * Returns vertices name with respect to row/column.
	 */
	public String toString() {
		return colString(col) + row;
	}

	/**
	 * Column getter.
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Row getter.
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Adjacent vertices count getter.
	 */
	public int getAdjVert() {
		return adjVert;
	}

	/**
	 * Case sequence to determine letter representation for column.
	 * 
	 * @param c
	 * @return
	 */
	private String colString(int c) {
		switch (c) {
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		case 6:
			return "F";
		case 7:
			return "G";
		default:
			return "H";
		}
	}

	/**
	 * Calculates the number of adjacent vertices.
	 * 
	 * @return
	 */
	private int findAdjVerts() {
		int verts = 0;
		for (int x = -2; x <= 2; x++) {
			int destRow = row + x;
			// Makes sure destination vertice's row falls on the chess board.
			if ((destRow > 0) && (destRow <= 8) && (x != 0)) {
				int fact = 1;
				// Tells algorithm whether vertices row is 2 spaces from origin or 1.
				if (x % 2 != 0) {
					fact = fact * 2;
				}

				for (int y = -1 * fact; y <= fact; y = y + (fact * 2)) {
					int destCol = col + y;
					// Makes sure destination vertice's column falls on the chess board.
					if ((destCol > 0) && (destCol <= 8)) {
						verts++;
					}
				}
			}
		}
		return verts;
	}
}
