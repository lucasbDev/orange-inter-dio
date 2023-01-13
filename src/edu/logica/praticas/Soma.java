package edu.logica.praticas;
import java.util.Scanner;

public class Soma {
    public static void main (String [] args) {
       try (Scanner in = new Scanner(System.in)) {
        System.out.println("Digite um número");
            int a = in.nextInt();

           System.out.println("Digite outro número");
            int b = in.nextInt(); 

            int result = Somar (a,b);
            System.out.println(" A soma é " + result + " \n ");
        }
    }

    public static int Somar (int numA, int  numB) {
         return (numA + numB); 
    }

}



