package com.java78.task1;

/* Write an application that will read diameter of a circle (variable of type float) and
 calculate perimeter of given circle. Firstly, assume π = 3.14.
 Later, use value of π from built-in Math class

 psvm = shortcut pt public static void main (..)
 */

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {

        // definire scanner + Citire diamentru
        Scanner sc = new Scanner(System.in);   //sc stie sa citeasca valori de la consola
        System.out.print("Introdu valoarea diametrului de cerc :");
        float diamentru = sc.nextFloat();

        // Definim valoarea lui PI

        final float piC = 3.14f;
        // Solutia 1 - piC = variabila constanta hardcodata
        // f converteste valoarea default double la float
        // final - keyword pentru constanta


        // Calculam perimetrul cercului
        double perimeterC = piC * diamentru;

        //Afisam perimetrul
        System.out.println("Perimenter C: " + perimeterC);

        // Solutia 2

        final double piM = Math.PI;
        double perimeterM = piM * diamentru;
        System.out.println("Perimeter M: " + perimeterM);


    }
}
