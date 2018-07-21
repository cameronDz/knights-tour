package org.ccsu.cs.md.tour.technical;

import java.util.Scanner;

import org.ccsu.cs.md.tour.simple.ConvertChar;

/**
 * Create a chess board and use an algorithm to find a "knights tour" from a
 * specified location. List the moves to create the tour.
 * 
 * @author Cameron
 */
public class KnightTourAppV01 {
	public static void main(String[] args) { 
		System.out.println(ChessBoardGenerator.create64VerticesOfChessBoard());

		// Prints all knight moves (L shape) from origin vertices.
		System.out.print("Enter vertice: ");
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList adjVerts = determineAdjacentVertices(scan.next());
		scan.close();
		System.out.println("Adjacent vertices(" + adjVerts.size() + "):" + adjVerts.toString());
		System.out.println();
	} 

	/**
	 * Finds all knight moves from specific vertices and puts that destination
	 * vertices into a LL. String vertice is understood to be 2 characters long, the
	 * first char being from "A" to "H", the second char being from 1 to 8.
	 * 
	 * @param vertices
	 * @return
	 */
	public static DoublyLinkedList determineAdjacentVertices(String vertices) {
		DoublyLinkedList list = new DoublyLinkedList();
		int col = ConvertChar.toInt(vertices.charAt(0));
		int row = ConvertChar.toInt(vertices.charAt(1));
		ChessVertice origin = new ChessVertice(row, col);

		// Algorithm that prints all possible adjacent vertices. Starts with finding the
		// row the destination vertices would be in, then moves to column.
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
