package com.company;

public class Main {

    public static void main(String[] args) {

        Ingrediente Jamon = new Ingrediente("Jamon",150);
        Ingrediente Queso = new Ingrediente();

        System.out.println(Jamon.getNombre());
        System.out.println(Queso.getNombre());


    }
}
