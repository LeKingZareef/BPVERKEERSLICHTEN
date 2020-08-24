package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkQueue {
    private FirstLastList theList;
    private int totalSize;

    //--------------------------------------------------------------
    public LinkQueue() // constructor
    {
        theList = new FirstLastList();
    } // make a 2-ended list

    //--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return theList.isEmpty();
    }

    //--------------------------------------------------------------
    public void insert(Voertuig voertuig) // insert, rear of queue
    {
        theList.insertLast(voertuig);
        totalSize++;
    }

    //--------------------------------------------------------------
    public Voertuig remove() // remove, front of queue
    {
        totalSize--;
        return theList.deleteFirst();

    }

    //--------------------------------------------------------------
    public void displayQueue() {
//        System.out.print("Queue(front-- > rear): ");
        theList.displayList();
    }

    public int peekFirst() {
        return theList.peekFront();
    }

    public int size() {
        return totalSize;
    }

}
