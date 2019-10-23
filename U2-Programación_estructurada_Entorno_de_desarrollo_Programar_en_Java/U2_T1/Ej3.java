package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero entero positivo");
        int n = sc.nextInt();
        String binario = "";
        if (n>0){
            while (n>0) {
                if (n % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                n = n/2;
            }
        } else {
            System.out.println("No es entero positivo");
        }
        System.out.println("El numero en binario es: "+binario);
    }


    }

