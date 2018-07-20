package org.ccsu.cs.md;
/* ChessEdge.java           @author(cameron.dziurgot@my.ccsu.edu)
// @version(29 Apr 2015)    @course(CS253.Final_Project)
// Object used to hold edges in a knight's tour path on a chess
//  board graph.*/
public class ChessEdge {
	private ChessVertice origin, destination;

	public ChessEdge(ChessVertice u, ChessVertice v) {
		this.origin = u;
		this.destination = v;
	}

	/* Returns the string representation of the edge. */
	public String toString() {
		return origin.toString() + " --> " + destination.toString();
	}

	/* Getter for origin. */
	public ChessVertice getOrigin() {
		return origin;
	}

	/* Getterfor destination. */
	public ChessVertice getDestination() {
		return destination;
	}
}