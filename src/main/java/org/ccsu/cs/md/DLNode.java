package org.ccsu.cs.md;

/* DLNode.java              @author(cameron.dziurgot@my.ccsu.edu)
//@version(29 Apr 2015)    @course(CS253.Final_Project)
//Node used for DoublyLinkedLists. Uses ChessVertices as datum.*/
public class DLNode
{
 private ChessVertice datum; // reference to the element stored at this node
 private DLNode prev; // reference to the previous node in the list
 private DLNode next; // reference to the subsequent node in the list
 public DLNode(ChessVertice e, DLNode p, DLNode n)
 {
     datum = e;
     prev = p;
     next = n;
 }
 
 public ChessVertice getElement()
     {return datum;}
     
 public DLNode getPrev()
     {return prev;}
     
 public DLNode getNext()
     {return next;}
   
 public void setPrev(DLNode p)
     {prev = p;}
 
 public void setNext(DLNode n)
     {next = n;}
}