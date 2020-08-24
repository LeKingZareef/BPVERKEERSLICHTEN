package sr.unasat.verkeerslichten.services;

import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.entities.Wegdek;
import sr.unasat.verkeerslichten.util.Constants;

public class VerkeerService {

    public void prio () {
        for(int wegdekIndex = 0; wegdekIndex < Constants.STOPLICHT.length; ++wegdekIndex) {
            int items = Constants.WEGDEK[wegdekIndex].getWegdekQueue().findSize();

            for(int i = 0; i < items; ++i) {
                //int voertuig priority.
                int vrtPrio = Constants.WEGDEK[wegdekIndex].getWegdekQueue().getPrio();
                String vrtKent = Constants.WEGDEK[wegdekIndex].getWegdekQueue().getKenteken();

                Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();


//                if (this.wegdekLeeg(Constants.WEGDEK[wegdekIndex])) {
//                    System.out.println("\n****Alle auto's op wegdek " + Constants.WEGDEK[wegdekIndex].getWegdekCode() + " zijn opgereden****");
//                }
//
                if (vrtPrio == 3) {
                    Constants.WEGDEK[wegdekIndex].getWegdekQueue().deleteKey(new Voertuig(vrtKent, vrtPrio));
                    break;
                }

//                Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();

//                Voertuig priorityVoertuig = Constants.WEGDEK[wegdekIndex].getVoertuigenQueue().remove();

//                Constants.WEGDEK[wegdekIndex].getVoertuigenStack().push(priorityVoertuig);
//                this.priorityQueue.insert(priorityVoertuig);



            }
        }

//        for(wegdekIndex = 0; wegdekIndex <= this.priorityQueue.getnItems() + 1; ++wegdekIndex) {
//            System.out.println("De " + this.priorityQueue.remove().getKentekenNummer() + " rijdt op");
//        }
    }

    public void verkeerslichtOrder () {
        for(int wegdekIndex = 0; wegdekIndex < Constants.STOPLICHT.length; ++wegdekIndex) {
            switch (wegdekIndex) {
                case 0:
                    System.out.println(Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();
                    break;
                case 1:
                    System.out.println(Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();
                    break;
                case 2:
                    System.out.println(Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();
                    break;
                case 3:
                    System.out.println(Constants.WEGDEK[wegdekIndex].getWegdekCode());
                    Constants.WEGDEK[wegdekIndex].getWegdekQueue().displayList();
                    break;
            }
        }
    }

    private boolean wegdekLeeg(Wegdek wegdek) {
        return wegdek.getWegdekQueue().isEmpty();
    }



}
