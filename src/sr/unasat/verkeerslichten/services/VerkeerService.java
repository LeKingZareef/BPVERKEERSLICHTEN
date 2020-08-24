package sr.unasat.verkeerslichten.services;

import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.entities.Wegdek;
import sr.unasat.verkeerslichten.util.Constants;

public class VerkeerService {

    public void prio () {
        for(int wegdekIndex = 0; wegdekIndex < Constants.STOPLICHT.length; ++wegdekIndex) {

//            Constants.WEGDEK[wegdekIndex].getWegdekQueue().deleteKey(new Voertuig("PG 1124", 3));

//                int vrtPrio = Constants.WEGDEK[wegdekIndex].getWegdekQueue().getPrio();
//                String vrtKent = Constants.WEGDEK[wegdekIndex].getWegdekQueue().getKenteken();
//
//                System.out.println(vrtPrio);
//                System.out.println(vrtKent);

//            int items = Constants.WEGDEK[wegdekIndex].getWegdekQueue().findSize();
//
//            for(int i = 0; i < items; ++i) {
//                int autoNummer = Constants.WEGDEK[wegdekIndex].getWegdekQueue().displPrio();
//
//            }

        }

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
