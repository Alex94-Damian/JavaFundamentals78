package com.java78.task12;

import java.util.Scanner;

public class SpaceProcentage {


/* Write an application that reads a text from the user (type String) and counts a percentage
of occurrences of a space character.
- String = asemeni tipurilor de date primitive instanteaza variabile
in timp ce tipurile de date dinamice/wrapper instantiaza obiecte (Integer, Double, Float, Long, StringBugger,
StringBuldere etc.
 */
public static void main(String[] args) {
    int n= 2; // variabila
    Integer m =2; //obiect

    //Object = este o clasa obiect de tipul enitate care se comporta ca o superclasa pt toate clasele de obiect
    // clasa de obiect Catel - mosteneste toate atributile si metodele din Onject ( hasAndEquals(), toString(),
    // constructors template; equals() etc_


    //Input: Ana are mere si pere si coacaze
    // 6 spatii
    //31 caractere
    // 6/31*100= ?

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduceti un text: ");
    String input = scanner.nextLine();
    /**
     * scanner.next() = citeste un string pana la prima intalnire a primului caracter alb de orice fel
     * scanner.nextLine() = citeste un string pana la prima intalnire a primului caracter alb de tipul NEW LINE (enter)
     * caracter alb - space. enter etc
     */

    if (input.isEmpty()) {
        System.out.println("Textul este empty. Procentajul space-uriloe este : 0%");
        return;
    }
    System.out.println("Procentajul space-urilor este: " + calculateSpacePercentage(input));

}

    private static double calculateSpacePercentage(String input) {

    int contor = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' '){
                contor++;
            }

        }

    // cea mai optima rezolvare a problemelor de frecventa si numarare de apartii este cea cu MAP -> HASMAP/TREEMAP
        // todo: exercitiu freq map

    return (double) contor / input.length()*100;

    }

}
