import Mundial.*;
import SistemaGaraje.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//grupo A
        Equipo catar = new Equipo("catar");
        Equipo ecuador = new Equipo("ecuador");
        Equipo paises_bajos = new Equipo("paises_bajos");
        Equipo senegal = new Equipo("senegal");


        //grupo B
        Equipo inglaterra = new Equipo("inglaterra");
        Equipo eeuu = new Equipo("eeuu");
        Equipo iran = new Equipo("iran");
        Equipo gales = new Equipo("gales");

        //grupo C
        Equipo argentina = new Equipo("argentina");
        Equipo arabia_saudita = new Equipo("arabia_saudita");
        Equipo polonia = new Equipo("polonia");
        Equipo mexico = new Equipo("mexico");

        //grupo D
        Equipo francia = new Equipo("francia");
        Equipo australia = new Equipo("australia");
        Equipo tunez = new Equipo("tunez");
        Equipo dinamrca = new Equipo("dinamarca");

        //grupo E
        Equipo japon = new Equipo("japon");
        Equipo españa = new Equipo("españa");
        Equipo alemania  = new Equipo("alemania");
        Equipo costa_rica = new Equipo("costa_rica");

        //grupo F

        Equipo marruecos = new Equipo("marruecos");
        Equipo croacia = new Equipo("croacia");
        Equipo belgica = new Equipo("belgica");
        Equipo canada = new Equipo("canada");

        // grupo G

        Equipo brasil = new Equipo("brasil");
        Equipo suiza = new Equipo("suiza");
        Equipo camerun = new Equipo("camerun");
        Equipo serbia = new Equipo("serbia");

        //grupo H

        Equipo portugal = new Equipo("portugal");
        Equipo corea_del_sur = new Equipo("corea_del_sur");
        Equipo uruguay = new Equipo("uruguay");
        Equipo ghana = new Equipo("ghana");
        EtapaMundial grupoA = new Grupo();
        grupoA.setDescripcionEtapa("grupo a");
        grupoA.addPartido(new Partido(new Date(), catar,ecuador,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), paises_bajos,senegal,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), catar,paises_bajos,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), ecuador,senegal,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), senegal,catar,new Resultado()));
        grupoA.addPartido(new Partido(new Date(), paises_bajos,ecuador,new Resultado()));

        EtapaMundial grupoB = new Grupo();
        grupoB.setDescripcionEtapa("grupo b");
        grupoB.addPartido(new Partido(new Date(), iran,eeuu,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), gales,inglaterra,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), eeuu,inglaterra,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), iran,gales,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), eeuu,gales,new Resultado()));
        grupoB.addPartido(new Partido(new Date(), inglaterra,iran,new Resultado()));

        EtapaMundial grupoC = new Grupo();
        grupoC.setDescripcionEtapa("grupo c");
        grupoC.addPartido(new Partido(new Date(), argentina,arabia_saudita,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), polonia,mexico,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), argentina,mexico,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), arabia_saudita,polonia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), argentina,polonia,new Resultado()));
        grupoC.addPartido(new Partido(new Date(), arabia_saudita,mexico,new Resultado()));

        EtapaMundial grupoD = new Grupo();
        grupoD.setDescripcionEtapa("grupo d");
        grupoD.addPartido(new Partido(new Date(), francia,australia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), dinamrca,tunez,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), dinamrca,francia,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), australia,tunez,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), francia,tunez,new Resultado()));
        grupoD.addPartido(new Partido(new Date(), dinamrca,australia,new Resultado()));

        EtapaMundial grupoE = new Grupo();
        grupoE.setDescripcionEtapa("grupo e");
        grupoE.addPartido(new Partido(new Date(), japon,españa,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), costa_rica,alemania,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), españa,costa_rica,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), japon,alemania,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), costa_rica,japon,new Resultado()));
        grupoE.addPartido(new Partido(new Date(), españa,alemania,new Resultado()));

        EtapaMundial grupoF = new Grupo();
        grupoF.setDescripcionEtapa("grupo f");
        grupoF.addPartido(new Partido(new Date(), marruecos, croacia, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), canada, belgica, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), canada, marruecos, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), croacia, belgica, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), croacia, canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(), marruecos, belgica, new Resultado()));

        EtapaMundial grupoG = new Grupo();
        grupoG.setDescripcionEtapa("grupo g");
        grupoG.addPartido(new Partido(new Date(), brasil, suiza, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), serbia, camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), serbia, brasil, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), suiza, camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), camerun, brasil, new Resultado()));
        grupoG.addPartido(new Partido(new Date(), suiza, serbia, new Resultado()));

        EtapaMundial grupoH = new Grupo();
        grupoH.setDescripcionEtapa("grupo h");
        grupoH.addPartido(new Partido(new Date(), portugal, uruguay, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), corea_del_sur, ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), corea_del_sur, portugal, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), ghana, uruguay, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), portugal, ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(), corea_del_sur, uruguay, new Resultado()));


        ArrayList<Equipo> primerosGrupoA = grupoA.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoB = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoC = grupoC.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoD = grupoD.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoE = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoF = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoG = grupoE.getEquiposQueAvanzan();
        ArrayList<Equipo> primerosGrupoH = grupoE.getEquiposQueAvanzan();


        EtapaMundial octavosFinal = new Llave();
        octavosFinal.setDescripcionEtapa("octavos de final");
        octavosFinal.addPartido(new Partido(new Date(), primerosGrupoA.get(0),primerosGrupoC.get(1), new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoD.get(0),primerosGrupoE.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoC.get(0),primerosGrupoD.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoE.get(0),primerosGrupoC.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoC.get(0),primerosGrupoA.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoB.get(0),primerosGrupoA.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoD.get(0),primerosGrupoC.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoF.get(0),primerosGrupoE.get(1),new Resultado()));
        octavosFinal.addPartido(new Partido(new Date(),primerosGrupoH.get(0),primerosGrupoG.get(1),new Resultado()));

        System.out.println("\n Los equipos que pasan a octavos de final son: \n ");
        for (int i=0 ; i<primerosGrupoA.size() ; i++){
            System.out.println(primerosGrupoA.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoB.size() ; i++){
            System.out.println(primerosGrupoB.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoC.size() ; i++){
            System.out.println(primerosGrupoC.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoD.size() ; i++){
            System.out.println(primerosGrupoD.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoE.size() ; i++){
            System.out.println(primerosGrupoE.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoF.size() ; i++){
            System.out.println(primerosGrupoF.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoG.size() ; i++){
            System.out.println(primerosGrupoG.get(i).getNombre());
        }

        for (int i=0 ; i<primerosGrupoH.size() ; i++){
            System.out.println(primerosGrupoH.get(i).getNombre());
        }

        EtapaMundial cuartosDeFinal = new Llave();
        cuartosDeFinal.setDescripcionEtapa("cuartos de final");
        ArrayList<Equipo> pasanDeOctavos = octavosFinal.getEquiposQueAvanzan();

        System.out.println("\n Los equipos que pasan a cuartos de final son: \n ");
        for (int i=0 ; i<pasanDeOctavos.size() ; i++){
            System.out.println(pasanDeOctavos.get(i).getNombre());
        }

        cuartosDeFinal.addPartido(new Partido(new Date(),pasanDeOctavos.get(0),pasanDeOctavos.get(2),new Resultado()));
        cuartosDeFinal.addPartido(new Partido(new Date(),pasanDeOctavos.get(1),pasanDeOctavos.get(3),new Resultado()));
        cuartosDeFinal.addPartido(new Partido(new Date(),pasanDeOctavos.get(4),pasanDeOctavos.get(6),new Resultado()));
        cuartosDeFinal.addPartido(new Partido(new Date(),pasanDeOctavos.get(5),pasanDeOctavos.get(7),new Resultado()));


        ArrayList<Equipo> pasanDeCuartos = cuartosDeFinal.getEquiposQueAvanzan();

        System.out.println("\nLos equipos que pasan a la semifinal son: \n ");

        for (int i=0 ; i<pasanDeCuartos.size() ; i++){
            System.out.println(pasanDeCuartos.get(i).getNombre());
        }

        EtapaMundial semiFinal = new Llave();
        semiFinal.setDescripcionEtapa("semi Final");

        semiFinal.addPartido(new Partido(new Date(),pasanDeCuartos.get(0),pasanDeCuartos.get(2),new Resultado()));
        semiFinal.addPartido(new Partido(new Date(),pasanDeCuartos.get(1),pasanDeCuartos.get(3),new Resultado()));

        // FINAL
        ArrayList<Equipo> pasanDeSemifinal = semiFinal.getEquiposQueAvanzan();

        System.out.println("\n Los equipos que pasan a la final son: ");

        for (int i=0 ; i<pasanDeSemifinal.size() ; i++){
            System.out.println(pasanDeSemifinal.get(i).getNombre());
        }

        EtapaMundial partidoFinal = new Llave();
        partidoFinal.setDescripcionEtapa("final");

        partidoFinal.addPartido(new Partido(new Date(),pasanDeSemifinal.get(0),pasanDeSemifinal.get(1),new Resultado()));

        // Ganador del mundial
        ArrayList<Equipo> ganador = partidoFinal.getEquiposQueAvanzan();
        System.out.println("\n El campeón del mundial Catar 2022 es " + ganador.get(0).getNombre());
    }

}