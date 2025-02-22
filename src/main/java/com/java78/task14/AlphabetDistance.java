package com.java78.task14;

import java.util.Scanner;

/*
Write an application that reads two lowercase letters of the Latin alphabet (type char)
and calculates how many characters is there in the alphabet between given letters.
Hint - use the ASCII code table and treat the characters as int numbers.

- intervalul inchis [a,b] => a <= x <=b
- intervalul deschis (a,b) => a< x < b <=> a+1 >= c <= b-1
 */
public class AlphabetDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti prima litera: ");
        char letter1 = sc.next().charAt(0);

        System.out.println("Introduceti a doua litera: ");
        char letter2 = sc.next().charAt(0);

        if (!Character.isLowerCase(letter1) || !Character.isLowerCase(letter2)){
            System.out.println("Cel putin unul dintre caractere nu este o litera mica");
            return;
        }
        int ascii1 = (int) letter1;
        int ascii2 = (int) letter2;

        int distance = Math.abs(ascii1 -ascii2) -1; // Math.abs = modul (-5) = |-5| = 5
        System.out.println("Distanta dintre "+ letter1 + "si " + letter2 + "este: " + distance);
    }
}
