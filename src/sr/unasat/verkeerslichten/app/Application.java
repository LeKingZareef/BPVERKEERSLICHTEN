/*
In this package you can find the main class.
All the directories needs to be inserted here.
All the libraries needed needs to be imported here.
Author: Zareef Soetodrono.
Date:   19 november 2019.
Email:  zareef.soetodrono@gmail.com
*/

package sr.unasat.verkeerslichten.app;

import sr.unasat.verkeerslichten.datastructure.Link;
import sr.unasat.verkeerslichten.datastructure.LinkedList;
import sr.unasat.verkeerslichten.datastructure.Queue;
import sr.unasat.verkeerslichten.entities.Voertuig;
import sr.unasat.verkeerslichten.services.VerkeerService;
import sr.unasat.verkeerslichten.util.Constants;

import static sr.unasat.verkeerslichten.util.Constants.WEGDEK;


public class Application {

    public static void main(String[] args) {


//        System.out.println(WEGDEK[0].getWegdekCode());
//        System.out.println(WEGDEK[1].getWegdekCode());
//        System.out.println(WEGDEK[2].getWegdekCode());
//        System.out.println(WEGDEK[3].getWegdekCode());

//        Queue queue = new Queue(3);
//        queue.enqueue(new Voertuig("", 4));
//        queue.enqueue(new Voertuig("AP 003", 1));
//        queue.enqueue(new Voertuig("PK 1124", 4));

//        LinkedList theList = new LinkedList(); // make new list
//        theList.insertFirst(new Voertuig("PG 1122", 4)); // insert four items
//        theList.insertFirst(new Voertuig("PG 1123", 4)); // insert four items
//        theList.insertFirst(new Voertuig("PG 1124", 3)); // insert four items
//        theList.insertFirst(new Voertuig("PG 1125", 4)); // insert four items
//        theList.displayList(); // display list
//
//        theList.deleteKey(new Voertuig("PG 1122", 4));
//
//        theList.displayList(); // display list



        // WEGDEK NOORD
//        System.out.println(WEGDEK[0].getWegdekCode());
        WEGDEK[0].fillWegdek(new Voertuig("PG 1122", 4));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1123", 4));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1124", 3));
        WEGDEK[0].fillWegdek(new Voertuig("PG 1125", 4));
//        WEGDEK[0].getWegdekQueue().displayList();
//        System.out.println(WEGDEK[0].getWegdekQueue().findSize());

//        System.out.println(WEGDEK[1].getWegdekCode());
        WEGDEK[1].fillWegdek(new Voertuig("PG 1126", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1127", 4));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1128", 3));
        WEGDEK[1].fillWegdek(new Voertuig("PG 1129", 4));
//        WEGDEK[1].getWegdekQueue().displayList();
//        System.out.println(WEGDEK[1].getWegdekQueue().findSize());

        System.out.println("======================");


        VerkeerService verkeerService = new VerkeerService();
        verkeerService.prio();
        verkeerService.verkeerslichtOrder();


    }
}
