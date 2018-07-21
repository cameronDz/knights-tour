package org.ccsu.cs.md.tour.simple;

/**
 * Used to calculate a Knight's Tour based off Warndorff's algorithm.
 * @author Cameron
 */
public class TourCalculator {
	// Next x and y positions and next degree count.
	private static int nextX;
	private static int nextY;
	private static int nextDegree;

	/**
	 * Calculates the Knight's Tour of a Chess board
	 * 
	 * @param x
	 *            Integer value for starting position of X-axis on 8x8 chess board.
	 * @param y
	 *            Integer value for starting position of Y-axis on 8x8 chess board.
	 * @return Integer 2D array filled in from 1 to 64, representing the move number
	 *         for a Knight's Tour.
	 */
	public static int[][] createKnightsTourArray(int x, int y) {
		int[][] board = new int[8][8]; 
		int move = 1;
		board[x][y] = move;

		// Loop executes while there are still open vertices connected to current
		// position.
		while (calculateDegrees(x, y, board) > 0) { 
			initializeNextMoveVariables();  
			move++;
			// Go through 8 possible Knight moves
			comparePossibleMoveAgainstNextMove(x + 2, y - 1, board);
			comparePossibleMoveAgainstNextMove(x + 2, y + 1, board);
			comparePossibleMoveAgainstNextMove(x - 2, y - 1, board);
			comparePossibleMoveAgainstNextMove(x - 2, y + 1, board);
			comparePossibleMoveAgainstNextMove(x + 1, y - 2, board);
			comparePossibleMoveAgainstNextMove(x + 1, y + 2, board);
			comparePossibleMoveAgainstNextMove(x - 1, y - 2, board);
			comparePossibleMoveAgainstNextMove(x - 1, y + 2, board);
			// Next X and Y values are stored and move to the matrix
			x = nextX;
			y = nextY;
			board[x][y] = move; 
		}
		return board;
	}

	/**
	 * Re-initialize the next move X, Y, and degree variables for calculating a new
	 * tour.
	 */
	public static void initializeNextMoveVariables() {
		nextX = 0;
		nextX = 0;
		nextDegree = 9;
	}

	/**
	 * Calculates the position and number of degrees associated with position. If
	 * position is better than current next position, will replace next position.
	 * 
	 * @param x
	 *            Integer value for X-position on board.
	 * @param y
	 *            Integer value for Y-position on board.
	 * @param board
	 *            2D Integer array representing an 8x8 chess board
	 */
	private static void comparePossibleMoveAgainstNextMove(int x, int y, int[][] board) {
		boolean valid = checkXYPosition(x, y, board);
		int degrees = calculateDegrees(x, y, board);
		if (valid && degrees < nextDegree) {
			nextX = x;
			nextY = y;
			nextDegree = degrees;
		}
	}

	/**
	 * Makes sure X and Y values are within parameters of the (assumed) 8x8 board.
	 * 
	 * @param x
	 *            Integer value for X-position on board.
	 * @param y
	 *            Integer value for Y-position on board.
	 * @param board
	 *            2D Integer array representing an 8x8 chess board
	 * @return
	 */
	private static boolean checkXYPosition(int x, int y, int[][] board) {
		if (x < 0) {
			return false;
		}
		if (x >= 8) {
			return false;
		}
		if (y < 0) {
			return false;
		}
		if (y >= 8) {
			return false;
		}
		if (board[x][y] > 0) {
			return false;
		}
		return true;
	}

	/**
	 * Calculates how many open vertices are connected to a specific node.
	 * 
	 * @param x
	 *            Integer value for X-position on board.
	 * @param y
	 *            Integer value for Y-position on board.
	 * @param board
	 *            2D Integer array representing an 8x8 chess board
	 * @return
	 */
	private static int calculateDegrees(int x, int y, int[][] board) {
		int degrees = 0;
		// Each if represent a different knight move from the node. Checks for node
		// being on the board, and not yet on the tour.Incrememts counter if node is
		// open.
		if (checkXYPosition(x - 2, y - 1, board)) {
			degrees++;
		}
		if (checkXYPosition(x - 2, y + 1, board)) {
			degrees++;
		}
		if (checkXYPosition(x + 2, y - 1, board)) {
			degrees++;
		}
		if (checkXYPosition(x + 2, y + 1, board)) {
			degrees++;
		}
		if (checkXYPosition(x - 1, y - 2, board)) {
			degrees++;
		}
		if (checkXYPosition(x - 1, y + 2, board)) {
			degrees++;
		}
		if (checkXYPosition(x + 1, y - 2, board)) {
			degrees++;
		}
		if (checkXYPosition(x + 1, y + 2, board)) {
			degrees++;
		}
		return degrees;
	}
}
