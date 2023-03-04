package Mundial;

import java.util.ArrayList;
import java.util.Date;
public class Equipo {
    private String nombre;
    private int puntos;
    private ArrayList<Partido>PartidosJugados;

    public ArrayList<Partido> getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        PartidosJugados = partidosJugados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Equipo (String nombre){
        this.nombre=nombre;
        this.puntos=0;
    }
}
