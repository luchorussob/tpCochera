package Mundial;
import java.util.ArrayList;
import java.util.Date;
public class Resultado {
    private int golesLocal;
    private int golesVisita;

    public Resultado(int golesLocal, int golesVisita){
        this.golesVisita=golesVisita;
        this.golesLocal=golesLocal;
    }

    public Resultado(){
        this.golesVisita=(int)(Math.random()*7);
        this.golesLocal=(int)(Math.random()*7);
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisita() {
        return golesVisita;
    }

    public boolean ganoLocal() {
        if (golesLocal>golesVisita){
            return true;
        }else{
            return false;
        }
    }
    public boolean empate() {
        if (golesVisita==golesLocal){
            return true;
            }else{
                return false;
            }
        }
}
