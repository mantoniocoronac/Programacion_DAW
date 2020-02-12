package com.company;

public class Enanos extends Personaje implements Atacar{

    private int altura;

    public Enanos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado, int altura) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enano{" + super.toString()+
                ", altura=" + altura +
                '}';
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        System.out.println(getNombre()+" - Al ataque");

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
