package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo:");
        int numero = sc.nextInt();

        System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
        int partir = sc.nextInt();

        int copy_num = numero;
        int longitud = 0;
        while (copy_num!=0){
            copy_num = copy_num/10;
            longitud++;
        }

        if (longitud<2){
            System.out.println("No es valido");
        } else if (partir<2 || partir>longitud){
            System.out.println("No es valido");
        } else {
            int aux = numero;
            for (int i = 0; i<=longitud-partir; i++){
                numero = numero/10;
            }
            System.out.print("Los numeros partidos son "+numero);
            for (int i = 0; i<=longitud-partir; i++){
                numero = numero*10;
            }
            System.out.print(" y "+(aux-numero));
        }

    }

}
