package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroInvertido = 0;
        System.out.println("Introduce un numero entero positivo");
        long numero = sc.nextLong();
        long primern = numero;

        while (numero>0){
            numeroInvertido = (numeroInvertido * 10) + (numero % 10 );
            numero = numero / 10;
        }
        if (numeroInvertido == primern){
            System.out.println("El "+primern+ " es capicúa");
        } else {
            System.out.println("El "+primern+ " no es capicúa");
        }
    }

}
