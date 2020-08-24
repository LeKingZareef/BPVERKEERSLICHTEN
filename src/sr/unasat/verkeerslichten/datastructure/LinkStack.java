package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkStack {
    private LinkList theList;
    //--------------------------------------------------------------
    public LinkStack() // constructor
    {
        theList = new LinkList();
    }
    //--------------------------------------------------------------
    public void push(Voertuig voertuig) // put item on top of stack
    {
        theList.insertFirst(voertuig);
    }
    //--------------------------------------------------------------
    public Voertuig pop() // take item from top of stack
    {
        return theList.deleteFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
