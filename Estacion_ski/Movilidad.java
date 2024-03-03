//Movilidad
package Estacion_ski;
public class Movilidad {
    private String idInicio;
    private String idFinal;
    private int distRecorrida;
    public String getIdInicio() {
        return idInicio;
    }
    public String getIdFinal() {
        return idFinal;
    }
    public int getDistRecorrida() {
        return distRecorrida;
    }
    //Constructor
    public Movilidad(){
        this.idInicio = "";
        this.idFinal = "";
        this.distRecorrida = 0;
    }
    public Movilidad(String i, String f, int d){
        this.idInicio = i;
        this.idFinal = f;
        this.distRecorrida = d;
    }
    public Movilidad(Movilidad m){
        this.idInicio = m.idInicio;
        this.idFinal = m.idFinal;
        this.distRecorrida = m.distRecorrida;
    }
}