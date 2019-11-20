package com.company;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura de los calcetines: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 14; j++) {
                if (i == altura - 2 && j < 6 || i == altura - 1 && j < 6 || j == 0 || j == 1 || j == 2 || j == 8 || j == 9 || j == 10 || i == altura - 2 && j > 8 || i == altura - 1 && j > 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}
