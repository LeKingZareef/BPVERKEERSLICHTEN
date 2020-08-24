package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Queue {
    int front, rear, size;
    int nItems;
    Voertuig[] queArray;

    public Queue(int size)
    {
        this.size = size;
        nItems = 0;
        front = 0;
        rear = - 1;
        queArray = new Voertuig[this.size];
    }



    // Queue is full when size becomes
    // equal to the nItems
    boolean isFull()
    {
        return (nItems == size);
    }

    // Queue is empty when size is 0
    boolean isEmpty()
    {
        return (nItems == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    public void enqueue(Voertuig voertuig)
    {
        boolean maxIndex = (rear == size - 1);
        if (maxIndex && queArray[0] == null) { // deal with wraparound
            rear = -1;
        }

        if (!maxIndex && queArray[rear + 1] == null) {// check array out of bounds and
            queArray[++rear] = voertuig; // increment rear and insert
            nItems++; // nItems gebruik je om te kijken hoeveel items je hebt insert in totaal
        }

//        System.out.println(voertuig);

    }

    // Method to remove an item from queue.
    // It changes front and size
    public Voertuig dequeue()
    {

        Voertuig temp = queArray[front];//3 // get value and incr front
        queArray[front] = null;//3 removed
        if (front + 1 == size) { // deal with wraparound
            front = 0;
        } else {
            front++;
        }
        nItems--;// one less item
        return temp;
    }

    // Method to get front of queue
    public Voertuig front()
    {
        return queArray[front];
    }

    // Method to get rear of queue
    public Voertuig rear()
    {
        return queArray[rear];
    }

    public int getnItems() {
        return this.nItems;
    }
}

