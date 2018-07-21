package org.ccsu.cs.md.tour;

/**
 * Object used to hold edges in a knight's tour path on a chess board graph.
 * 
 * @author Cameron 
 */
public class ChessEdge {
	private ChessVertice destination;
	private ChessVertice origin;

	/**
	 * Empty constructor
	 */
	public ChessEdge() {
		// empty constructor
	}

	/**
	 * 
	 * @param u
	 * @param v
	 */
	public ChessEdge(ChessVertice u, ChessVertice v) {
		this.origin = u;
		this.destination = v;
	}

	/** 
	 * Returns the string representation of the edge.
	 */
	public String toString() {
		return origin.toString() + " --> " + destination.toString();
	}

	/**
	 * Getter for origin.
	 */
	public ChessVertice getOrigin() {
		return origin;
	}

	/**
	 * Getter for destination.
	 */
	public ChessVertice getDestination() {
		return destination;
	}
}