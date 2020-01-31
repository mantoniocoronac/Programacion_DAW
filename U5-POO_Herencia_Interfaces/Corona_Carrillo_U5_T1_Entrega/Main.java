package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Terrestre[] terrestre = new Terrestre[6];

        terrestre[0] = new Coche("coche1",5,"777J",2015,Color.AMARILLO);
        terrestre[1] = new Coche("coche2",5,"666A",2018,Color.ROJO);
        terrestre[2] = new Coche("coche3",4,"333F",2013,Color.AZUL);
        terrestre[3] = new Moto("moto1",2,"111W",2008,Color.AMARILLO);
        terrestre[4] = new Moto("moto2",2,"222F",2019,Color.ROJO);
        terrestre[5] = new Moto("moto3",2,"555B",2016,Color.AZUL);

        Avioneta a1 = new Avioneta("avioneta",3,55,"AEG12354");
        Helicoptero h1 = new Helicoptero("BIW41236");

        Arrays.sort(terrestre);
        System.out.println(Arrays.deepToString(terrestre));

        System.out.println(a1.toString());
        System.out.println(h1.toString());
    }
}
