package org.ccsu.cs.md;

/**
 * Used to manipulate characters and Strings in getting vertices user.
 * 
 * @author Cameron
 */
public class ConvertChar {
	
	/**
	 * Used to take char in and turn into correct row/col integer.
	 * 
	 * @param c
	 * @return
	 */
	public static int toInt(char c) {
		// TODO add unit tests
		String x = Character.toString(c);
		if (x.equals("A") || x.equals("1")) {
			return 1;
		}
		if (x.equals("B") || x.equals("2")) {
			return 2;
		}
		if (x.equals("C") || x.equals("3")) {
			return 3;
		}
		if (x.equals("D") || x.equals("4")) {
			return 4;
		}
		if (x.equals("E") || x.equals("5")) {
			return 5;
		}
		if (x.equals("F") || x.equals("6")) {
			return 6;
		}
		if (x.equals("G") || x.equals("7")) {
			return 7;
		}
		if (x.equals("H") || x.equals("8")) {
			return 8;
		} else {
			return 0; // Indicates error if 0 is returned.
		}
	}
}
