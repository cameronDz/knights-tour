package org.ccsu.cs.md.tour.simple;

public class TourPrinter {

	/**
	 * Loops through a 2D Integer array and prints the value in each position.
	 * Assumed the array is an 8x8 chess board.
	 * 
	 * @param tour Integer 2D array
	 * @return String to be printed on console of Knight's tour.
	 */
	public static String consolePrintTour(int[][] tour) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				int stop = tour[i][j];
				if (stop < 10) {
					sb.append(0);
				}
				sb.append(stop);
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
