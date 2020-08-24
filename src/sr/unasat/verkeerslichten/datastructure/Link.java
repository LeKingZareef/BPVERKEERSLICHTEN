package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Link {
    Voertuig voertuig;
    public Link next; // next link in list

    // -------------------------------------------------------------
    public Link(Voertuig voertuig) // constructor
    { this.voertuig = new Voertuig(voertuig.getNummer(), voertuig.getPriority()); }
    // -------------------------------------------------------------
    public void displayLink() // display this link
    {
        System.out.print("\nVoertuig " + this.voertuig.getKenteken() + ", met als priority "+ this.voertuig.getPriority() + " rijd door");
    }


}
