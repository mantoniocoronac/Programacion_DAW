package com.company;

public class Main {

    public static void main(String[] args) {

        Personaje[] p = new Personaje[10];

        Elfos e1  = new Elfos("Leo",100,80,70,false, tipoElfo.tipo.BOSQUE);
        Elfos e2 = new Elfos("Legolas",100,95,77,true, tipoElfo.tipo.COSTA);
        Orcos o1 = new Orcos("Teo",100,80,76,false,140);
        Enanos en1 = new Enanos("Sou",70,90,75,false,1);
        Guerreros g1 = new Guerreros("Fernando",90,85,90,false,28);
        Magos m1 = new Magos("Gandalf",80,90,70,true,3);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(o1.toString());
        System.out.println(en1.toString());
        System.out.println(g1.toString());
        System.out.println(m1.toString());

        System.out.println("------------------------------------------------------------------------------------------------");

        e1.atacarPersonaje(o1);
        System.out.println(o1.toString());

        g1.atacarPersonaje(e1);
        System.out.println(e1.toString());

        o1.atacarPersonaje(g1);
        System.out.println(g1.toString());

        en1.atacarPersonaje(m1);
        System.out.println(m1.toString());

        e2.atacarPersonaje(g1);
        System.out.println(g1.toString());


        System.out.println("-------------------------------------------------------------------------");
        m1.desencantar(e2);
        m1.encantar(e1);

        System.out.println(e2.toString());
        System.out.println(e1.toString());
        System.out.println("--------------------------------------------------------------------------");


        System.out.println(e2.toString());
        e1.atacarPersonaje(e2);
        System.out.println(e2.toString());

    }
}
