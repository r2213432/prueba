//Tipo
package Estacion_ski;
public class Telesilla extends Movilidad {
    private int n_sillas;
    private int n_asientos;
    private int n_pilares;
    public int getN_asientos() {
        return n_asientos;
    }
    public int getN_pilares() {
        return n_pilares;
    }public int getN_sillas() {
        return n_sillas;
    }
    //Constructors
    public Telesilla(){
        super();
        this.n_sillas = 0;
        this.n_asientos = 0;
        this.n_pilares = 0;
    }
    public Telesilla(Movilidad m, int s, int a, int p){
        super(m);
        this.n_sillas = s;
        this.n_asientos = a;
        this.n_pilares = p; 
    }
    public Telesilla(Telesilla t){
        this.n_asientos = t.n_asientos;
        this.n_pilares = t.n_pilares;
        this.n_sillas = t.n_sillas;
    }
}