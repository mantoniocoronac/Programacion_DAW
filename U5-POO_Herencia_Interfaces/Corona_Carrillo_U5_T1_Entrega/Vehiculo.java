package com.company;

public abstract class Vehiculo {

    /**
     * Variables a usar
     */
    private String nombre;
    private int nPersonas;

    /**
     * Constructor de vehiculo
     * @param nombre
     * @param nPersonas
     */
    public Vehiculo(String nombre, int nPersonas) {
        this.nombre = nombre;
        this.nPersonas = nPersonas;
    }


    /**
     * toString del nombre y num de personas
     * @return
     */
    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                        ", nPersonas=" + nPersonas;
    }

    /**
     * getter del nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter del nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del num de personas
     * @return
     */

    public int getnPersonas() {
        return nPersonas;
    }

    /**
     * setter del num de personas
     * @param nPersonas
     */
    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }




}
