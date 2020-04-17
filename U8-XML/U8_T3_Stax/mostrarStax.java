package com.company;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;

public class mostrarStax {

    public static void main(String[] args) {

        try{

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("usr.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if(xmlEvent.isStartElement()){

                    StartElement startTag = xmlEvent.asStartElement();
                    String tagName = startTag.getName().getLocalPart();

                    switch (tagName){
                        case "usuarios" :
                            System.out.println("<"+startTag.getName().getLocalPart()+">");
                            break;
                        case "usuario" :
                            Attribute id = startTag.getAttributeByName(new QName("id"));
                            System.out.print("   <"+startTag.getName().getLocalPart());
                            System.out.println(" "+id.getName()+" = "+id.getValue()+">");
                            break;
                        case "nombre" :
                            System.out.print("      <"+startTag.getName().getLocalPart()+">");
                            break;
                        case "localidad" :
                            System.out.print("      <"+startTag.getName().getLocalPart()+">");

                    }

                }else if(xmlEvent.isEndElement()){

                    EndElement endtag = xmlEvent.asEndElement();

                    if (endtag.getName().getLocalPart().equals("usuario")){
                        System.out.println("   <\\"+endtag.getName().getLocalPart()+">");
                    }else {
                        System.out.println("<\\" + endtag.getName().getLocalPart() + ">");
                    }

                }else if(xmlEvent.isStartDocument()){
                    System.out.println("Comienzo del parseado del documento");
                }else if(xmlEvent.isEndDocument()){
                    System.out.println("Fin del parseado del documento");
                }else if(xmlEvent.isCharacters()){
                    Characters texto = xmlEvent.asCharacters();

                    if(!texto.getData().contains("\n")){
                        System.out.print(texto.getData());
                    }

                }

            }


        }catch (Exception e){
            System.out.println(e);
        }

    }

}
