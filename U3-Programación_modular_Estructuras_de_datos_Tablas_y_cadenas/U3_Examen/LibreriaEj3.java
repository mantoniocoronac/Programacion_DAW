package com.company;

public class LibreriaEj3 {

    public static String[] invertir(String s1){
        s1 = s1.toUpperCase();
        String [] resultado = new String[s1.length()];
        String [] invertido = new String[s1.length()];
        for (int i = 0; i < s1.length() ; i++) {
            resultado[i] = Character.toString(s1.charAt(i));
        }
        int cont = 0;
        for (int i = s1.length()-1; i >=0 ; i--) {
            invertido[cont]=resultado[i];
            cont++;
        }
        return invertido;
    }

    public static String[] desplazarVocales(String cad){
        String [] resultado = new String [cad.length()];
        String[] vocales  = {"a","e","i","o","u"};
        for (int i = 0; i <cad.length() ; i++) {
            resultado[i] = Character.toString(cad.charAt(i));
        }
        for (int i = 0; i <cad.length() ; i++) {
            if (resultado[i].equals(vocales[0])){
                resultado[i]=vocales[1];
            }else if(resultado[i].equals(vocales[1])) {
                resultado[i] = vocales[2];
            }else if (resultado[i].equals(vocales[2])) {
                resultado[i] = vocales[3];
            }else if (resultado[i].equals(vocales[3])) {
                resultado[i] = vocales[4];
            }else if (resultado[i].equals(vocales[4])) {
                resultado[i] = vocales[0];
            }
        }
        return resultado;
    }

}
