package com.company;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducza horas:");
        int horas = sc.nextInt();
        System.out.println("Introduzca minutos:");
        int minutos = sc.nextInt();
        System.out.println("Introduzca segundos");
        int segundos = sc.nextInt();
        System.out.println("Introduzca segundos a incrementar");
        int incremento = sc.nextInt();

        System.out.println("Aumentando la hora...");

        for (int i = 0; i <incremento-1 ; i++) {
            if (segundos>=59){
                if (segundos==59) {
                    if (minutos + 1 == 60) {
                        if (horas+1 == 24){
                            System.out.println("0:0:0");
                        }else {
                            System.out.println((horas + 1) + ":0:0");
                        }
                    } else {
                        System.out.println(horas + ":" + (minutos + 1) + ":0");
                    }
                }
                segundos = 0;
                minutos++;

                if (minutos==60){
                    minutos=0;
                    horas++;
                }
                if (horas==24){
                    horas=0;
                }

            }
            segundos++;

            System.out.println(horas + ":" + minutos + ":" + segundos);
        }



    }

}
