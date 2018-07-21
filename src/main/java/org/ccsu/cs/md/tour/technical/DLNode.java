package org.ccsu.cs.md.tour.technical;

/**
 * Node used for DoublyLinkedLists. Uses ChessVertices as datum.
 * 
 * @author Cameron
 */
public class DLNode {
	private ChessVertice datum; // reference to the element stored at this node
	private DLNode prev; // reference to the previous node in the list
	private DLNode next; // reference to the subsequent node in the list

	/**
	 * Empty constructor
	 */
	public DLNode() {
		// empty constructor
	}
	
	/**
	 * Basic constructor
	 * @param e
	 * @param p
	 * @param n
	 */
	public DLNode(ChessVertice e, DLNode p, DLNode n) {
		datum = e;
		prev = p;
		next = n;
	}

	/**
	 * 
	 * @return
	 */
	public ChessVertice getElement() {
		return datum;
	}

	/**
	 * 
	 * @return
	 */
	public DLNode getPrev() {
		return prev;
	}

	/**
	 * 
	 * @return
	 */
	public DLNode getNext() {
		return next;
	}

	/**
	 * 
	 * @param p
	 */
	public void setPrev(DLNode p) {
		prev = p;
	}

	/**
	 * 
	 * @param n
	 */
	public void setNext(DLNode n) {
		next = n;
	}
}