//Senior
package Estacion_ski;
public class Senior extends Forfait{
    final private double descuento = 40;
    private String dni;
    public double getDescuento() {
        return descuento;
    }
    public String getDni() {
        return dni;
    }
    //Constructors
    public Senior(){
        super();
        this.dni = "";
    }
    public Senior(Forfait f, String d){
        super(f);
        this.dni = d;
    }
    public Senior(Senior s){
        this.dni = s.dni;
    }
}