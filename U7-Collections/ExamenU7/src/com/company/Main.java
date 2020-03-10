package com.company;


public class Main {

    public static void main(String[] args) {

        Concurso c = new Concurso();

        Propietario pro1 = new Propietario("Manolo","Del Bosque",13,"España");
        Propietario pro2 = new Propietario("Antonio","Gonzalez",18,"España");
        Propietario pro3 = new Propietario("Adrian","Moreno",21,"Francia");

        Perro p1 = new Perro("Paco",8,30,true,pro1, Raza.raza.Pitbull);
        Perro p2 = new Perro("Luis",5,20,true,pro3,Raza.raza.Golden);
        Perro p3 = new Perro("Chanel",6,23,false,pro1, Raza.raza.Bulldog);
        Perro p4 = new Perro("Myke",7,32,true,pro2, Raza.raza.Golden);
        Perro p5 = new Perro("Suso",10,42,true,pro2, Raza.raza.Pitbull);
        Perro p6 = new Perro("Wunder",4,16,true,pro2, Raza.raza.Bulldog);
        Perro p7 = new Perro("Suso",10,42,true,pro3, Raza.raza.Pitbull);
        Perro p8 = new Perro("Alex",2,14,false,pro3, Raza.raza.Golden);
        Perro p9 = new Perro("Steph",3,21,true,pro3, Raza.raza.Bulldog);
        Perro p10 = new Perro("Tommy",9,28,true,pro3, Raza.raza.Pitbull);

        c.addDog(Raza.raza.Pitbull,p1);
        c.addDog(Raza.raza.Golden,p2);
        c.addDog(Raza.raza.Bulldog,p3);
        c.addDog(Raza.raza.Golden,p4);
        c.addDog(Raza.raza.Pitbull,p5);
        c.addDog(Raza.raza.Bulldog,p6);
        c.addDog(Raza.raza.Pitbull,p7);
        c.addDog(Raza.raza.Golden,p8);
        c.addDog(Raza.raza.Bulldog,p9);
        c.addDog(Raza.raza.Pitbull,p10);

        System.out.println(c.mapp);

        c.disqualifyDog(p1);

        System.out.println(c.mapp);

        c.guardarPerros();
    }
}
