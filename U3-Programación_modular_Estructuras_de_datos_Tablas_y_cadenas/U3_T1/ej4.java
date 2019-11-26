package com.company;

public class ej4 {

    public static String convierteArrayEnString(int[] a){
        String cadena="";
        for (int i = 0; i <a.length ; i++) {
            cadena+=(a[i]);
        }
        return cadena;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        System.out.println(convierteArrayEnString(a));
    }

}
