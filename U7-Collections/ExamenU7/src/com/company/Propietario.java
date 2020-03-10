package com.company;

public class Propietario {

    private String nombre;
    private String apellidos;
    private int nSocio;
    private String paisOrigen;

    public Propietario(String nombre, String apellidos, int nSocio, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nSocio = nSocio;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }



    @Override
    public String toString() {
        return  nombre+" "+apellidos;

    }
}
