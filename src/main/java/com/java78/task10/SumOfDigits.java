package com.java78.task10;

/*  Write an application that gets one positive number (type int) from the user and calculates
a sum of digits of the given number. Hint: to make some operations on every single digit
of the number (digit by digit), you can calculate the remainder of dividing the number by
10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
digit). */

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar pozitiv: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Numarul introdus nu este pozitiv. Va rugam reincercati");
            return; // similar lui break
        }

        System.out.println("Suma cifrelor lui " +n + " este " + getSumOfDigits(n));


    }
        // number = 8761237624
        // sum = 0
        // 8761237624 4 -> sum = 4 ( %, /)
        //87612376 2    -> 4 + 2 = 6
       // 8 -> sum = ? + 8 = (% /)
    //    0 -> conditie terminala

    private static int getSumOfDigits(int number) {
        // prelucram number = n
        // Initializare rezultat returnabil
        int sum = 0;

       // Calculare rezultate returnabil
        while (number != 0) { // fie !=0, fie >0
            int digit = number % 10; // calculam restum imparitii la 10, ex: 877 % 10 = cat 87 , rest 7
            sum = sum + digit; // see actualizeaza valuarea sumei prin insumarea ultimei cifre preluate din nr original
            number = number / 10; // eliminam ultima cifra, pt a putea avansa in numar , ex : 877 / 10 = 87
        }

        /** Ce este o conditie de avansare?
         * O conditie de avansare intr-o instructiune repetitica este cea care asigura evitarea unei bucle infinite.
         * for -? i++ , incremetarea controlului indifrent de pas
         *  while / do while -> ultima instruvtiune din blocul de cod (number /= 10)
        * */


        // Returnare rezultatului
        return sum;
    }
}
