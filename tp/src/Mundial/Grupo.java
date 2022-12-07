package Mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {
    private ArrayList<Grupo>grupos;

    public Grupo(ArrayList<Equipo>equipos){
        super();
    }

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
    }

    @Override
    public ArrayList<Equipo> getEquipoQueAvanza() {
        return super.getEquipoQueAvanza();
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
}
