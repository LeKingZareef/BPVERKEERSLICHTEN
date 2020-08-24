package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkQueue {
    private FirstLastList theList;
    //--------------------------------------------------------------
    public LinkQueue() // constructor
    { theList = new FirstLastList(); } // make a 2-ended list
    //--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    { return theList.isEmpty(); }
    //--------------------------------------------------------------
    public void insert(Voertuig voertuig) // insert, rear of queue
    { theList.insertLast(voertuig); }
    //--------------------------------------------------------------
    public Voertuig  remove() // remove, front of queue
    { return theList.deleteFirst(); }
    //--------------------------------------------------------------
    public void displayQueue() {
//        System.out.print("Queue(front-- > rear): ");
        theList.displayList();
    }
    public String peekFirst() {
        return theList.peekFront();
    }


}
