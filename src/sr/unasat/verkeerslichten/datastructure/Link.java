package sr.unasat.verkeerslichten.datastructure;

import sr.unasat.verkeerslichten.entities.Voertuig;

public class Link {
    Voertuig voertuig;
    public Link next; // next link in list
    public Link previous; // previous link in list

    public Link(Voertuig voertuig) // constructor
    {
        this.voertuig = new Voertuig(voertuig.getKenteken(), voertuig.getPriority());

    } // set to null)
    // -------------------------------------------------------------
    public void displayLink() // display
    {
        System.out.print("\nVoertuig " + this.voertuig.getKenteken() + ", met als priority "+ this.voertuig.getPriority() + " rijd door");
    }

    public void getPrio() // display
    {
        System.out.println(this.voertuig.getPriority());
//        System.out.print("\nVoertuig " + this.voertuig.getKenteken() + ", met als priority "+ this.voertuig.getPriority() + " rijd door");
    }
}
