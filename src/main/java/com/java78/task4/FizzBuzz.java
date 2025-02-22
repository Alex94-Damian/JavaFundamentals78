package com.java78.task4;

/*Write an application that takes a positive number from the user (type int)
and writes all numbers from 1 to the given number, each on the next line, with the
following changes:
● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        //Citirea
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();

        //Logica business
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 ==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);

            }

        }
        }else {
            System.out.println("Invalid input, n trebuie sa fie mai mare sau egal cu 1");
        }
    }
}
