package sr.unasat.verkeerslichten.entities;

import sr.unasat.verkeerslichten.datastructure.LinkedList;

public class Wegdek {
    private String wegdekCode;

    private LinkedList wegdekQueue = new LinkedList();

    public Wegdek(String wegdekCode) {
        this.wegdekCode = wegdekCode;
    }

    public String getWegdekCode() {
        return wegdekCode;
    }
    public void fillWegdek(Voertuig voertuig) {
        this.wegdekQueue.insertFirst(voertuig);
    }

    public LinkedList getWegdekQueue() {
        return this.wegdekQueue;
    }

}
