package com.company;

public abstract class Aereo extends Vehiculo {

    /**
     * Variables de aereo
     */
    private double altitud;
    private String codigo;

    /**
     * Constructor entero de aereo
     * @param nombre
     * @param nPersonas
     * @param altitud
     * @param codigo
     */
    public Aereo(String nombre, int nPersonas, double altitud, String codigo) {
        super(nombre, nPersonas);
        this.altitud = altitud;
        this.codigo = codigo;
    }

    /**
     * Constructor por codigo de aereo
     * @param codigo
     */
    public Aereo(String codigo){
        super("",0);
        this.altitud = 0;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "altitud=" + altitud +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    /**
     * getter de altitud
     * @return
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * setter de altitud
     * @param altitud
     */
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    /**
     * getter de codigo
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * setter de codigo
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
