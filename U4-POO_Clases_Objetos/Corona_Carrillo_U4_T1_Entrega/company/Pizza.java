package com.company;

public class Pizza {


    private enum Size{mediana,familiar};
    private Size size;
    private Ingrediente[] ingrediente = new Ingrediente[3];
    private int numIngrediente;


    /**
     * Constructor con valores
     * @param tam
     * @param ingrediente
     */
    Pizza(Size tam,Ingrediente ingrediente[]){
        this.size=tam;
        this.ingrediente=ingrediente;
        this.numIngrediente=0;
    }

    /**
     * Constructor por defecto
     */
    Pizza(){
        this.size=Size.familiar;
        Ingrediente Jamon = new Ingrediente("Jamon",150);
        Ingrediente Queso = new Ingrediente();
        this.numIngrediente=2;

    }


    /**
     * Devuelve num de ingredientes
     * @return
     */
    public int getNumIngrediente() {
        return numIngrediente;
    }

    /**
     * boolean de posible insercion de ingrediente
     * @return
     */
    public boolean insertarIngrediente(){
        if(numIngrediente<3){
            return false;
        }else {
            return true;
        }
    }

    /**
     * Muestra informacion de la pizza
     */
    public void infoPizza(){
        String lista[] = new String[getNumIngrediente()];

        for (int i = 0; i <lista.length ; i++) {
            System.out.println("El ingrediente: "+ingrediente[i].getNombre()+" con "+ingrediente[i].getCalorias()+" calorias ");
        }
        System.out.println("La pizza es tamaño "+size);
    }

}
