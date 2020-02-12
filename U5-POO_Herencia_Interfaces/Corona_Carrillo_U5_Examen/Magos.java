package com.company;

public class Magos extends Hombres implements Magia{


    int longitudBarba;

    public Magos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado, int longitudBarba) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return "Mago{" + super.toString()+
                ", longitudBarba=" + longitudBarba +
                '}';
    }

    public int getLongitudBarba() {
        return longitudBarba;
    }

    public void setLongitudBarba(int longitudBarba) {
        this.longitudBarba = longitudBarba;
    }


    @Override
    public void encantar(Personaje p) {
        p.setEncantado(true);
    }

    @Override
    public void desencantar(Personaje p) {
        p.setEncantado(false);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
