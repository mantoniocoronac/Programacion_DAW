package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class RecorridoDOM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Element e1 = null;

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("usr.xml"));

            System.out.println("Introduce la etiqueta a mostrar");
            String etiqueta = sc.nextLine();
            e1 = doc.createElement(etiqueta);

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        //numNodosHijos();
        //mostrarXMLDom();
        mostrarContenidoEtiqueta(e1);

    }


    public static void numNodosHijos(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("usr.xml"));
            Element root = doc.getDocumentElement();
            System.out.println("Tiene: "+root.getChildNodes().getLength()+" hijos");
            NodeList nl = root.getChildNodes();

            for (int i = 0; i <nl.getLength() ; i++) {
                System.out.println("Estamos en el nodo: "+i);
                System.out.println("Es de tipo: "+nl.item(i).getNodeType());
            }

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }


    }

    public static void mostrarXMLDom(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("usr.xml"));
            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i <nl.getLength() ; i++) {
                System.out.println("Estamos en el nodo: "+i);
                System.out.println("Es de tipo: "+nl.item(i).getNodeType());
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    System.out.println("Contiene"+nl.item(i).getTextContent());
                }
            }


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    public static void mostrarContenidoEtiqueta(Element etiqueta){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("usr.xml"));
            NodeList nl =  doc.getElementsByTagName(etiqueta.getTagName());
            if (nl.getLength()==0){
                System.out.println("No tiene ninguna etiqueta con ese nombre");
            }else{
                for (int i = 0; i <nl.getLength() ; i++) {
                    Element e2 = (Element) nl.item(i);
                    System.out.println("Nombre: "+e2.getTagName()+" id: "+e2.getAttribute("id"));
                    if (nl.item(i).hasChildNodes()){
                        NodeList nhijos = nl.item(i).getChildNodes();
                        for (int j = 0; j <nhijos.getLength() ; j++) {
                            if (nhijos.item(j).getNodeType()== Node.ELEMENT_NODE){
                                Element ehijo = (Element) nhijos.item(j);
                                System.out.println("Nombre: "+ehijo.getTagName()+ " Contenido: "+ehijo.getTextContent());
                            }
                        }
                    }
                }
            }


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

}
