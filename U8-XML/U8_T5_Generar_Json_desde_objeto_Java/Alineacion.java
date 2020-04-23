import com.google.gson.Gson;

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

        String json  = gson.toJson(alineacion);
        System.out.println(json);

    }
}
