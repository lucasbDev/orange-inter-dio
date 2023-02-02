package edu.logica.praticas;

import java.util.Scanner;

public class Conversor {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em ° Fahrenheit!");
            double Fahrenheit = in.nextInt();

            double Celsius = 0;

            double conversao = Converter(Fahrenheit,Celsius);
            System.out.println(" Essa é a temperatura convertida para escala Celsius! " + conversao );
        }
    }


    public static double Converter (double Fahrenheit, double Celsius) {
        return ( Celsius = (Fahrenheit - 32) * 5 / 9);
    }
}

