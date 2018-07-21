package org.ccsu.cs.md;

public class ChessConstants {
	
	/**
	 * Class constructor. Attempting to instantiate throws exception.
	 * @throws Exception
	 */
	public ChessConstants() throws Exception {
		throw new Exception(CONSTRUCTOR_EXCEPTION);
	}
	
	// welcome prompt Strings
	public static final String TITLE = "-----The Knight's Tour-----";
	public static final String INSTRUCTION = "For the following prompt, enter a letter from \"A\" to \"H\",\nfollowed by a number from 1 to 8 (example: \"G6\").\nThis will be the starting position on the chessboard.";
	public static final String START_PROMPT = "Enter the position to start tour: ";
	
	// exception Strings
	public static final String CONSTRUCTOR_EXCEPTION = "Static class should not be instantiated.";
}
