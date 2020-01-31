package com.company;

public class Avioneta extends Aereo{

    /**
     * Constructor avioneta
     * @param nombre
     * @param nPersonas
     * @param altitud
     * @param codigo
     */
    public Avioneta(String nombre, int nPersonas, double altitud, String codigo) {
        super(nombre, nPersonas, altitud, codigo);
    }

    /**
     * Constructor por codigo
     * @param codigo
     */
    public Avioneta(String codigo) {
        super(codigo);
    }

    /**
     * toString de avioneta
     * @return
     */
    @Override
    public String toString() {
        return "Avioneta{ "+super.toString();
    }

    }
