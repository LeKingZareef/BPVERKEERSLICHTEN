package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkedList {

    private Link first; // ref to first link on list
    private Link last; // ref to last link on list

    public LinkedList() // constructor
    {
        first = null; // no items on list yet
        last = null; // no items on list yet
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true if list is empty
    {
        return (first==null);
    }
    // -------------------------------------------------------------

    // insert at start of list
    public void insertFirst(Voertuig voertuig)
    { // make new link
        Link newLink = new Link(voertuig); // make new link
        if( isEmpty() ) // if empty list,
            last = newLink; // newLink <-- last
        else
            first.previous = newLink; // newLink <-- old first
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
    // -------------------------------------------------------------
//    public Link deleteFirst() // delete first item
//    { // (assumes list not empty)
//        Link temp = first; // save reference to link
//        first = first.next; // delete it: first-->old next
//        return temp; // return deleted link
//    }

    public Link deleteKey(Voertuig voertuig) // delete item w/ given key
    { // (assumes non-empty list)
        Link current = first; // start at beginning
        while(current.voertuig.getKenteken() != voertuig.getKenteken()) // until match is found,
        {
            current = current.next; // move to next link
            if(current == null)
                return null; // didn’t find it
        }
        if(current==first) // found it; first item?
            first = current.next; // first --> old next
        else // not first
        // old previous --> old next
            current.previous.next = current.next;
        if(current==last) // last item?
            last = current.previous; // old previous <-- last
        else // not last
        // old previous <-- old next
            current.next.previous = current.previous;
        return current; // return value
    }

    public void displayList()
    {
        Link current = last; // start at end
        while(current != null) // until start of list,
        {
            current.displayLink(); // display data
            current = current.previous; // move to previous link
        }
        System.out.println("");
    }


    public int getPrio()
    {
//        Link current = last; // start at end
//        while(current != null) // until start of list,
//        {
//            current.getPrio(); // display data
//            current = current.previous; // move to previous link
//        }
        return first.voertuig.getPriority();
    }

    public String getKenteken()
    {
//        Link current = last; // start at end
//        while(current != null) // until start of list,
//        {
//            current.getPrio(); // display data
//            current = current.previous; // move to previous link
//        }
        return first.voertuig.getKenteken();
    }



    public int findSize()
    {
        int res= 0;
        while (first != null)
        {
            res++;
            first = first.next;
        }

        return res;
    }




}



