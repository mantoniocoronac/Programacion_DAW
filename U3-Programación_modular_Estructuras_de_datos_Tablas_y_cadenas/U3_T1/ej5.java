package com.company;

public class ej5 {

    public static int aleatorioDeArray(int[] a){

        int aleatorio = (int) Math.floor(Math.random()*(a.length));

        return a[aleatorio];
    }


    public static void main(String[] args) {
        int[] a = {111,222,333,444};

        System.out.println(aleatorioDeArray(a));
    }
}
