package org.ccsu.cs.md;

/**
 * Object that hold ChessVertice, a LLPositional Queue of adjacent vertices
 * ranked by number of available moves for adjacent vertices, and the move
 * number of the vertices in the knights tour.
 * 
 * @author Cameron
 */
public class KnightsPosition {
	private ChessVertice currentVert;
	private int move;
	// private LLPositionalQueue adjVertices;
	private DoublyLinkedList currentTour;

	public KnightsPosition() {
		// empty constructor
	}
	
	/**
	 * 
	 * @param c
	 */
	public KnightsPosition(ChessVertice c) {
		
	}
}