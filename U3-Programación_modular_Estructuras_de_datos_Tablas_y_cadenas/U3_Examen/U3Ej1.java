package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class U3Ej1 {

    public static float[] mediaVectores(int [] v1,int [] v2){
        int largo;
        int corto;
        if (v1.length>v2.length){
            largo = v1.length;
            corto = v2.length;
        }else{
            largo=v2.length;
            corto=v1.length;
        }
        float [] media = new float[largo];

        float suma=0;

        for (int i = 0; i <corto ; i++) {
            suma=0;
            suma = v1[i]+v2[i];
            media[i]= suma/2;
        }
        for (int i = corto; i <largo ; i++) {
            media[i]=v2[i];
        }
        return media;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el tamaño del primer vector");
        int tam1=sc.nextInt();
        System.out.println("Dime el tamaño del segundo vector");;
        int tam2=sc.nextInt();

        int[] v1 = new int[tam1];
        int[] v2 = new int[tam2];

        System.out.println("Dime los valores del primer vector");
        for (int i = 0; i <v1.length ; i++) {
            v1[i]=sc.nextInt();
        }
        System.out.println("Dime los valores del segundo vector");
        for (int i = 0; i <v2.length ; i++) {
            v2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mediaVectores(v1, v2)));

    }

}
