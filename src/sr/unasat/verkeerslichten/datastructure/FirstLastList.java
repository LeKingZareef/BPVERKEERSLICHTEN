package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class FirstLastList {

    private Link first; // ref to first link on list
    private Link last; // ref to last link on list

    public FirstLastList() // constructor
    {
        first = null; // no items on list yet
        last = null; // no items on list yet
    }
    // -------------------------------------------------------------

    // -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    { return first==null; }
    // -------------------------------------------------------------
    public void insertLast(Voertuig voertuig) // insert at end of list
    {
        Link newLink = new Link(voertuig); // make new link
        if( isEmpty() ) // if empty list,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // old last --> newLink
        last = newLink; // newLink <-- last
    }
    // -------------------------------------------------------------


    public Voertuig deleteFirst() // delete first link
    { // (assumes non-empty list)
        Voertuig temp = first.voertuig;
        if(first.next == null) // if only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        Link current = first; // start at beginning
        while(current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
//        System.out.println("");
    }
    // -------------------------------------------------------------
    public String peekFront(){
        return first.voertuig.getKenteken();
    }
}



