package proyectoJava;
public class algo {
    public static void main(String[] args) {
        Personaje yo = new Personaje(10, 10, 10);
        Luchador luchador = new Luchador(2, 11, 10, 7 );
        Mago mago = new Mago(2,8,1,1);
        /*while (!yo.muerto() || !luchador.muerto() || !mago.muerto()) {
            yo.atacar(luchador);
            luchador.atacar(mago);
            mago.atacar(yo);
        }*/
        System.out.println(yo.muerto());
        yo.atacar(luchador);
        System.err.println(luchador.getVida());
    }
    
    
}
