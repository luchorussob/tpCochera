package Mundial;

import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private int resultado;

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public Partido(Date fecha, Equipo local, Equipo visitante){
        this.fecha=fecha;
        this.local=local;
        this.visitante=visitante;
    }
    public Partido(Date fecha, Equipo local, Equipo visitante, int resultado){
        this.fecha=fecha;
        this.local=local;
        this.visitante=visitante;
        this.resultado=resultado;
    }
}
