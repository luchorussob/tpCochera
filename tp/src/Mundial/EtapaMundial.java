package Mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido>partidos;
    private ArrayList<Equipo>equipoQueAvanza;

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos){
        this.descripcionEtapa=descripcionEtapa;
        this.partidos=new ArrayList<Partido>(partidos);
    }
    public EtapaMundial(){
        this.equipoQueAvanza=new ArrayList<Equipo>(equipoQueAvanza);
    }
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Equipo> getEquipoQueAvanza() {
        return equipoQueAvanza;
    }

    public void setEquipoQueAvanza(ArrayList<Equipo> equipoQueAvanza) {
        this.equipoQueAvanza = equipoQueAvanza;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
}
