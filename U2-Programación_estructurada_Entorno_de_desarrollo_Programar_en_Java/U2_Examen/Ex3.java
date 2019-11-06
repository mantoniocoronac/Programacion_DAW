package com.company;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero:");
        long num = sc.nextLong();
        String snum = String.valueOf(num);
        String aparece = "";
        String noaparece = "";

        if (snum.contains("0")) {
            aparece = aparece + "0 ";
        } else {
            noaparece = noaparece + "0 ";
        }
        if (snum.contains("1")) {
            aparece = aparece + "1 ";
        } else {
            noaparece = noaparece + "1 ";
        }
        if (snum.contains("2")) {
            aparece = aparece + "2 ";
        } else {
            noaparece = noaparece + "2 ";
        }
        if (snum.contains("3")) {
            aparece = aparece + "3 ";
        } else {
            noaparece = noaparece + "3 ";
        }
        if (snum.contains("4")) {
            aparece = aparece + "4 ";
        } else {
            noaparece = noaparece + "4 ";
        }
        if (snum.contains("5")) {
            aparece = aparece + "5 ";
        } else {
            noaparece = noaparece + "5 ";
        }
        if (snum.contains("6")) {
            aparece = aparece + "6 ";
        } else {
            noaparece = noaparece + "6 ";
        }
        if (snum.contains("7")) {
            aparece = aparece + "7 ";
        } else {
            noaparece = noaparece + "7 ";
        }
        if (snum.contains("8")) {
            aparece = aparece + "8 ";
        } else {
            noaparece = noaparece + "8 ";
        }
        if (snum.contains("9")) {
            aparece = aparece + "9 ";
        } else {
            noaparece = noaparece + "9 ";
        }
        System.out.println("Dígitos que aparecen en el número: " + aparece +" ");
        System.out.println("Dígitos que no aparecen: " + noaparece + " ");
    }


}
