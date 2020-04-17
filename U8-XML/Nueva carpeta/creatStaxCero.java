package com.company;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class creatStaxCero {

    public static void main(String[] args) {
        ArrayList<Juego> listaJuego = new ArrayList<>();


        listaJuego.add(new Juego(1,"League of Legends","MOBA","Riot Games",2009));
        listaJuego.add(new Juego(2,"Valorant","Shooter","Riot Games",2020));
        listaJuego.add(new Juego(3,"Legends of Runaterra","Cartas","Riot Games",2019));
        listaJuego.add(new Juego(4,"Counter Strike Global Offensive","Shooter","Valve",2008));
        listaJuego.add(new Juego(5,"Super Mario Bros","Plataformas","Nintendo",1985));
        listaJuego.add(new Juego(6,"Super Mario Bros 2","Plataformas","Nintendo",1988));
        listaJuego.add(new Juego(7,"Super Mario Bros 3","Plataformas","Nintendo",1990));
        listaJuego.add(new Juego(8,"New Super Mario Bros","Plataformas","Nintendo",2006));
        listaJuego.add(new Juego(9,"Minecraft","Plataformas","Mojang",2009));
        listaJuego.add(new Juego(10,"Wii Sports","Deportes","Nintendo",2006));

        try{

            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWritter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWritter.add(startDocument);

            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWritter.add(saltoDeLinea);

            StartElement juegosStartElement = eventFactory.createStartElement("","","juegos");
            xmlWritter.add(juegosStartElement);
            xmlWritter.add(saltoDeLineaTab);

            int longitud = 0;

            for(Juego j : listaJuego){

                StartElement juegoStart = eventFactory.createStartElement("","","juego");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement tipoStart = eventFactory.createStartElement("","","tipo");
                StartElement empresaStart = eventFactory.createStartElement("","","empresa");
                StartElement ano_lanzamientoStart = eventFactory.createStartElement("","","ano_lanzamiento");

                Attribute id = eventFactory.createAttribute("id",Integer.toString(j.getId()));

                EndElement juegoEnd = eventFactory.createEndElement("","","juego");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement tipoEnd = eventFactory.createEndElement("","","tipo");
                EndElement empresaEnd = eventFactory.createEndElement("","","empresa");
                EndElement ano_lanzamientoEnd = eventFactory.createEndElement("","","ano_lanzamiento");

                Characters nombre = eventFactory.createCharacters(j.getNombre());
                Characters tipo = eventFactory.createCharacters(j.getTipo());
                Characters empresa = eventFactory.createCharacters(j.getEmpresa());
                Characters ano_lanzamiento = eventFactory.createCharacters(Integer.toString(j.getAno_lanzamiento()));

                xmlWritter.add(juegoStart);

                xmlWritter.add(id);

                xmlWritter.add(saltoDeLineaTab);
                xmlWritter.add(tabulador);

                xmlWritter.add(nombreStart);
                xmlWritter.add(nombre);
                xmlWritter.add(nombreEnd);
                xmlWritter.add(saltoDeLineaTab);
                xmlWritter.add(tabulador);

                xmlWritter.add(tipoStart);
                xmlWritter.add(tipo);
                xmlWritter.add(tipoEnd);
                xmlWritter.add(saltoDeLineaTab);
                xmlWritter.add(tabulador);

                xmlWritter.add(empresaStart);
                xmlWritter.add(empresa);
                xmlWritter.add(empresaEnd);
                xmlWritter.add(saltoDeLineaTab);
                xmlWritter.add(tabulador);

                xmlWritter.add(ano_lanzamientoStart);
                xmlWritter.add(ano_lanzamiento);
                xmlWritter.add(ano_lanzamientoEnd);
                xmlWritter.add(saltoDeLineaTab);

                xmlWritter.add(juegoEnd);

                if (longitud == listaJuego.size()-1){
                    xmlWritter.add(saltoDeLinea);
                }else{
                    xmlWritter.add(saltoDeLineaTab);
                }
                longitud++;
            }

            EndElement juegosEndElement = eventFactory.createEndElement("","","juegos");
            xmlWritter.add(juegosEndElement);
            xmlWritter.add(saltoDeLinea);

            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWritter.add(endDocument);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
