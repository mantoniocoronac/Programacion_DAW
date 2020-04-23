import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Alineacion {
    public static void main(String[] args) {

        ArrayList<Futbolista> alineacion = new ArrayList<>();

        alineacion.add(new Futbolista(1,"Casillas", new String[]{"Portero"},"Real Madrid"));
        alineacion.add(new Futbolista(15,"Ramos", new String[]{"Lateral derecho", "Medio centro"},"Real Madrid"));
        alineacion.add(new Futbolista(3,"Pique", new String[]{"Central"},"FC Barcelona"));
        alineacion.add(new Futbolista(5,"Puyol", new String[]{"Central"},"FC Barcelona"));
        alineacion.add(new Futbolista(11,"Capdevila", new String[]{"Lateral izquierdo"},"Villareal"));
        alineacion.add(new Futbolista(14,"Xabi Alonso", new String[]{"Defensa mediocampo", "Mediocampo"},"Real Madrid"));
        alineacion.add(new Futbolista(16,"Busquets", new String[]{"Defensa mediocampo"},"FC Barcelona"));
        alineacion.add(new Futbolista(8,"Xavi Hernandez", new String[]{"Mediocampo"},"FC Barcelona"));
        alineacion.add(new Futbolista(18,"Pedrito", new String[]{"Extremo izquierdo","Falso extremo"},"FC Barcelona"));
        alineacion.add(new Futbolista(6,"Iniesta", new String[]{"Extremo derecho","Mediocampo"},"FC Barcelona"));
        alineacion.add(new Futbolista(7,"Villa", new String[]{"Delantero centro"},"FC Barcelona"));

        Gson gson = new Gson();

        String jsonArray  = gson.toJson(alineacion);
        //System.out.println(jsonArray);

        Type listType = new TypeToken<ArrayList<Futbolista>>(){}.getType();

        ArrayList<Futbolista> alineacion2 = gson.fromJson(jsonArray, listType);

        System.out.println(alineacion2.toString());


        ArrayList<String> ramos = new ArrayList<>();

        for (Futbolista futbolista:alineacion2 ) {
            if (futbolista.getNombre().equals("Ramos")){
                for (int i = 0; i <futbolista.getDemarcacion().length ; i++) {
                    ramos.add(futbolista.getDemarcacion()[i]);
                }
            }

        }

        System.out.println("Las posibles dermacaciones de ramos son: "+ramos);

    }
}
