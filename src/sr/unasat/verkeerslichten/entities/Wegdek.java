package sr.unasat.verkeerslichten.entities;

import sr.unasat.verkeerslichten.datastructure.LinkQueue;
import sr.unasat.verkeerslichten.datastructure.LinkStack;

public class Wegdek {
    private String wegdekCode;
    Voertuig voertuig;
    private LinkQueue wegdekQueue = new LinkQueue();
    private LinkStack wegdekStack = new LinkStack();

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

    public LinkStack getVoertuigenStack() {
        return wegdekStack;
    }


}
