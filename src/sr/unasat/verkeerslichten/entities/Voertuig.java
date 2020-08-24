package sr.unasat.verkeerslichten.entities;

//Kenteken PA 22-11
//Priority 1 = POL, 2 = BRA, 3 = AMB, 4 = NRM

import java.util.Random;

public class Voertuig {
    private String kenteken;
    private int priority;
    private int nummer;

    public Voertuig(int nummer, int priority) {
        this.nummer = nummer;
        this.priority = priority;
        this.kenteken = genKenteken();
    }

    private String  genKenteken() {
        if (priority <= 3) {
            switch (this.priority) {
                case 1:
                    this.kenteken = "Politie";
                    break;
                case 2:
                    this.kenteken = "Barandweer";
                    break;
                case 3:
                    this.kenteken = "Ambulance";
                    break;
            }
            return this.kenteken;
        } else {
            Random randNum = new Random();
            String numberOne = String.format("%02d", randNum.nextInt(100 - 0));
            String numberTwo = String.format("%02d", randNum.nextInt(100 - 0));
            String kentekenNr = "PK" + numberOne + "-" + numberTwo;
            return kentekenNr;
        }
    }

    public String getKenteken() {
        return this.kenteken;
    }

    public int getNummer() {
        return this.nummer;
    }


    public int getPriority() {
        return this.priority;
    }
}
