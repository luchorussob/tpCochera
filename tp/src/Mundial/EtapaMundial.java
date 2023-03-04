package Mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido>partidos;
    public ArrayList<Equipo>equiposQueAvanzan;

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos){
        this.descripcionEtapa=descripcionEtapa;
        this.partidos=new ArrayList<Partido>(partidos);
    }
    public EtapaMundial(){

        this.equiposQueAvanzan=new ArrayList<Equipo>(equiposQueAvanzan);
    }
    public String getDescripcionEtapa() {

        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {

        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan() {

        return equiposQueAvanzan;
    }


    public ArrayList<Partido> getPartidos() {

        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {

        this.partidos = partidos;
    }

    public void addPartido(Partido partido){this.partidos.add(partido);
    }
}
