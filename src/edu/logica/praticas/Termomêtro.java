package edu.logica.praticas;

import java.util.Scanner;

public class Termomêtro {
        public static void main (String [] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Digite a temperatura em ° Celcius");
                double Celcius = in.nextInt();

                double Fahrenheit = 32;

                double conversao = Converter(Fahrenheit,Celcius);
                System.out.println(" Essa é a temperatura convertida para escala Fahrenheit! " + conversao);
        }
    }

    public static double Converter (double Fahrenheit, double Celsius) {
        return ( Fahrenheit = (9 * Celsius + 160) / 5);
    }
}

