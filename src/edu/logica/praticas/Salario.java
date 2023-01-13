package edu.logica.praticas;
import java.util.Scanner;

public class Salario {
    public static void main (String [] args) {
        try (Scanner in = new Scanner(System.in)) {
         System.out.println("Digite sua jornada de trabalho (em horas!)");
             int hT = in.nextInt();
 
            System.out.println("Digite quanto você recebe por hora?");
             int vT = in.nextInt(); 

             int salarioBruto = CalcularSalarioBruto(hT, vT);
             System.out.println(" O seu salário bruto  é " + "R$" + salarioBruto + " \n ");

             double taxa = 2.5;
             int totalDesconto = DescontarSalarioBruto(taxa, salarioBruto);
             System.out.println(" O desconto em seu salário é no valor de: ");

             
         }
     }
 
     public static int CalcularSalarioBruto (int hT, int  vT) {
          return (hT * vT); 
     }

     public static int DescontarSalarioBruto (double taxa, int  salarioBruto) {
          return (int) (taxa * salarioBruto); 
     }
    
}
