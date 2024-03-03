//Movilidad 
package  Estacion_ski;
public class Remonte extends Movilidad{
    private int perchas;
    private double desnivel;
    public int getPerchas() {
        return perchas;
    }
    public double getDesnivel() {
        return desnivel;
    }
    public Remonte(){
        super();
        this.perchas = 0;
        this.desnivel = 0;
    } 
    public Remonte(Movilidad m, int p, double d){
        super(m);
        this.perchas = p;
        this.desnivel = d;
    }
    //equals
    //toString
}