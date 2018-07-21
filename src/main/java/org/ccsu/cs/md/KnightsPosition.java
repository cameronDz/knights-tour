package org.ccsu.cs.md;

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
		currentVertice = initialVertice;
	}
}