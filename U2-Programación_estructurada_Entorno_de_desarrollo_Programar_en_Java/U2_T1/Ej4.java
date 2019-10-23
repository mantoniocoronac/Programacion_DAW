package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura");
        int altura = sc.nextInt();
        if(altura>=3){
            for (int j = 0; j <= altura/2; j++) {
                for (int i = j; i <= altura; i++) {
                    System.out.print(" ");
                }
                System.out.println("*     *");
            }


        } else {
            System.out.println("La altura debe ser mayor");
        }


    }
}
