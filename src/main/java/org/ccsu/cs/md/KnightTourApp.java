package org.ccsu.cs.md;

import java.util.Scanner;

/**
 * Asks user for a position on a chess board. Returns a knights tour from that
 * position.
 * 
 * @author Cameron
 */
public class KnightTourApp {
	public static void main(String[] args) {
		// Prompt user for knights starting position. 
		System.out.println(ChessConstants.TITLE);
		System.out.println(ChessConstants.INSTRUCTION);
		System.out.println(ChessConstants.START_PROMPT);
		// Takes user input, converts it into a position on a chess board. 
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		int col = ConvertChar.toInt(userInput.charAt(0));
		int row = ConvertChar.toInt(userInput.charAt(1));
		scan.close();
		ChessVertice origin = new ChessVertice(col, row);  
		System.out.println(); 
	}
}