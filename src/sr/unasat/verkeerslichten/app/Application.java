package sr.unasat.verkeerslichten.app;

import sr.unasat.verkeerslichten.datastructure.LinkQueue;
import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.services.VerkeerService;

import static sr.unasat.verkeerslichten.util.Constants.WEGDEK;


public class Application {

    public static void main(String[] args) {
        // 1 pol 2 br 3 am
        // WEGDEK NOORD
//        System.out.println(WEGDEK[0].getWegdekCode());
        WEGDEK[0].fillWegdek(new Voertuig(1, 4));
        WEGDEK[0].fillWegdek(new Voertuig(2, 4));
        WEGDEK[0].fillWegdek(new Voertuig(3, 3));
        WEGDEK[0].fillWegdek(new Voertuig(4, 4));

        WEGDEK[1].fillWegdek(new Voertuig(1, 4));
        WEGDEK[1].fillWegdek(new Voertuig(2, 4));
        WEGDEK[1].fillWegdek(new Voertuig(3, 4));
        WEGDEK[1].fillWegdek(new Voertuig(4, 4));
        WEGDEK[1].fillWegdek(new Voertuig(5, 4));
        WEGDEK[1].fillWegdek(new Voertuig(6, 4));
        WEGDEK[1].fillWegdek(new Voertuig(7, 4));
        WEGDEK[1].fillWegdek(new Voertuig(8, 4));
        WEGDEK[1].fillWegdek(new Voertuig(9, 4));
        WEGDEK[1].fillWegdek(new Voertuig(10, 4));
        WEGDEK[1].fillWegdek(new Voertuig(11, 4));
        WEGDEK[1].fillWegdek(new Voertuig(12, 4));
        WEGDEK[1].fillWegdek(new Voertuig(13, 4));
        WEGDEK[1].fillWegdek(new Voertuig(14, 4));
        WEGDEK[1].fillWegdek(new Voertuig(15, 4));
        WEGDEK[1].fillWegdek(new Voertuig(16, 4));
        WEGDEK[1].fillWegdek(new Voertuig(17, 2));
        WEGDEK[1].fillWegdek(new Voertuig(18, 4));

        WEGDEK[2].fillWegdek(new Voertuig(1, 4));
        WEGDEK[2].fillWegdek(new Voertuig(2, 4));
        WEGDEK[2].fillWegdek(new Voertuig(3, 4));
        WEGDEK[2].fillWegdek(new Voertuig(4, 4));
        WEGDEK[2].fillWegdek(new Voertuig(5, 4));

        WEGDEK[3].fillWegdek(new Voertuig(1, 4));
        WEGDEK[3].fillWegdek(new Voertuig(2, 4));
        WEGDEK[3].fillWegdek(new Voertuig(3, 4));
        WEGDEK[3].fillWegdek(new Voertuig(4, 4));
        WEGDEK[3].fillWegdek(new Voertuig(5, 4));
        WEGDEK[3].fillWegdek(new Voertuig(6, 4));
        WEGDEK[3].fillWegdek(new Voertuig(7, 4));
        WEGDEK[3].fillWegdek(new Voertuig(8, 4));
        WEGDEK[3].fillWegdek(new Voertuig(9, 1));
        WEGDEK[3].fillWegdek(new Voertuig(10, 4));
        WEGDEK[3].fillWegdek(new Voertuig(11, 4));
        WEGDEK[3].fillWegdek(new Voertuig(12, 4));
        WEGDEK[3].fillWegdek(new Voertuig(13, 4));
        WEGDEK[3].fillWegdek(new Voertuig(14, 4));


        VerkeerService verkeerService = new VerkeerService();
        verkeerService.priorities();
        verkeerService.verkeerslichtOrder();
        verkeerService.reverse();




    }
}
