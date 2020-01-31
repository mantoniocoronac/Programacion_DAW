package com.company;

public class Coche extends Terrestre {

    /**
     * Constructor del coche
     *
     * @param nombre
     * @param nPersonas
     * @param matricula
     * @param anoFabricacion
     * @param color
     */
    public Coche(String nombre, int nPersonas, String matricula, int anoFabricacion, Color color) {
        super(nombre, nPersonas, matricula, anoFabricacion, color);
    }

    @Override
    public String toString() {
        return "Coche{ " +super.toString()+'\'';
    }
}
