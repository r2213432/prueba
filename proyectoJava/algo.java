package proyectoJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class algo {
    static Random random = new Random();
    public static Personaje crear_personaje(String nombre){
        Personaje p = new Personaje(nombre,random.nextInt(20), random.nextInt(10), random.nextInt(7));
        return p;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Random random = new Random();
        ArrayList<Personaje> Jugadores = new ArrayList<>();
        System.out.println("Intrduce el numero de jugadores(2 minimo): ");
        int n_jugadores;
        do {
            n_jugadores = entrada.nextInt();
        } while (n_jugadores<=1);
        for(int i = 0; i<=n_jugadores-1;i++){
            String jugador = "Jugador"+i;
            System.out.println("Que el jugador "+i+" elija su nombre de personaje: ");
            String nombre = entrada.nextLine();
            Jugadores.add(crear_personaje(nombre));
            
            //if (eleccion.equals("luchador")) {
                //Luchador luchador = new Luchador(nombre, random.nextInt(8), random.nextInt(20), random.nextInt(10), random.nextInt(7));
                
            //}
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
