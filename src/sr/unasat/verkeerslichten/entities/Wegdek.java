package sr.unasat.verkeerslichten.entities;

import sr.unasat.verkeerslichten.datastructure.LinkQueue;

public class Wegdek {
    private String wegdekCode;

    private LinkQueue wegdekQueue = new LinkQueue();

    public Wegdek(String wegdekCode) {
        this.wegdekCode = wegdekCode;
    }

    public String getWegdekCode() {
        return wegdekCode;
    }
    public void fillWegdek(Voertuig voertuig) {
        this.wegdekQueue.insert(voertuig);
    }

    public LinkQueue getVoertuigenQueue() {
        return wegdekQueue;
    }

}
