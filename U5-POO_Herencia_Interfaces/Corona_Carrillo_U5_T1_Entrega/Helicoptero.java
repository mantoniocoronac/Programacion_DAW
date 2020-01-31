package com.company;

public class Helicoptero extends Aereo {
    /**
     * Constructor de helicoptero
     * @param nombre
     * @param nPersonas
     * @param altitud
     * @param codigo
     */
    public Helicoptero(String nombre, int nPersonas, double altitud, String codigo) {
        super(nombre, nPersonas, altitud, codigo);
    }

    /**
     * Constructor con codigo para helicoptero
     * @param codigo
     */
    public Helicoptero(String codigo) {
        super(codigo);
    }

    /**
     * to string de helicoptero
     * @return
     */
    @Override
    public String toString() {
        return "Helicoptero{ "+super.toString();
    }
}
