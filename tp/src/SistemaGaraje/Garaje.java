package SistemaGaraje;

import Vehiculos.Auto;
import Vehiculos.Moto;

import java.util.ArrayList;

public class Garaje {
    private double precioRueda;
    private int capacidadMaxima;
    private int capacidadActualAuto=0;
    private int capacidadActualMoto=0;
    private boolean lleno;
    private double mediaKM;
    private ArrayList<Auto>autos;
    private ArrayList<Moto>motos;

    public Garaje(double precioRueda, int capacidadMaxima) {
        setPrecioRueda(precioRueda);
        setCapacidadMaxima(capacidadMaxima);
    }
public Garaje(double precioRueda, int capacidadMaxima, int capacidadActualAuto, int capacidadActualMoto){
setPrecioRueda(precioRueda);
setCapacidadMaxima(capacidadMaxima);
setCapacidadActualAuto(capacidadActualAuto);
setCapacidadActualMoto(capacidadActualMoto);
}
    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }


    public int getCapacidadActualAuto() {
        return capacidadActualAuto;
    }

    public void setCapacidadActualAuto(int capacidadActualAuto) {
        this.capacidadActualAuto = capacidadActualAuto;
    }

    public int getCapacidadActualMoto() {
        return capacidadActualMoto;
    }

    public void setCapacidadActualMoto(int capacidadActualMoto) {
        this.capacidadActualMoto = capacidadActualMoto;
    }

    public boolean isLleno() {
        if (capacidadActualAuto + capacidadActualMoto == capacidadMaxima) {
            return lleno;
        }
        return false;
    }
    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public double getMediaKM() {
        return mediaKM;
    }

    public void setMediaKM(double mediaKM) {
        this.mediaKM = mediaKM;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public ArrayList<Moto> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Moto> motos) {
        this.motos = motos;
    }
}
