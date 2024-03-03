//Forfait

package Estacion_ski;
public class Forfait {
    private int dEmpieza;
    private int dAcaba;
    public int getdAcaba() {
        return dAcaba;
    }
    public int getdEmpieza() {
        return dEmpieza;
    }
    //Constructors
    public Forfait(){
        this.dEmpieza = 0;
        this.dAcaba = 0;
    }
    public Forfait(int e, int a){
        this.dEmpieza = e;
        this.dAcaba = a;
    }
    public Forfait(Forfait f){
        this.dEmpieza = f.dEmpieza;
        this.dAcaba = f.dAcaba;
    }
    //Metodos
    public void cobro(){

    }
    public void devolucion(){
        
    }
}