//Mago
package proyectoJava;
public class Mago extends Personaje {
    private int inteligencia;
    public int getInteligencia() {
        return inteligencia;
    }
    public Mago(){
        super();
        this.inteligencia = 0;
    }
    public Mago(int inteligencia, int vida, int ataque, int armadura){
        super(vida, ataque, armadura);
        this. inteligencia = inteligencia;
    }
    public Mago(Mago m){
        super(m);
        this.inteligencia = m.inteligencia;
    }
    //equals
    public boolean equals(Mago m) {
        return (super.equals(m) && this.inteligencia== m.inteligencia);
    }
}



