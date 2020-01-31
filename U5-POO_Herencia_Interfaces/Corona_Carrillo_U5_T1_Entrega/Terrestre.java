package com.company;

import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable{

    /**
     * Declaracion variables
     */
    private String matricula;
    private int anoFabricacion;
    private Color color;

    /**
     * Constructor de los vehiculos terrestres
     * @param nombre
     * @param nPersonas
     * @param matricula
     * @param anoFabricacion
     * @param color
     */
    public Terrestre(String nombre, int nPersonas, String matricula, int anoFabricacion,Color color) {
        super(nombre, nPersonas);
        this.matricula = matricula;
        this.anoFabricacion = anoFabricacion;
        this.color = color;
    }

    /**
     * el toString de terrestre
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+'\''+
                "matricula='" + matricula + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", color=" + color +
                '}';
    }

    /**
     * metodo equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return Objects.equals(matricula, terrestre.matricula);
    }

    /**
     * Compare to
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Terrestre t = (Terrestre) o;
        return getMatricula().compareTo(t.getMatricula());
    }

    /**
     * getter de matricula
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * setter de matricula
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * getter del año de fabricacion
      * @return
     */
    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    /**
     * setter del año de fabricacion
     * @param anoFabricacion
     */
    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * getter de color
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * setter de color
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
