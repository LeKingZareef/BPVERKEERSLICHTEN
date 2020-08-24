package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Node {

    public Voertuig voertuig;
    public int priority;
    public Node next;
    public Node prev;

    public Voertuig getData() {
        return voertuig;
    }

    public void setData(Voertuig voertuig) {
        this.voertuig = voertuig;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

}
