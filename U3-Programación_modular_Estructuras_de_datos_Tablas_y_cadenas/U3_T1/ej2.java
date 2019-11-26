package com.company;

import javax.naming.PartialResultException;

public class ej2 {

    public static void main(String[] args) {
        int [][] tam = new int[5][6];
        int suma=0;

        for (int i = 0; i < tam.length; i++) {
            for (int j = 0; j <tam[i].length ; j++) {
                if (i == tam.length -1 || j ==tam[i].length - 1){
                    tam[i][j] = 0;
                }else {
                    tam[i][j] = (int) (Math.random()*9+1);
                }
                System.out.println();
            }

        }
    }

}
