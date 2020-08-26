package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class LinkPriorityQueue {
//    private PriorityQueue linkListPriority = new PriorityQueue();
//    private int nItems;
//
//    public LinkPriorityQueue() {
//    }
//
//    public boolean isEmpty() {
//        return this.linkListPriority.isEmpty();
//    }
//
//    public void insert(Voertuig voertuig) {
//        this.linkListPriority.insert(voertuig);
//        ++this.nItems;
//    }
//
//    public Voertuig remove() {
//        --this.nItems;
//        return this.isEmpty() ? null : this.linkListPriority.remove();
//    }
//
//    public void displayQueue() {
//        this.linkListPriority.displayList();
//    }
//
//    public int peekFirst() {
//        return this.linkListPriority.peekFront();
//    }
//
//    public int getnItems() {
//        return this.nItems;
//    }
//
//    ===========
//    private LinkListPriority linkListPriority;
//    private int nItems;
//
//    public LinkPrVoertuigenQueue() {
//        linkListPriority = new LinkListPriority();
//
//    }
//
//    public boolean isEmpty() {
//        return linkListPriority.isEmpty();
//    }
//
//    public void insert(Voertuig voertuig) {
//        linkListPriority.insertFirst(voertuig);
//        nItems++;
//    }
//
//    public Voertuig remove() {
//        nItems--;
//        if (isEmpty()) {
//            return null;
//        }
//
//        return linkListPriority.deleteFirst();
//    }
//
//    public void displayQueue() {
//        linkListPriority.displayList();
//    }
//
//    public int peekFirst() {
//        return linkListPriority.peekFront();
//    }
//
//    public int getnItems() {
//        return nItems;
//    }
//====
    private PriorityQueue priorityQueue;
    private int nItems;

    public LinkPriorityQueue() {
        priorityQueue = new PriorityQueue();

    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public void insert(Voertuig voertuig) {
        priorityQueue.insertFirst(voertuig);
        nItems++;
    }

    public Voertuig remove() {
        nItems--;
        if (isEmpty()) {
            return null;
        }

        return priorityQueue.deleteFirst();
    }

    public void displayQueue() {
        priorityQueue.displayList();
    }

    public int peekFirst() {
        return priorityQueue.peekFront();
    }

    public int getnItems() {
        return nItems;
    }

}
