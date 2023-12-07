package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        System.out.println("ingrese la frase para invertir: ");
        String palabra = ingrese.nextLine();
        System.out.println("la frase invertida es: " + reversa(palabra));
    }
    public static String reversa(String palabra){
        String original = palabra;
        String reversa = "";
        for (int i = original.length() - 1; i >= 0; i--) reversa += palabra.charAt(i);
        return reversa;
    }

}