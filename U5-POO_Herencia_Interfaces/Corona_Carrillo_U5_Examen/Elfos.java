package com.company;

public class Elfos extends Personaje implements Atacar {

    private tipoElfo.tipo tipoelfo;

    public Elfos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado, tipoElfo.tipo tipo) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
        this.tipoelfo = tipo;
    }

    @Override
    public String toString() {
        return "Elfo{" + super.toString() +
                ", tipo=" + tipoelfo +
                '}';
    }

    public tipoElfo.tipo getTipoelfo() {
        return tipoelfo;
    }

    public void setTipoelfo(tipoElfo.tipo tipoelfo) {
        this.tipoelfo = tipoelfo;
    }

    @Override
    public void atacarPersonaje(Personaje p) {

        System.out.println(getNombre() + "- Listo para el ataque");

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
