//Identificativo
package Estacion_ski;
public class Cinta extends Movilidad {
    private String fabricante;
    private boolean cubierta;
    public String getFabricante() {
        return fabricante;
    }
    public boolean getCubierta(){
        return cubierta;
    }
    //Constructors
    public Cinta(){
        super();
        this.fabricante = "";
        this.cubierta = false;
    }
    public Cinta(String f, boolean c, Movilidad m){
        super(m);
        this.fabricante = f;
        this.cubierta = c;
    }
    public Cinta(Cinta c){
        super();
        this.fabricante = c.fabricante;
        this.cubierta = c.cubierta;
    }
    //equals
    //toString
}