package com.company;

public class Orcos extends Personaje implements Atacar{

    private int tonelaje;

    public Orcos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado, int tonelaje) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Orco{" + super.toString()+
                ", tonelaje=" + tonelaje +
                '}';
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        System.out.println(getNombre()+" - A la carga");

        if (isEncantado()) {
            p.setEnergia(p.getEnergia() - ((getCapacidadAtaque() - p.getCapacidadDefensa()) * 2));
        } else {
            p.setEnergia(p.getEnergia() - (getCapacidadAtaque() - p.getCapacidadDefensa()));
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
