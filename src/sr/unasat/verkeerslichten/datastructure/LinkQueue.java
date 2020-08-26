package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkQueue {
//    private Queue theList;
//    private int totalSize;
//
//    //--------------------------------------------------------------
//    public LinkQueue() // constructor
//    {
//        theList = new Queue();
//    } // make a 2-ended list
//
//    //--------------------------------------------------------------
//    public boolean isEmpty() // true if queue is empty
//    {
//        return theList.isEmpty();
//    }
//
//    //--------------------------------------------------------------
//    public void insert(Voertuig voertuig) // insert, rear of queue
//    {
//        theList.insertLast(voertuig);
//        totalSize++;
//    }
//
//    //--------------------------------------------------------------
//    public Voertuig remove() // remove, front of queue
//    {
//        totalSize--;
//        return theList.deleteFirst();
//
//    }
//
//    //--------------------------------------------------------------
//    public void displayQueue() {
////        System.out.print("Queue(front-- > rear): ");
//        theList.displayList();
//    }
//
//    public int peekFirst() {
//        return theList.peekFront();
//    }
//
//    public int size() {
//        return totalSize;
//    }

//    ===========================================
    private Queue theList;
    private int size;

    public LinkQueue() {
        theList = new Queue();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(Voertuig voertuig) {
        theList.insertFirst(voertuig);
        size++;
    }

    public void insertReverse(Voertuig voertuig){
        theList.insertReverse(voertuig);
        size++;
    }

    public Voertuig remove() {
        size--;

        if (isEmpty()) {
            return null;
        }

        return theList.deleteFirst();
    }

    public void displayQueue() {
        theList.displayList();
    }

    public int peekFirst() {
        return theList.peekFront();
    }

    public int size() {
        return size;
    }


}
