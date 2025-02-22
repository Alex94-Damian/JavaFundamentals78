package com.java78.task13;
/*
 Write an application that "stutters", that is, reads the user's text (type String), and prints
the given text, in which each word is printed twice.
 For example, for the input: "This is my test" the application should print "This This is is
my my test test"
 */

/**
 * suprascrierea = procedeeul de a redefini implemntarea unei metode intr-o relatie de mostenire intre clasa
 * - clasa copil mostensete o metoda pe care o redefineste dupa bunul plac fiinf usor diferita fata de cea din cclasa
 * parinte
 * - metodele sunt marcate de anotatia @Override
 *
 * supraincarcarea = este procedul de reutilizare a denumirii unei metode cu semnaturi diferite
 * - se poate intalni la nivelul de clasa
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringStutters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un text: ");
        String input = sc.nextLine();


        // Split original string to an arrays os strings
        String[] wordsArray = input.split(" ");
        List<String> wordsList = new ArrayList<>(List.of(wordsArray));  // conversie de la array la list

        StringBuilder stutterText = new StringBuilder();
        for (String it: wordsList) {
            //builder chain = e o modalitate de apelare continua a metodelor care intoc ca si rezultat obiectul apelant
            stutterText
                    .append(it)
                    .append(" ")
                    .append(it)
                    .append(" ");
        }
        System.out.println("Textul cu fiecare cuv dublat este: \n" + stutterText);
    }
}
