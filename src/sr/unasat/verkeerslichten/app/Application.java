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
        WEGDEK[0].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1124", 3));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1125", 4));

        WEGDEK[1].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1124", 2));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1125", 4));

        WEGDEK[2].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[2].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[2].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[2].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[2].fillWegdek(new Voertuig("PG 1125", 4));

        WEGDEK[3].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1122", 1));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1124", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1125", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[3].fillWegdek(new Voertuig("PG 1123", 4));


        VerkeerService verkeerService = new VerkeerService();
        verkeerService.verkeerslichtOrder();


    }
}
