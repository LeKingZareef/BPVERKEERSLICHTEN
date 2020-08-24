package sr.unasat.verkeerslichten.entities;

//Kenteken PA 22-11
//Priority 1 = POL, 2 = BRA, 3 = AMB, 4 = NRM

public class Voertuig {
    private String kenteken;
    private int priority;

    public Voertuig(String kenteken, int priority) {
        this.kenteken = kenteken;
        this.priority = priority;
    }

    public String getKenteken() {
        return kenteken;
    }


    public int getPriority() {
        return priority;
    }


    @Override
    public String toString() {
        return "Voertuig{" +
                "kenteken='" + kenteken + '\'' +
                ", priority=" + priority +
                '}';
    }
}
