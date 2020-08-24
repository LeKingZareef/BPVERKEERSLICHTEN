package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class PriorityQueue {
    private Node head;
    private int totalSize;

    public PriorityQueue() {
        head = null;
        totalSize = 0;
    }


    public void insert(Voertuig voertuig) {
        Node ng = new Node();
        ng.setData(voertuig);
        ng.setPriority(voertuig.getPriority());

        if (head == null) {
            head = ng;
        } else {
            ng.setNext(head);
            head.setPrev(ng);
            head = ng;
        }

        totalSize++;
    }


    public Voertuig remove() {
        Node temp = head;
        (head) = (head).next;
        totalSize--;
        return temp.voertuig;
    }


    public int size() {
        return totalSize;
    }

    public boolean isEmpty() {
        return (totalSize == 0);
    }



}
