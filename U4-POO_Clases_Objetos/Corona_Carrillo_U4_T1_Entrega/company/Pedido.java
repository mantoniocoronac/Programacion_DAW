package com.company;

import java.util.Calendar;

public class Pedido {

    private Pizza pizza;
    private Calendar hora;

    /**
     *
     * @param pizza
     */
    Pedido(Pizza pizza){
        this.pizza = pizza;
        this.hora = Calendar.getInstance();
    }

    Pedido(){
        this.pizza = new Pizza();
    }
}
