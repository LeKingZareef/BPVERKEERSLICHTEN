package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkStack {
//    private Stack theList;
//    //--------------------------------------------------------------
//    public LinkStack() // constructor
//    {
//        theList = new Stack();
//    }
//    //--------------------------------------------------------------
//    public void push(Voertuig voertuig) // put item on top of stack
//    {
//        theList.insertFirst(voertuig);
//    }
//    //--------------------------------------------------------------
//    public Voertuig pop() // take item from top of stack
//    {
//        return theList.deleteFirst();
//    }
//    //--------------------------------------------------------------
//    public boolean isEmpty() // true if stack is empty
//    {
//        return ( theList.isEmpty() );
//    }
//    //--------------------------------------------------------------
//    public void displayStack()
//    {
//        theList.displayList();
//    }

//    =============================

    private Stack theList;
    private int nItems;

    public LinkStack() {
        theList = new Stack();
    }

    public void push(Voertuig voertuig) {
        theList.insertFirst(voertuig);
        nItems++;
    }

    public Voertuig pop() {
        nItems--;
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.print("\n\n***REVERSE!***");
        theList.displayList();
    }

    public int peekFirst() {
        return theList.peekFront();
    }

    public int getnItems() {
        return nItems;
    }

}
