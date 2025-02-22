package com.java78.task3;
/*Write a program for solving a quadratic equation. The program should take
 three integers (coefficients of the quadratic equation a, b, c) and calculate
  the roots of the equation If delta ∆ comes out negative, print "Delta negative"
  and exit the program. Formulas you’ll need:
  eq ax^2 + bx + c= 0
  delta = b^2 - 4ac
  x1,2 = (-b +-sqrt(delta))/2a
 */

import javax.xml.transform.Source;
import java.util.Scanner;

public class QuadEq {
    public static void main(String[] args) {

        //Citire
        Scanner sc = new Scanner(System.in);

        System.out.print("a =");
        int a = sc.nextInt();

        System.out.print("b =");
        int b = sc.nextInt();

        System.out.print("c =");
        int c = sc.nextInt();


        //Business logic
        double delta = Math.pow(b , 2) - (4*a*c);
        System.out.println("delta = "+ delta);

        //Daca delta e negativ, se termina programul
        if (delta < 0 ) {
            System.out.println("Delta este negativ! Oopsie!");
            return;
        }

            //Daca delta e negativ, se termina programul
            double x1,x2;
            if (delta == 0) {
                x1 = x2 = -b / (2.0 * a);
                System.out.println("Root = " +x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
                x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
                System.out.println("Root x1= " + x1);
                System.out.println("Root x2= " + x2 );
            }




        //Afisare



    }
}
