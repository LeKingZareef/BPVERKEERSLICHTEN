package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class PriorityQueue {
    private int maxSize;
    private Voertuig[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new Voertuig[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    
}
