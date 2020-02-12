package com.company;

public class Guerreros extends Hombres implements Atacar{

    int edad;

    public Guerreros(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantado, int edad) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerrero{" + super.toString()+
                ", edad=" + edad +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        System.out.println(getNombre()+" - Atacando");

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
