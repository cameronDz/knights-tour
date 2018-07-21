package org.ccsu.cs.md.tour;

/**
 * Object that hold ChessVertice, a LLPositional Queue of adjacent vertices
 * ranked by number of available moves for adjacent vertices, and the move
 * number of the vertices in the knights tour.
 * 
 * @author Cameron
 */
public class KnightsPosition {
	private ChessVertice currentVertice;
	private int move;
	// private LLPositionalQueue adjVertices;
	private DoublyLinkedList currentTour;

	public KnightsPosition() {
		// empty constructor
	}
	
	/**
	 * 
	 * @param initialVertice
	 */
	public KnightsPosition(ChessVertice initialVertice) {
		setCurrentVertice(initialVertice);
	}

	/**
	 * @return the currentVertice
	 */
	public ChessVertice getCurrentVertice() {
		return currentVertice;
	}

	/**
	 * @param currentVertice the currentVertice to set
	 */
	public void setCurrentVertice(ChessVertice currentVertice) {
		this.currentVertice = currentVertice;
	}

	/**
	 * @return the move
	 */
	public int getMove() {
		return move;
	}

	/**
	 * @param move the move to set
	 */
	public void setMove(int move) {
		this.move = move;
	}

	/**
	 * @return the currentTour
	 */
	public DoublyLinkedList getCurrentTour() {
		return currentTour;
	}

	/**
	 * @param currentTour the currentTour to set
	 */
	public void setCurrentTour(DoublyLinkedList currentTour) {
		this.currentTour = currentTour;
	}
}