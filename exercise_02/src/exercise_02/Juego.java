package exercise_02;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    private Jugador jugador = new Jugador();


    public Juego() {
       jugadores = new ArrayList();
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }


    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public void cargaDeJugadores() {
        int resp2 = 0;
        do {
            System.out.println("Cuantos jugadores desean jugar?");
            resp2 = entrada.nextInt();
            if (resp2 > 6 || resp2 < 2) {
                System.out.println("El mínimo es 2 y no se pueden agregar más de 6 jugadores.");
            }
        } while (resp2 > 6 || resp2 < 2);

        for (int i = 1; i < resp2+1; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            jugador = new Jugador();
            jugador.setNombre(entrada.next() + i);
            jugador.setId(i);
            llenarJuego(jugador);
        }

    }

    public void llenarJuego(Jugador jugador) {
        jugadores.add(jugador);
        this.revolver = new RevolverDeAgua();
    }

    public void ronda() {
        revolver.llenarRevolver();
        boolean seDisparó = false;
        for (Jugador jugador : jugadores) {
                seDisparó = jugador.disparo(revolver);
                if (seDisparó == false) {
                    System.out.println("El jugador: " + jugador.getNombre() + " se salvó.");
                } else {
                    System.out.println("El jugador: " + jugador.getNombre() + " PERDIÓ.");
                    break;
                }
        }
    }

    public void verJugadores(){
        for (Jugador jugadores: jugadores) {
            System.out.println(jugadores);
        }
    }


}








