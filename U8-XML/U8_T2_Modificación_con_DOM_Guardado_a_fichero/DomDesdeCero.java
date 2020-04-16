package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class DomDesdeCero {
    public static void main(String[] args) {
        ArrayList<Juego> listaJuego = new ArrayList<>();
        int cont = 1;


        listaJuego.add(new Juego("League of Legends","MOBA","Riot Games",2009));
        listaJuego.add(new Juego("Valorant","Shooter","Riot Games",2020));
        listaJuego.add(new Juego("Legends of Runaterra","Cartas","Riot Games",2019));
        listaJuego.add(new Juego("Counter Strike Global Offensive","Shooter","Valve",2008));
        listaJuego.add(new Juego("Super Mario Bros","Plataformas","Nintendo",1985));
        listaJuego.add(new Juego("Super Mario Bros 2","Plataformas","Nintendo",1988));
        listaJuego.add(new Juego("Super Mario Bros 3","Plataformas","Nintendo",1990));
        listaJuego.add(new Juego("New Super Mario Bros","Plataformas","Nintendo",2006));
        listaJuego.add(new Juego("Minecraft","Plataformas","Mojang",2009));
        listaJuego.add(new Juego("Wii Sports","Deportes","Nintendo",2006));

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("juegos");

            doc.appendChild(root);

            Iterator it = listaJuego.iterator();
            while(it.hasNext()){
                Juego j = (Juego) it.next();

                Element juegTag = doc.createElement("juego");
                juegTag.setAttribute("id",Integer.toString(cont));

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(j.getNombre());

                Element tipo = doc.createElement("tipo");
                tipo.setTextContent(j.getTipo());

                Element empresa = doc.createElement("empresa");
                empresa.setTextContent(j.getEmpresa());

                Element ano_lanzamiento = doc.createElement("ano_lanzamiento");
                ano_lanzamiento.setTextContent(Integer.toString(j.getAno_lanzamiento()));

                juegTag.appendChild(nombre);
                juegTag.appendChild(tipo);
                juegTag.appendChild(empresa);
                juegTag.appendChild(ano_lanzamiento);

                root.appendChild(juegTag);

                cont++;
            }


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("cero.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);

        }catch (Exception e){
            System.out.println(e);
        }

    }




}
