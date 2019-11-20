package com.company;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sus números favoritos:");
        String fav1=sc.nextLine();
        String fav2=sc.nextLine();
        String fav3=sc.nextLine();

        System.out.println("Introduzca el número de la lotería");
        String loteria = sc.nextLine();

        int cont = 0;
        for (int i = 0; i <loteria.length() ; i++) {
            if (Character.toString(loteria.charAt(i)).equals(fav1)|| Character.toString(loteria.charAt(i)).equals(fav2) || Character.toString(loteria.charAt(i)).equals(fav3)) {
                cont++;
            }
        }
        if (cont>loteria.length()/2){
            System.out.println("Ese número le va a dar suerte");
        }else {
            System.out.println("Ese número no le va a dar suerte");
        }


    }

}
