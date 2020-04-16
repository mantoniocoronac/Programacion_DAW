package com.company;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ModificarDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("usr.xml"));

            Node root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            Text saltoLinea = doc.createTextNode("\n");

            for (int i = 0; i < nl.getLength() ; i++) {
                if(nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Comment coment = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");
                    Element usuario = (Element) nl.item(i);
                    root.insertBefore(coment,usuario);
                    i+=1;
                }
            }

            Element usuario = doc.createElement("usuario");
            usuario.setAttribute("id","4");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Jorge");

            Element localidad = doc.createElement("localidad");
            localidad.setTextContent("Sevilla");

            usuario.appendChild(nombre);
            usuario.appendChild(localidad);

            root.appendChild(usuario);



            NodeList nlusr  = doc.getElementsByTagName("usuario");
            Node node = nlusr.item(nlusr.getLength()-1);
            Element usuarioClonado = (Element) node.cloneNode(true);

            usuarioClonado.setAttribute("id","5");
            root.appendChild(usuarioClonado);

            Element primeraPersona = (Element) doc.getElementsByTagName("usuario").item(0);

            root.replaceChild(usuarioClonado,primeraPersona);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoUsuario = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoUsuario);

            transformer.transform(origenDOM,destino);

        }catch(Exception e){
            System.out.println(e);
        }
    }


}
