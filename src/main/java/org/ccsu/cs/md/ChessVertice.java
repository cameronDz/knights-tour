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
		return columnString(col) + row;
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
	 * Case sequence to determine letter representation for column. Will return "H"
	 * by default.
	 * 
	 * @param column
	 *            Integer value being converted into a character, "A"-"H".
	 * @return Character representation of the column number.
	 */
	private String columnString(int column) {
		// TODO add unit tests
		if (column == 1) {
			return "A";
		} else if (column == 2) {
			return "B";
		} else if (column == 3) {
			return "C";
		} else if (column == 4) {
			return "D";
		} else if (column == 5) {
			return "E";
		} else if (column == 6) {
			return "F";
		} else if (column == 7) {
			return "G";
		}
		return "H";
	}

	/**
	 * Calculates the number of adjacent vertices.
	 * 
	 * @return
	 */
	private int findAdjVerts() {
		// TODO add unit tests
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
