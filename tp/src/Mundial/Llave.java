package Mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{
    public ArrayList<Equipo> getEquiposQueAvanzan () {
        ArrayList<Equipo> equipoGana= new ArrayList<Equipo>();
        ArrayList<Partido> listaDePartidos = super.getPartidos();


        for (int i=0 ; i<listaDePartidos.size() ; i++){
            Equipo visitante=listaDePartidos.get(i).getVisitante();
            Equipo local=listaDePartidos.get(i).getLocal();
            Resultado resultado=listaDePartidos.get(i).getResultado();
            System.out.println(visitante.getNombre() + ": " + resultado.getGolesVisita() + " " + local.getNombre() + ": " + resultado.getGolesLocal());
            if (resultado.empate()){
                int ganadorTandaDePenales= (int) (Math.random() * 2);
                if (ganadorTandaDePenales==0){
                    equipoGana.add(local);
                }else{
                    equipoGana.add(visitante);
                }
            } else if (resultado.ganoLocal()){
                equipoGana.add(local);
            }else{
                equipoGana.add(visitante);
            }
        }

        return equipoGana;
    }
}
