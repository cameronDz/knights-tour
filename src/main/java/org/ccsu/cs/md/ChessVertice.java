package org.ccsu.cs.md;
/* ChessVertice.java        @auhtor(cameron.dziurgot@my.ccsu.ed)
// @version(29 Apr 2015)    @course(CS253.Final_Project)
// Object used for vertices in chess board graph.*/
public class ChessVertice
{
    private int col, row, adjVert;
    public ChessVertice(int a, int b)
    {
        this.col = a;
        this.row = b;
        this.adjVert = findAdjVerts();
    }
    /*Returns vertice name with respect to row/column.*/
    public String toString()
        {return colString(col) + row;}
    /*Column getter.*/
    public int getCol()
        {return col;}
    /*Row getter.*/
    public int getRow()
        {return row;}
    /*Adjacent vertice count getter.*/
    public int getAdjVert()
        {return adjVert;}
    /*Case sequence to determine letter representation for column.*/
    private String colString(int c)
    {
        switch (c)
        {
            case 1: return "A";
            case 2: return "B";
            case 3: return "C";
            case 4: return "D";
            case 5: return "E";
            case 6: return "F";
            case 7: return "G";
            default: return "H";
        }
    }
    /*Calculates the number of adjacent vertices.*/
    private int findAdjVerts()
    {
        int verts = 0;
        for (int x=-2; x<=2; x++)
        {
            int destRow = row + x;
            /*Makes sure destination vertice's row falls on the ches  board.*/
            if ( (destRow > 0) && (destRow <= 8) && ( x != 0) )
            {
                int fact = 1;
                /*Tells algorithm whether vertice row is 2 spaces from origin or 1.*/
                if (x%2 != 0)
                    {fact = fact*2;}                
                
                for (int y=-1*fact; y<=fact; y=y+(fact*2))
                {
                    int destCol = col + y;
                    /*Makes sure destination vertice's column falls on the chess board.*/
                    if ( (destCol > 0) && (destCol <= 8) )
                        {verts++;} /*Increments counter.*/
                }
            }
        }
        return verts;
    }
}
