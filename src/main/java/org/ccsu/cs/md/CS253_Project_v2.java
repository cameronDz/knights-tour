package org.ccsu.cs.md;

/* CS253_Project_v2.java       @auhtor(cameron.dziurgot@my.ccsu.ed)
//@version(29 Apr 2015)    @course(CS253.Final_Project)
//Asks user for a position on a chess board. Returns a knights tour
//from that position.*/
import java.util.Scanner;
public class CS253_Project_v2
{
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     /*Prompt user for knights starting position.*/
     System.out.print("\n-----The Knight's Tour-----\n");
     System.out.print("For the following prompt, enter a letter from \"A\" to \"H\",\n");
     System.out.print("followed by a number from 1 to 8 (example: \"G6\").\n");
     System.out.print("This will be the starting position on the chessboard.\n");
     System.out.print("Enter the position to start tour: ");
     /*Takes user input, converts it into a position on a chess board.*/
     String userInput = scan.next();        
     int col = ConvertChar.toInt(userInput.charAt(0));
     int row = ConvertChar.toInt(userInput.charAt(1));
     ChessVertice origin = new ChessVertice(col, row);
     
     System.out.println(); /*End program.*/
 }    
}