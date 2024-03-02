package proyectoJava;

import java.util.Random;
import java.util.Scanner;

public class algo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Intrduce el numero de jugadores(2 minimo): ");
        int n_jugadores;
        do {
            n_jugadores = entrada.nextInt();
        } while (n_jugadores<=1);
        for(int i = 1; i<=n_jugadores;i++){
            String nombre = "Jugador"+i;
            System.out.println("Que el jugador "+i+" elija su clase de personaje (luchador, mago o estandar):");
            String eleccion = entrada.nextLine();
            if (eleccion.equals("luchador")) {
                Luchador luchador = new Luchador(nombre, random.nextInt(8), random.nextInt(20), random.nextInt(10), random.nextInt(7));
                
            }
        }

        Personaje personaje = new Personaje("Personaje1", 10, 7, 4);
        Luchador luchador = new Luchador("luchador1", 2, 11, 10, 5 );
        Mago mago = new Mago("mago1", 2,8,8,3);
        /*while (!yo.muerto() || !luchador.muerto() || !mago.muerto()) {
            yo.atacar(luchador);
            luchador.atacar(mago);
            mago.atacar(yo);
        }*/
        System.out.println(personaje.muerto());
        personaje.atacar(luchador);
        System.out.println(luchador.getVida());
        personaje.atacar(luchador);
        personaje.atacar(luchador);
        personaje.atacar(luchador);
        personaje.atacar(luchador);
        personaje.atacar(luchador);
        personaje.atacar(luchador);
        personaje.atacar(luchador);
    }
    
    
}
