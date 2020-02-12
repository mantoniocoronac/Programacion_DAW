package com.company;

import java.util.Comparator;

public abstract class Personaje implements Comparable{

    private String nombre;
    private int energia;
    private int capacidadAtaque;
    private int capacidadDefensa;
    private boolean encantado;

    public Personaje(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia;
        this.capacidadAtaque = capacidadAtaque;
        this.capacidadDefensa = capacidadDefensa;
        this.encantado = encantado;
    }



    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capacidadAtaque=" + capacidadAtaque +
                ", capacidadDefensa=" + capacidadDefensa +
                ", encantado=" + encantado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }


}
