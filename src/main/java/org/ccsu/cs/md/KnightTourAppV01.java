package org.ccsu.cs.md;

import java.util.Scanner;

/**
 * Create a chess board and use an algorithm to find a "knights tour" from a
 * specified location. List the moves to create the tour.
 * 
 * @author Cameron
 */
public class KnightTourAppV01 {
	public static void main(String[] args) {
		System.out.print("------Chess Board------");
		// Creates 64 vertices of chess board.  
		DoublyLinkedList chessboard = chessBoard();
		DLNode temp = chessboard.getHead();
		
		// Print out of the chess board vertices. 
		int cnt = 0; 
		while (temp != null) {
			if (temp.getElement() != null) {
				System.out.print(temp.getElement() + " ");
			}
			temp = temp.getNext();
			if (cnt++ % 8 == 0) {
				System.out.print("\n");
			}
		}

		System.out.println();

		// Prints all knight moves (L shape) from origin vertices. 
		System.out.print("Enter vertice: ");
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList adjVerts = adjVert(scan.next());

		System.out.println("Adjacent vertices(" + adjVerts.size() + "):" + adjVerts.toString());
		System.out.println();
	}

	/**
	 * Creates a LinkedList of all the vertices (squares) on a chess board.
	 * @return
	 */
	public static DoublyLinkedList chessBoard() {
		DoublyLinkedList list = new DoublyLinkedList();
		for (int i = 0; i < 64; i++) {
			int row = i / 8 + 1;
			int col = i % 8 + 1;
			ChessVertice x = new ChessVertice(row, col);
			list.addLast(x);
		}
		return list;
	}

	/**
	 * Finds all knight moves frome specific vertice and puts that destination vertices into a LL. String vert is understood to be 2 characters long, the first char being from "A" to "H", the second char being from 1 to 8.  
	 * @param vert
	 * @return
	 */
	public static DoublyLinkedList adjVert(String vert) {
		DoublyLinkedList list = new DoublyLinkedList();
		int col = ConvertChar.toInt(vert.charAt(0));
		int row = ConvertChar.toInt(vert.charAt(1));
		ChessVertice origin = new ChessVertice(row, col);

		// Algorithm that prints all possible adjacent vertices. Starts with finding the row the destination vertices would be in, then moves to column. 
		for (int x = -2; x <= 2; x++) {
			int destRow = origin.getRow() + x;
			// Makes sure destination vertice's row falls on the chess board. 
			if ((destRow > 0) && (destRow <= 8) && (x != 0)) {
				int fact = 1;
				// Tells algorithm whether vertices row is 2 spaces from origin or 1. 
				if (x % 2 != 0) {
					fact = fact * 2;
				}

				for (int y = -1 * fact; y <= fact; y = y + (fact * 2)) {
					int destCol = origin.getCol() + y;
					// Makes sure destination vertice's column falls on the chess board.  
					if ((destCol > 0) && (destCol <= 8)) {
						// Adds adjacent vertices to LL.  
						ChessVertice dest = new ChessVertice(destRow, destCol);
						list.addLast(dest);
					}
				}
			}
		}
		return list;
	}
}
