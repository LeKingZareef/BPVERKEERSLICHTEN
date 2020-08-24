package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkList {
    private Link first; // ref to first item on list
    // -------------------------------------------------------------
    public LinkList() // constructor
    { first = null; } // no items on list yet
    // -------------------------------------------------------------
    public boolean isEmpty() // true if list is empty
    { return (first==null); }
    // -------------------------------------------------------------
    public void insertFirst(Voertuig voertuig) // insert at start of list
    { // make new link
        Link newLink = new Link(voertuig);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
    // -------------------------------------------------------------
    public Voertuig deleteFirst() // delete first item
    { // (assumes list not empty)
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp.voertuig; // return deleted link
    }
    // -------------------------------------------------------------
    public void displayList() {
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
