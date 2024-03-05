
package proyectoJava;

import java.util.Random;

public class Personaje {
    private int maxVida;
    private int nivel;
    private String nombre;
    private int vida;
    private int ataque;
    private int armadura;
    private static Random random = new Random();
    public int getMaxVida() {
        return maxVida;
    }
    public int getNivel() {
        return nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public int getArmadura() {
        return armadura;
    }
    public int getAtaque() {
        return ataque;
    }
    public Personaje(){
        this.nombre = "";
        this.maxVida = 0;
        this.vida = 0;
        this.ataque = 0;
        this.armadura= 0;
        this.nivel = 0;
    }
    public Personaje(String nombre, int vida, int ataque, int armor, int nivel, int maxVida){
        this.nombre = nombre;
        this.vida = vida;
        this.maxVida = maxVida;
        this.ataque= ataque;
        this.armadura = armor;
        this.nivel = nivel;
    }
    public Personaje(Personaje p){
        this.nombre = p.nombre;
        this.vida = p.vida;
        this.maxVida = p.maxVida;
        this.ataque = p.ataque;
        this.armadura = p.armadura;
        this.nivel = p.nivel;
    }
    //equals
    public boolean equals(Personaje p){
        return (this.maxVida == p.maxVida & this.ataque == p.ataque & this.armadura == p.armadura & this.nivel == p.nivel);
    }
    // to string
    @Override
    public String toString(){
        return this.nombre+": "+"vida: "+this.vida+", ataque: "+this.ataque+", armadura: "+this.armadura;
    }
    //Metodos
    public int daño(){
        return this.ataque;
    }

    public void atacar(Personaje p){
        if (p.vida <=0) {
            System.out.println("El personaje "+p.nombre+" esta muerto");
            
        }
        int x =this.daño();
        if(x>0){
            System.out.println(this.nombre+" ha atacado a "+p.nombre+" y le ha hecho "+x+" de daño");
            p.vida -= x; //le resto el daño a la vida
            if (p.muerto()){
                System.out.println(p.nombre+" no ha podido soportar el ataque y ha muerto");
            }
        } else{
            System.out.println("El daño ha sido totalmente reducido o anulado");
        }
    }
    public boolean muerto(){
        return (this.vida<=0);
    }
    public void curar(){
        this.vida += random.nextInt(this.maxVida);
    }
    public void subirNivel(){
        this.nivel++;
        this.maxVida++;
        this.ataque++;
    }


}
