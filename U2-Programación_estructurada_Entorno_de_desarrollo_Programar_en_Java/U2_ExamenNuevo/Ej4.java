package com.company;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num = sc.nextInt();
        int nfinal = num+5;

        do {
            if (num%2==0 || num%3==0 || num%5==0 || num%7==0){
                System.out.println(num+" no es primo");
            }else{
                System.out.println(num+" es primo");
            }
            num++;
        } while (nfinal!=num);

    }

}
