package sr.unasat.verkeerslichten.services;

import sr.unasat.verkeerslichten.datastructure.PriorityQueue;
import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.entities.Wegdek;
import sr.unasat.verkeerslichten.util.Constants;

public class VerkeerService {
    PriorityQueue priorityQueue = new PriorityQueue();

    public void prio () {

    }

    public void verkeerslichtOrder () {
        for(int wegdekIndex = 0; wegdekIndex < Constants.STOPLICHT.length; ++wegdekIndex) {
            switch (wegdekIndex) {
                case 0:
                    System.out.println(Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getVoertuigenQueue().displayQueue();
                    break;
                case 1:
                    System.out.println("\n" + Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getVoertuigenQueue().displayQueue();
                    break;
                case 2:
                    System.out.println("\n" + Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getVoertuigenQueue().displayQueue();
                    break;
                case 3:
                    System.out.println("\n" + Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getVoertuigenQueue().displayQueue();
                    break;
            }
        }
    }

    private boolean wegdekLeeg(Wegdek wegdek) {
        return wegdek.getVoertuigenQueue().isEmpty();
    }



}
