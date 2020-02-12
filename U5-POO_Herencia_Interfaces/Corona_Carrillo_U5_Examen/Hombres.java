package com.company;

public abstract class Hombres extends Personaje {

    public Hombres(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
