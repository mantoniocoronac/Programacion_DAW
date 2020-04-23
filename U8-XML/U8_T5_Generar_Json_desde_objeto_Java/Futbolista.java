import java.util.List;

public class Futbolista {

    private int Dorsal;
    private String nombre;
    private String[] demarcacion;
    private String equipo;

    public Futbolista(int dorsal, String nombre, String[] demarcacion, String equipo) {
        Dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String[] demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "Dorsal=" + Dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcacion=" + demarcacion +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
