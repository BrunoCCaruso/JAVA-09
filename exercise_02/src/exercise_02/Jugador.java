package exercise_02;


import java.util.Locale;
import java.util.Scanner;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;


    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua r) {

        if (r.mojar()) {
            this.mojado = true;
            return true;
        } else {
            this.mojado = false;
            r.siguienteChorro();
            return false;
        }

    }


    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);


    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                '}';
    }
}
