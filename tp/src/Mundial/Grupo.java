package Mundial;

import java.util.ArrayList;
import java.util.Date;
public class Grupo extends EtapaMundial {

        public ArrayList<Equipo> getEquiposQueAvanzan () {
            ArrayList<Partido> listaPartidos = super.getPartidos();
            ArrayList<Equipo> mejoresPuntajes= new ArrayList<Equipo>();
            Equipo primero = new Equipo("");
            Equipo segundo = new Equipo("");
            int primeroEnPuntos = 0;
            int segundoEnPuntos=0;


            for (int i=0 ; i<listaPartidos.size() ; i++){
                Equipo visitante=listaPartidos.get(i).getVisitante();
                Equipo local=listaPartidos.get(i).getLocal();
                Resultado resultado=listaPartidos.get(i).getResultado();
                System.out.println(visitante.getNombre() + ": " + resultado.getGolesVisita() + " " + local.getNombre() + ": " + resultado.getGolesLocal());
                if (resultado.empate()){
                    visitante.setPuntos(visitante.getPuntos() + 1);
                    local.setPuntos(local.getPuntos() + 1);
                }
                if (resultado.ganoLocal()){
                    local.setPuntos(local.getPuntos() + 3);
                }else{
                    visitante.setPuntos(visitante.getPuntos() + 3);
                }
            }


            for (int i=0 ; i<listaPartidos.size() ; i++){
                Equipo visitante=listaPartidos.get(i).getVisitante();
                Equipo local=listaPartidos.get(i).getLocal();

                if (primeroEnPuntos< visitante.getPuntos()){
                    primeroEnPuntos= visitante.getPuntos();
                    primero=visitante;
                    segundo=local;
                }else{
                    primeroEnPuntos=local.getPuntos();
                    primero=local;
                    segundoEnPuntos=visitante.getPuntos();
                    segundo=visitante;
                }

                if (segundoEnPuntos < visitante.getPuntos() && !primero.getNombre().equals(visitante.getNombre())){
                    segundoEnPuntos= visitante.getPuntos();
                    segundo=visitante;
                }
                if (segundoEnPuntos < local.getPuntos() && !primero.getNombre().equals(local.getNombre())){
                    segundoEnPuntos= local.getPuntos();
                    segundo=local;
                }
            }

            mejoresPuntajes.add(primero);
            mejoresPuntajes.add(segundo);
            return mejoresPuntajes;
        }
    }

