package com.company;

import java.io.PushbackReader;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nresult;
        int eliminados = 0;
        int usrn;
        do {
            System.out.println("Introduzca un número entero positivo:");
            usrn = sc.nextInt();
        }while (usrn<=0);

        int copianum = usrn;
        int cont = 0;
        while (copianum!=0){
            copianum = copianum/10;
            cont++;
        }

        for (int i = 0; i <cont ; i++) {
            if (usrn/10==0){
                eliminados++;
            }else if (usrn/10==8){
                eliminados++;
            }
        }
        System.out.println("Digitos eliminados:"+eliminados);

    }

}
