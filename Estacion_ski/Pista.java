//Pista
package Estacion_ski;
public class Pista {
    //Propiedades
    private String tipo;
    private String identificativo;
    private double cotaInf;
    private double cotaSup;  
    private int distancia_esquiable;
    //Getters y Setters
    public String getTipo() {
        return tipo;
    }
    public String getIdentificativo() {
        return identificativo;
    }
    public double getCotaInf() {
        return cotaInf;
    }
    public double getCotaSup() {
        return cotaSup;
    }
    public int getDistancia_esquiable() {
        return distancia_esquiable;
    }
    //Constructors
    public Pista(){
        this.tipo = "";
        this.identificativo = "";
        this.cotaInf = 0;
        this.cotaSup = 0;
        this.distancia_esquiable = 0;
    }
    public Pista(String tipo, String id, double i, double s, int d){
        this.tipo = tipo;
        this.identificativo = id;
        this.cotaInf = i;
        this.cotaSup = s;
        this.distancia_esquiable = d;
    }
    public Pista(Pista p){
        this.tipo = p.tipo;
        this.identificativo = p.identificativo;
        this.cotaInf = p.cotaInf;
        this.cotaSup = p.cotaSup;
        this.distancia_esquiable = p.distancia_esquiable;
    }
    //equals
    
    //toString
    @Override
    public String toString(){
        return "La pista "+this.tipo+"con el id:"+this.tipo+" tiene una cota inferior de "+this.cotaInf+" y superior de "+this.cotaSup+" con una distancia esquiable de "+this.distancia_esquiable+"m";
    }
    
}   