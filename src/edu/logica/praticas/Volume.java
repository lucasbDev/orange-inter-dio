package edu.logica.praticas;

import java.util.Scanner;

public class Volume {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite a altura da lata");
            double altura = in.nextInt();

            System.out.println("Digite o raio da lata");
            double raio = in.nextInt();

            double volume = 0;

            double calculo = CalcularVolume(altura,raio,volume);
            System.out.println(" esse é o volume da lata " + calculo );
        }
    }

    public static double CalcularVolume (double altura, double raio, double volume) {
        return ( volume = 3.14 * Math.pow(raio,2) * altura);
    }
}
