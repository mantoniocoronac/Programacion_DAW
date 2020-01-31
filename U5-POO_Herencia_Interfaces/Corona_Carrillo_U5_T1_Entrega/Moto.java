package com.company;

public class Moto extends Terrestre{

    /**
     * Constructor de la moto
     *
     * @param nombre
     * @param nPersonas
     * @param matricula
     * @param anoFabricacion
     * @param color
     */
    public Moto(String nombre, int nPersonas, String matricula, int anoFabricacion, Color color) {
        super(nombre, nPersonas, matricula, anoFabricacion, color);
    }

    public String toString() {
        return "Moto{ " +super.toString()+'\'';
    }
}
