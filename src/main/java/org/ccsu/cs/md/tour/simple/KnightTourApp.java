package org.ccsu.cs.md.tour.simple;

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
		int y = ConvertChar.toInt(userInput.charAt(0)); 
		int x = ConvertChar.toInt(userInput.charAt(1)); 
		int[][] tour = TourCalculator.createKnightsTourArray(x, y);  
		String tourMap = TourPrinter.consolePrintTour(tour);
		System.out.println(tourMap); 
		scan.close();
	}
}