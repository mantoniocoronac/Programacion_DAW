package com.company;

public class Ingrediente {


    private String nombre;
    private double calorias;


    /**
     * Asignar valores
     * @param nombre
     * @param calorias
     */

    Ingrediente(String nombre,double calorias){
        this.nombre=nombre;
        this.calorias=calorias;
    }

    /**
     * Valor por defeceto para ingredientes
     */
    Ingrediente(){
        this.nombre="Queso";
        this.calorias=250;
    }

    /**
     * Devolver nombre
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Nombre ingrediente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devolver calorias
     * @return
     */
    public double getCalorias() {
        return calorias;
    }

    /**
     * Num calorias
     * @param calorias
     */
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
