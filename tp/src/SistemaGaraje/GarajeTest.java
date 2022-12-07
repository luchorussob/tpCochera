package SistemaGaraje;

public class GarajeTest extends Garaje{
    public GarajeTest(double precioRueda, int capacidadMaxima){
        super(precioRueda,capacidadMaxima);
    }
    public GarajeTest(double precioRueda, int capacidadMaxima, int capacidadActualAuto, int capacidadActualMoto){
        super(precioRueda,capacidadMaxima,capacidadActualAuto,capacidadActualMoto);
    }
}
