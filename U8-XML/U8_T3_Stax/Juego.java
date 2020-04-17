package com.company;

public class Juego {

    private int id;
    private String nombre;
    private String tipo;
    private String empresa;
    private int ano_lanzamiento;

    public Juego(int id,String nombre, String tipo, String empresa, int ano_lanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.empresa = empresa;
        this.ano_lanzamiento = ano_lanzamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAno_lanzamiento() {
        return ano_lanzamiento;
    }

    public void setAno_lanzamiento(int ano_lanzamiento) {
        this.ano_lanzamiento = ano_lanzamiento;
    }
}
