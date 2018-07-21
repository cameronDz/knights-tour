package org.ccsu.cs.md;

public class ChessBoardGenerator {

	/**
	 * Class constructor. Attempting to instantiate throws exception.
	 * 
	 * @throws Exception
	 */
	public ChessBoardGenerator() throws Exception {
		throw new Exception(ChessConstants.CONSTRUCTOR_EXCEPTION);
	}

	/**
	 * Generates a 64 squared chess board
	 * @return
	 */
	public static String create64VerticesOfChessBoard() {
		StringBuilder sb = new StringBuilder();
		sb.append("------Chess Board------\n");
		// Creates 64 vertices of chess board.
		DoublyLinkedList chessboard = chessBoard();
		DLNode temp = chessboard.getHead();

		// Print out of the chess board vertices.
		int cnt = 0;
		while (temp != null) {
			if (temp.getElement() != null) {
				sb.append(temp.getElement());
				sb.append(" ");
			}
			temp = temp.getNext();
			if (cnt++ % 8 == 0) {
				sb.append("\n");
			}
		} 
		return sb.toString();
	}

	/**
	 * Creates a LinkedList of all the vertices (squares) on a chess board.
	 * 
	 * @return
	 */
	private static DoublyLinkedList chessBoard() {
		DoublyLinkedList list = new DoublyLinkedList();
		for (int i = 0; i < 64; i++) {
			int row = i / 8 + 1;
			int col = i % 8 + 1;
			ChessVertice x = new ChessVertice(row, col);
			list.addLast(x);
		}
		return list;
	}
}
