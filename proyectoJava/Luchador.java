//voy a poner aqui todos los comandos que me encuentre
package proyectoJava;
public class Luchador extends Personaje{
    private int fuerza;
    public int getFuerza() {
        return fuerza;
    }
    public Luchador(){
        super();
        this.fuerza = 0;
    }
    public Luchador(String nombre, int fuerza, int vida, int ataque, int armadura){
        super(nombre, vida, ataque, armadura);
        this.fuerza = fuerza;
    }
    public Luchador(Luchador l){
        super(l);
        this.fuerza = l.fuerza;
    }
    @Override
    public void atacar(Personaje p){
        
    }
    
    public int daño(){
        return (this.getAtaque()+this.fuerza);
    }

}