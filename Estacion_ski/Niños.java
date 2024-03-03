//niños
package Estacion_ski;
public class Niños extends Forfait{
    final private int precio = 0;
    private String nombre;
    private int numero;
    public int getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    //Constructor
    public Niños(){
        super();
        this.nombre = "";
        this.numero = 0;
    } 
    public Niños(Forfait f, String n, int num){
        super(f);
        this.nombre = n;
        this.numero = num;
    }
    public Niños(Niños n){
        super();
        this.nombre = n.nombre;
        this.numero = n.numero;
    }
    //Metodos
}