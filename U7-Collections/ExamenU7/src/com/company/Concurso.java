package com.company;

import java.io.*;
import java.util.*;

public class Concurso {

    ArrayList<Perro> lista = new ArrayList<>();

    Map<Raza.raza,ArrayList> mapp = new HashMap<>();

    Set<Map.Entry<Raza.raza,ArrayList>> mapp2 = mapp.entrySet();

    Iterator it = mapp2.iterator();


    public void addDog(Raza.raza raza, Perro perro){
        if (raza!=perro.getRaza()){
            System.out.println("Estas intentando añadir un perro de otra raza");
        }else {
            lista.add(perro);
            mapp.put(raza,lista);
        }
    }

    public void disqualifyDog(Perro perro){
        if (lista.contains(perro)){
            lista.remove(perro);
            mapp.remove(perro);
        }else{
            System.out.println("Perro no inscrito");
        }
    }

    public void ownerDogs(int nSocio){

    }

    public void perrosporPeso(Raza.raza raza){

    }

    public void perrosPorEdad(Raza.raza raza){

    }

    public void cargarPerros(){

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (true){
                ois.readObject();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void guardarPerros(){
        try{
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            while(it.hasNext()){
                ous.writeObject(it.next());
            }

            ous.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
