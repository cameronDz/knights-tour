package org.ccsu.cs.md.tour;

/**
 * A basic doubly linked list implementation. Used to link ChessVertice objects
 * in a list. Initially was set to AnyType LinkList.
 * 
 * @author Cameron
 */
public class DoublyLinkedList {
	// instance variables of the DoublyLinkedList
	private DLNode header; // header sentinel
	private DLNode trailer; // trailer sentinel
	private int size = 0; // number of elements in the list

	/**
	 * Empty constructor
	 */
	public DoublyLinkedList() {
		header = new DLNode(null, null, null); // create header
		trailer = new DLNode(null, header, null); // trailer is preceded by header
		header.setNext(trailer); // header is followed by trailer
	}

	/**
	 * Returns the number of elements in the linked list.
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Tests whether the linked list is empty.
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns head DLNode.
	 * @return
	 */
	public DLNode getHead() {
		return header;
	}

	/**
	 * Returns (but does not remove) the first element of the list.
	 * @return
	 */
	public ChessVertice first() {
		if (isEmpty()) {
			return null;
		}
		return header.getNext().getElement(); // first element is beyond header
	} 
	
	/**
	 * Returns (but does not remove) the last element of the list.
	 * @return
	 */
	public ChessVertice last() {
		if (isEmpty()) {
			return null;
		}
		return trailer.getPrev().getElement(); // last element is before trailer
	}

	/**
	 * 
	 */
	public String toString() {
		if (isEmpty()) {
			return "Empty List.";
		}
		String s = "";
		DLNode temp = this.header;
		while (temp != null) {
			if (temp.getElement() != null) {
				s = s + " " + temp.getElement();
			}
			temp = (DLNode) temp.getNext();
		}
		return s;
	} 
	
	/**
	 * Adds ChessVertice datum to the front of the list.
	 * @param datum
	 */
	public void addFirst(ChessVertice datum) {
		addBetween(datum, header, header.getNext());
	}  

	/**
	 * Adds ChessVertice datum to the end of the list.
	 * @param datum
	 */
	public void addLast(ChessVertice datum) {
		addBetween(datum, trailer.getPrev(), trailer);
	}  

	/**
	 * Removes and returns the first ChessVertice datum of the list.
	 * @return
	 */
	public ChessVertice removeFirst() {
		if (isEmpty()) {
			return null;
		}  
		return remove(header.getNext());  
	}
	
	/**
	 * Removes and returns the last element of the list.
	 * @return
	 */
	public ChessVertice removeLast() {
		if (isEmpty()) {
			return null;
		} // nothing to remove
		return remove(trailer.getPrev()); // last element is before trailer
	}

	/**
	 * Adds element e to the linked list in between the given nodes.
	 * @param datum
	 * @param predecessor
	 * @param successor
	 */
	private void addBetween(ChessVertice datum, DLNode predecessor, DLNode successor) {
		// create and link a new node
		DLNode newest = new DLNode(datum, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}

	/**
	 * Removes the given node from the list and returns its element.
	 * @param node
	 * @return
	 */
	private ChessVertice remove(DLNode node) {
		DLNode predecessor = node.getPrev();
		DLNode successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
} 
