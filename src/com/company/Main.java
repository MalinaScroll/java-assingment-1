package com.company;

public class Main {

    public static void main(String[] args) {
        //assignment 1.1
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript");

        //assignment 1.2
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is geweldig!");
        }

        //assignment 1.3
        System.out.println("a   a^2  a^3  a^4 \n" + "1    1    1    1 \n" + "2    4    8    16 \n" + "3    9    27   81 \n" + "4    16   64   256");

        //assignment 1.4
        System.out.println((7.5 * 6.5 - 4.5 * 3) / (47.5 * 5.5));

        //assignment 1.5
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 +9 + 10);

        //assignment 1.6
        System.out.println(4 * (1 - 0.33 + 0.20 - 0.14 + 0.11 - 0.09 + 0.07));

        // assignment 1.7
        double π = 3.14159;
        double straal = 6.5;
        System.out.println("oppervlakte = " + straal * straal * π + "\n" + "omtrek = " + 2 * straal * π);

        //assignment 1.8
        double lengte = 5.3;
        double breedte = 8.6;
        System.out.println("oppervlakte = " + lengte * breedte + "\n" + "omtrek = " + 2 * ( lengte + breedte));

    }
}
