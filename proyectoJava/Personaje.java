package proyectoJava;

public class Personaje {
    private int vida;
    private int ataque;
    private int armadura;
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
        this.vida = 0;
        this.ataque = 0;
        this.armadura= 0;
    }
    public Personaje(int v, int a, int armor){
        this.vida = v;
        this.ataque= a;
        this.armadura = armor;
    }
    public Personaje(Personaje p){
        this.vida = p.vida;
        this.ataque = p.ataque;
        this.armadura = p.armadura;
    }
    //equals
    public boolean equals(Personaje p){
        return (this.vida == p.vida & this.ataque == p.ataque & this.armadura == p.armadura);
    }
    // to string
    public String toString(){
        return "El personaje";
    }
    //Metodos
    public void atacar(Personaje p){
        int x =(this.ataque- p.armadura);
        if(x>0){
            System.out.println(this.toString()+"ha atacado a "+p.toString()+" y le ha hecho "+x+" de daño");
            p.vida -= x; //le resto el daño a la vida
            if (p.muerto()){
                System.out.println(p+" no ha podido soportar el ataque y ha muerto");
            }
        } else{
            System.out.println("El daño ha sido totalmente reducido o anulado");
        }
    }
    public boolean muerto(){
        return (this.vida<=0);
    }

}
