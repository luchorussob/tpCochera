package Mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido>PartidosJugados;

    public ArrayList<Partido> getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        PartidosJugados = partidosJugados;
    }
}
