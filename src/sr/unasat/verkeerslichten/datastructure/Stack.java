package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Stack {
//    private Link first; // ref to first item on list
//    // -------------------------------------------------------------
//    public Stack() // constructor
//    { first = null; } // no items on list yet
//    // -------------------------------------------------------------
//    public boolean isEmpty() // true if list is empty
//    { return (first==null); }
//    // -------------------------------------------------------------
//    public void insertFirst(Voertuig voertuig) // insert at start of list
//    { // make new link
//        Link newLink = new Link(voertuig);
//        newLink.next = first; // newLink --> old first
//        first = newLink; // first --> newLink
//    }
//    // -------------------------------------------------------------
//    public Voertuig deleteFirst() // delete first item
//    { // (assumes list not empty)
//        Link temp = first; // save reference to link
//        first = first.next; // delete it: first-->old next
//        return temp.voertuig; // return deleted link
//    }
//    // -------------------------------------------------------------
//    public void displayList() {
//        Link current = first; // start at beginning of list
//        while (current != null) // until end of list,
//        {
//            current.displayLink(); // print data
//            current = current.next; // move to next link
//        }
//        System.out.println("");
//    }

//    ============================

    private Link first;
    private int nItems = 0;

    public Stack() {
        first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }


    public void insertFirst(Voertuig voertuig){
        Link newLink = new Link(voertuig);

        if(isEmpty()){
            first = newLink;
        }
        else {
            newLink.next = first;
            first = newLink;
        }
    }


    public Voertuig deleteFirst() {
        Voertuig temp = first.voertuig;

        if (isEmpty()){
            return  null;
        }

        first = first.next;
        nItems--;
        return temp;
    }

    public void displayList() {

        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }

    }

    public int peekFront(){
        return first.voertuig.getPriority();
    }

}
