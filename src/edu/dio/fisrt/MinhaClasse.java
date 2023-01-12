package edu.dio.fisrt;

public class MinhaClasse {
    public static void main (String [] args) {
        // System.out.print("hello world!");
        String firstName = "luke";
        String LastName = "Skywalker";

        String name = name (firstName,LastName);
        System.out.println(name);

    }

    public static String name (String firstName, String LastName) {
         return firstName.concat(" ").concat(LastName);
    }
}

