package com.company;

public class Perro {

    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunado;
    private Propietario propietario;
    private Raza.raza raza;

    public Perro(String nombre, int edad, int peso, boolean vacunado, Propietario propietario, Raza.raza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Raza.raza getRaza() {
        return raza;
    }

    public void setRaza(Raza.raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", propietario=" + propietario +
                ", raza=" + raza;
    }
}
