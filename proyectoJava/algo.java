package proyectoJava;
public class algo {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Personaje1", 10, 7, 7);
        Luchador luchador = new Luchador("luchador1", 2, 11, 10, 7 );
        Mago mago = new Mago("mago1", 2,8,8,5);
        /*while (!yo.muerto() || !luchador.muerto() || !mago.muerto()) {
            yo.atacar(luchador);
            luchador.atacar(mago);
            mago.atacar(yo);
        }*/
        System.out.println(personaje.muerto());
        personaje.atacar(luchador);
        System.out.println(luchador.getVida());
    }
    
    
}
