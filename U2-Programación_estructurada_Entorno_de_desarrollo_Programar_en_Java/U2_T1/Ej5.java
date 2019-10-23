package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        char c='*';
        System.out.println("Dime la altura");
        tam = sc.nextInt();
        System.out.println("Introduce el caracter");
        c=sc.next().charAt(0);

        for (int i=0; i<tam; i++){
            for(int j=0;j<tam-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i=tam-1;i>=1;i--){
            for (int j=i;j<=tam;j++) {
                System.out.print(" ");
            }
            for (int j=i*2-1;j>0;j--){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
