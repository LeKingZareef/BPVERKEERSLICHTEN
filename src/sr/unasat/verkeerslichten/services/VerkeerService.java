package sr.unasat.verkeerslichten.services;

import sr.unasat.verkeerslichten.datastructure.LinkPriorityQueue;
import sr.unasat.verkeerslichten.datastructure.Node;
import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.entities.Wegdek;
import static sr.unasat.verkeerslichten.util.Constants.WEGDEK;
import static sr.unasat.verkeerslichten.util.Constants.STOPLICHT;

public class VerkeerService {
    LinkPriorityQueue priorityQueue = new LinkPriorityQueue();

    Node theTree = new Node("PK00-00", null);


    public void priorities() {


        for (int wegdekIndex = 0; wegdekIndex < STOPLICHT.length; wegdekIndex++) {
            int items = WEGDEK[wegdekIndex].getVoertuigenQueue().size();

            for (int i = 0; i < items; i++) {

                int autoNummer = WEGDEK[wegdekIndex].getVoertuigenQueue().peekFirst();

                if (autoNummer <= 3) {
                    Voertuig priorityVoertuig = WEGDEK[wegdekIndex].getVoertuigenQueue().remove();
                    WEGDEK[wegdekIndex].getVoertuigenStack().push(priorityVoertuig);
                    priorityQueue.insert(priorityVoertuig);
                    continue;
                }
            }

        }
        for (int i = 0; i <= priorityQueue.getnItems() + 1; i++) {
            System.out.println("De " + priorityQueue.remove().getKenteken() + " rijdt op ");
            System.out.println();
        }

    }



    public void verkeerslichtOrder() {
        double rounds = 0;

        for (int wegdekIndex = 0; wegdekIndex < WEGDEK.length; wegdekIndex++) {

            if (wegdekLeeg(WEGDEK[wegdekIndex])) {
                System.out.println(WEGDEK[wegdekIndex].getWegdekCode() + " is leeg");
                if (wegdekIndex == 3) {
                    if (wegdekLeeg(WEGDEK[0]) && wegdekLeeg(WEGDEK[1]) && wegdekLeeg(WEGDEK[2]) && wegdekLeeg(WEGDEK[3])){
                        System.out.println("\n Alle voertuigen zijn opgereden");
                        System.out.println("\n Totaal aantal rondes: " + Math.round(rounds /4));
                        return;
                    }else {
                        wegdekIndex = -1;
                    }

                }
            }
            else {
                switch (wegdekIndex) {
                case 0:
                    System.out.println(WEGDEK[wegdekIndex].getWegdekCode());
                    Noord(WEGDEK[wegdekIndex]);
                    System.out.println();

                    break;
                case 1:
                    System.out.println();
                    System.out.println("\n" + WEGDEK[wegdekIndex].getWegdekCode());
                    Zuid(WEGDEK[wegdekIndex]);
                    System.out.println();

                    break;
                case 2:
                    System.out.println("\n" + WEGDEK[wegdekIndex].getWegdekCode());
                    Oost(WEGDEK[wegdekIndex]);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n" + WEGDEK[wegdekIndex].getWegdekCode());
                    West(WEGDEK[wegdekIndex]);
                    System.out.println();
                    wegdekIndex = -1;
                    break;

                default:

                    break;

                }

            }
            rounds++;
        }
    }


    public void normal(Wegdek wegdek) {
        for (int i = 0; i < 5; i++) {
            oprijden(wegdek);

            if (wegdekLeeg(wegdek)) {
                System.out.println(wegdek.getWegdekCode() + " geen voertuigen meer");
                break;
            }
        }

    }

    public void oprijden (Wegdek wegdek) {
        Voertuig voertuig = wegdek.getVoertuigenQueue().remove();

        System.out.println("Voertuig " + voertuig.getKenteken() + " rijdt op");
        wegdek.getVoertuigenStack().push(voertuig);
    }

    private void Noord(Wegdek wegdek) {

        if (wegdek.getVoertuigenQueue().size() < 5) {

            int items = wegdek.getVoertuigenQueue().size();
            for (int i = 0; i < items; i++) {
                oprijden(wegdek);

                if (wegdekLeeg(wegdek)) {
                    System.out.println("Noord geen voertuigen meer");
                }
            }
        } else {
            normal(wegdek);
        }

    }


    public void Zuid(Wegdek wegdek) {
        if (wegdek.getVoertuigenQueue().size() > 10) {

            for (int i = 0; i < 10; i++) {
                oprijden(wegdek);
            }
        } else {
            normal(wegdek);
        }

    }

    public void Oost(Wegdek wegdek) {
        if (!wegdekLeeg(wegdek)) {
            normal(wegdek);
        }

    }

    public void West(Wegdek wegdek) {
        if (wegdek.getVoertuigenQueue().size() > 10) {

            for (int i = 0; i < 10; i++) {
                oprijden(wegdek);
            }
        } else {
            normal(wegdek);
        }
    }

    private boolean wegdekLeeg(Wegdek wegdek) {
        return wegdek.getVoertuigenQueue().isEmpty();
    }






    public void reverse() {
        System.out.println("\n\n Reverse All \n\n");

        for (int wegdekIndex = STOPLICHT.length - 1; wegdekIndex >= 0; wegdekIndex--) {

            System.out.println("\nDe voertuigen op wegdek " + WEGDEK[wegdekIndex].getWegdekCode() + " rijden terug");
            initalPosition(WEGDEK[wegdekIndex]);
            toWegdek(WEGDEK[wegdekIndex]);
        }
    }

    private void initalPosition(Wegdek wegdek) {
        int items = wegdek.getVoertuigenStack().getnItems();

        for (int i = 0; i < items; i++) {
            terugRijden(wegdek);

            if (wegdekReverseLeeg(wegdek)) {
                System.out.println("\nTerug in positie");
            }
        }
    }


    private void toWegdek(Wegdek wegdek){
        int items = wegdek.getVoertuigenQueue().size();

        for (int i = 0; i < items; i++) {
            Voertuig voertuig = wegdek.getVoertuigenQueue().remove();
            System.out.println("Voertuig " + voertuig.getNummer() + " - " + voertuig.getKenteken() + " terug in " + wegdek.getWegdekCode());

            if (wegdekLeeg(wegdek)) {
                continue;
            }
        }

    }

    private void terugRijden(Wegdek wegdek){
        Voertuig voertuig = wegdek.getVoertuigenStack().pop();
        theTree.put(voertuig.getKenteken(), voertuig);
        theTree.buildTree(theTree);
        System.out.println("Voertuig " + voertuig.getKenteken() + " rijd terug");
        wegdek.getVoertuigenQueue().insertReverse(voertuig);
    }

    private boolean wegdekReverseLeeg(Wegdek wegdek){
        if (wegdek.getVoertuigenStack().isEmpty()){
            return true;
        }
        return false;
    }


    public void search (String kenteken) {
        Voertuig voertuig= theTree.get(kenteken);
        if (voertuig!= null){
            System.out.println(voertuig.getKenteken());
        }else{
            System.out.println("Geen auto Gevonden!");
        }

//        System.out.println();
//
//        System.out.println(voertuig.getPriority());
    }



}


