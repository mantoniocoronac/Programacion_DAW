package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Dime la nota del primer examen");
        float e1 = sc.nextFloat();
        System.out.println("Dime la nota del segundo examen");
        float e2 = sc.nextFloat();
        System.out.println("Dime la nota del tercer examen");
        float e3 = sc.nextFloat();

        float sumae = e1+e2+e3;
        float media = sumae/3;
        String recuperacion = new String();
        recuperacion = sc.nextLine();

        if (media>=5){
            if (media>=5 && media<6){
                System.out.println("Tu nota de programación es "+media+" - Suficiente");
            } else if (media>=6 && media <7){
                System.out.println("Tu nota de programación es "+media+" - Bien");
            }else if (media>=7 && media <9){
                System.out.println("Tu nota de programación es "+media+" - Notable");
            }else {
                System.out.println("Tu nota de programación es "+media+" - Sobresaliente");
            }

        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            recuperacion = sc.nextLine();
            if (recuperacion.equals("apto")){
                System.out.println("Tu nota de Programación es 5 - Suficiente");
            } else if (recuperacion.equals("no apto")) {
                System.out.println("Tu nota de Programación es "+media+" -Suspenso");
            }

        }

    }
}
