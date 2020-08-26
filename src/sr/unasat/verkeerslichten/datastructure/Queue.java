package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Queue {
//
//    private Link first; // ref to first link on list
//    private Link last; // ref to last link on list
//
//    public Queue() // constructor
//    {
//        first = null; // no items on list yet
//        last = null; // no items on list yet
//    }
//    // -------------------------------------------------------------
//
//    // -------------------------------------------------------------
//    public boolean isEmpty() // true if no links
//    { return first==null; }
//    // -------------------------------------------------------------
//    public void insertLast(Voertuig voertuig) // insert at end of list
//    {
//        Link newLink = new Link(voertuig); // make new link
//        if( isEmpty() ) // if empty list,
//            first = newLink; // first --> newLink
//        else
//            last.next = newLink; // old last --> newLink
//        last = newLink; // newLink <-- last
//    }
//    // -------------------------------------------------------------
//
//
//    public Voertuig deleteFirst() // delete first link
//    { // (assumes non-empty list)
//        Voertuig temp = first.voertuig;
//        if(first.next == null) // if only one item
//            last = null; // null <-- last
//        first = first.next; // first --> old next
//        return temp;
//    }
//    // -------------------------------------------------------------
//    public void displayList()
//    {
//        Link current = first; // start at beginning
//        while(current != null) // until end of list,
//        {
//            current.displayLink(); // print data
//            current = current.next; // move to next link
//        }
////        System.out.println("");
//    }
//
//
//
//    // -------------------------------------------------------------
//    public int peekFront(){
//        return first.voertuig.getPriority();
//    }

    private Link first;
    private int nItems = 0;

    public Queue() {
        first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }


    public void insertFirst(Voertuig voertuig) {
        Link newLink = new Link(voertuig);                      //make new link
        Link previous = null;                                  //previous link is null
        Link current = first;                                  // current link is nu de eerste

        while(current != null && newLink.voertuig.getPriority() > current.voertuig.getPriority()) {
            previous = current;                                 // vorige link is gelijk aan new link
            current = current.next;                             // new link is gelijk aan de next van de new link
        }

        if(previous==null) {
            first = newLink;                                    // first --> newLink
        }
        else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public void insertReverse(Voertuig voertuig) {
        Link newLink = new Link(voertuig);                  //make new link
        Link previous = null;                               //previous link is null
        Link current = first;                               // current link is nu de eerste

        while(current != null && newLink.voertuig.getNummer() > current.voertuig.getNummer()) {
            previous = current;                                // vorige link is gelijk aan new link
            current = current.next;                              // new link is gelijk aan de next van de new link
        }

        if(previous==null) {
            first = newLink;                                    // first --> newLink
        }
        else {
            previous.next = newLink;
        }
        newLink.next = current;
    }


    public Voertuig deleteFirst() {
        Voertuig temp = first.voertuig;

        if (isEmpty()){
            return  null;
        }

        first = first.next;                                  //delete it: first ->> old next
        nItems--;
        return temp;
    }

    public void displayList() {

        Link current = first;                    //start at beginning of list
        while(current != null) {                //until end of list
            current.displayLink();              //print data
            current = current.next;             // move to next link
        }
    }

    public int peekFront(){
        return first.voertuig.getPriority();
    }

    public int getnItems() {
        return nItems;
    }



}



