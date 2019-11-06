package com.company;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un\n" +
                "número primo:");
        double media = 0;
        int num = sc.nextInt();
        boolean esprimo;
        int mayor = num;
        int menor = num;
        int contador = 1;

        esprimo = true;

        for (int i = 2; i<num-1; i++) {
            if (num%i==0) {
                esprimo = true;
                break;
            } else {
                esprimo = false;
            }
        }

        while (esprimo=true ) {
            if (num>mayor){
                mayor = num;
            }
            if (num<menor){
                menor = num;
            }

            media = (num+media)/contador;

            contador++;

            num = sc.nextInt();

            for (int i = 2; i<num-1; i++) {
                if (num%i==0) {
                    esprimo = true;
                    break;
                } else {
                    esprimo = false;
                }
        }


        }
        System.out.println("Ha introducido "+(contador-1)+" números no primos");
        System.out.println("Máximo: "+mayor);
        System.out.println("Mínimo: "+menor);
        System.out.println("Media: "+media);

    }
}
