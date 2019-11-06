package com.company;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase();

        String vocales = "aeiou";
        int contador = 0;
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es "+contador);
    }

}
