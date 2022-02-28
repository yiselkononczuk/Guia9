package Ejercicio2;

import java.util.ArrayList;
import static java.util.Locale.US;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private RevolverDeAgua revolverDeAgua;

    public Juego() {
        this.revolverDeAgua = new RevolverDeAgua();
        this.revolverDeAgua.llenarRevolver();
        this.crearJugador();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolverDeAgua() {
        return this.revolverDeAgua;
    }

    public void setRevolverDeAgua(RevolverDeAgua RevolverDeAgua) {
        this.revolverDeAgua = RevolverDeAgua;
    }

    public void crearJugador() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese la cantidad de jugadores, entre 1 y 6");
        int cantJugadores = leer.nextInt();
        if (cantJugadores > 6) {
            cantJugadores = 6;
        }

        for (int i = 1; i <= cantJugadores; i++) {
            jugadores.add(new Jugador(i)); // aca cree jugadores
        }
    }

    public void ronda() {
        boolean bandera = false;
        do {
            for (Jugador jugador : jugadores) {

                if (jugador.disparo(this.revolverDeAgua) == true) {

                    System.out.println("El " + jugador.getNombre() + " se mojo");
                    System.out.println("Fin del Juego.");
                    bandera = true;
                    break;
                }
            }
            System.out.println("NUEVA RONDA");
        } while (bandera == false);
    }

}
