package com.company;

import java.util.Scanner;

public class U3Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] tablero= new String[8][8];
        System.out.println("Dime la posicion");
        String pos1 = sc.nextLine();
        String pos2 = sc.nextLine();


        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j <tablero[i].length ; j++) {
                if (tablero[i][j].equals(tablero[Integer.parseInt(pos1)][Integer.parseInt(pos2)])){

                }
            }

        }
    }


}
