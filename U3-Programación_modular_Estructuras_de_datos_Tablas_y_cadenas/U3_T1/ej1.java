package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mesa ={1,2,3,4,5,6,7,8,9,10};
        int [] ocupacion = new int[10];

        System.out.print("Mesa no   ");
        for (int i = 0; i <ocupacion.length ; i++) {
            ocupacion[i]= (int)(Math.random()*5);

            System.out.print(mesa[i]+" ");
        }
        System.out.println();
        System.out.print("Ocupación ");
        for (int i = 0; i <ocupacion.length ; i++) {
            System.out.print(ocupacion[i]+" ");
        }
        System.out.println();
        System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int nclientes = sc.nextInt();
        boolean vacio = false;
        do if(nclientes!=-1){
        if (nclientes>4){
            System.out.println("Lo siento, no admitimos grupos de "+nclientes+ ", haga grupos de 4 personas\n" +
                    "como máximo e intente de nuevo");
        }
        if (nclientes<=4) {
            for (int i = 0; i < ocupacion.length; i++) {
                if (ocupacion[i] == 0) {
                    ocupacion[i] += nclientes;
                    vacio = true;
                    System.out.println("Por favor, siéntense en la mesa número " + mesa[i]);
                    break;
                }else{
                    vacio=false;
                }
            }
            if (!vacio){
                for (int i = 0; i <ocupacion.length ; i++) {
                    if ((ocupacion[i] + nclientes) <= 4) {
                        ocupacion[i] += nclientes;
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + mesa[i]);
                        break;
                    } else{
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                        break;
                    }
                }

            }

        }
            System.out.print("Mesa no   ");
            for (int i = 0; i <ocupacion.length ; i++) {
                System.out.print(mesa[i]+" ");
            }
            System.out.println();
            System.out.print("Ocupación ");
            for (int i = 0; i <ocupacion.length ; i++) {
                System.out.print(ocupacion[i]+" ");
            }

            System.out.println();
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            nclientes = sc.nextInt();
        }while (nclientes!=-1);
        System.out.println("Gracias. Hasta pronto.");
    }

}
